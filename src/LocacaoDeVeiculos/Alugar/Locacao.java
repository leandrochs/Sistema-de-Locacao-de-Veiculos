package LocacaoDeVeiculos.Alugar;

import BancoDeDados.BancoDeDadosClientes;
import BancoDeDados.BancoDeDadosLocacoes;
import BancoDeDados.BancoDeDadosVeiculos;
import Clientes.Cliente;
import Veiculos.Veiculo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Locacao {
    public static void iniciarLocacao(Scanner scanner) {

        apresentarVeiculosDisponiveis();
        Veiculo veiculoEscolhido = escolherVeiculo(scanner);
        if (veiculoEscolhido == null) {
            System.out.println("Veiculo não encontrado, Operação cancelada");
            return;
        }
        apresentarClientes();
        Cliente clienteEscolhido = escolherCliente(scanner);
        LocalDate dataDevolucao = escolherDataDevolucao(scanner);
        if (dataDevolucao == null) {
            System.out.println("Data de devolução invalidada. Operação cancelada");
            return;
        }

        double valorLocacao = calcularValorLocacao(veiculoEscolhido, dataDevolucao);
        System.out.println("O valor total da locação é: " + valorLocacao);

        if (!confirmarLocacao(scanner, veiculoEscolhido, clienteEscolhido, dataDevolucao, valorLocacao)) {
            System.out.println("Locação cancelada.");
            return;
        }
        criarLocacao(veiculoEscolhido, clienteEscolhido, dataDevolucao, valorLocacao);
    }

    private static double calcularValorLocacao(Veiculo veiculoEscolhido, LocalDate dataDevolucao) {
        LocalDate dataAtual = LocalDate.now();

        long diasLocacao = ChronoUnit.DAYS.between(dataAtual, dataDevolucao);

        if (diasLocacao == 0) {
            return veiculoEscolhido.getValorDiaria();
        }

        return veiculoEscolhido.getValorDiaria() * (diasLocacao + 1);
    }

    private static void apresentarVeiculosDisponiveis() {
        BancoDeDadosVeiculos.imprimirVeiculosDisponiveis();
    }

    private static Veiculo escolherVeiculo(Scanner scanner) {
        Veiculo veiculoEscolhido = null;

        while (veiculoEscolhido == null) {
            System.out.println("Digite a placa do veículo para locação:");
            String placaDigitada = scanner.next();

            for (Veiculo veiculoDaLista : BancoDeDadosVeiculos.listaVeiculos) {
                if (veiculoDaLista.getPlaca().equals(placaDigitada)) {
                    if (!veiculoDaLista.disponibilidade) {
                        System.out.println("Veículo não está disponível para locação: " + placaDigitada + ".");
                        break;
                    } else {
                        veiculoEscolhido = veiculoDaLista;
                        break;
                    }
                }
            }
        }
        System.out.println(veiculoEscolhido + "\n");
        return veiculoEscolhido;
    }

    private static void apresentarClientes() {
        BancoDeDadosClientes.imprimirClientes();
    }

    private static Cliente escolherCliente(Scanner scanner) {
        System.out.println("Digite o CPF/CNPJ (idNumber) do cliente:");

        String idNumberDigitado = scanner.next();
        Cliente clienteEscolhido = null;

        for (Cliente clienteDaLista : BancoDeDadosClientes.listaClientes) {
            if (clienteDaLista.getIdNumber().equals(idNumberDigitado)) {
                clienteEscolhido = clienteDaLista;
                break;
            }
        }
        System.out.println(clienteEscolhido + "\n");
        return clienteEscolhido;
    }

    private static LocalDate escolherDataDevolucao(Scanner scanner) {
        System.out.println("Digite a data de devolução (dd/MM/yyyy):");
        String dataDigitada = scanner.next();


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataDevolucao = LocalDate.parse(dataDigitada, formatter);

        System.out.println("Data de devolução escolhida: " + dataDevolucao.format(formatter));
        return dataDevolucao;
    }

    private static boolean confirmarLocacao(Scanner scanner, Veiculo veiculo, Cliente cliente, LocalDate dataDevolucao, double valorLocacao) {
        System.out.println("===== Confirmação da Locação =====");
        System.out.println("Veículo: " + veiculo);
        System.out.println("Cliente: " + cliente);
        System.out.println("Data de devolução: " + dataDevolucao);
        System.out.println("Valor total da locação:" + valorLocacao);
        System.out.println("Confirmar locação? (S/N)");

        String resposta = scanner.next().trim().toUpperCase();

        return resposta.equals("S");
    }

    private static void criarLocacao(Veiculo veiculoEscolhido, Cliente clienteEscolhido, LocalDate dataDevolucao, double valorLocacao) {
        LocalDate dataAtual = LocalDate.now();

        atualizarDisponibilidade(veiculoEscolhido);

        LocacaoRegistro novaLocacao = new LocacaoRegistro(veiculoEscolhido, clienteEscolhido, dataAtual, dataDevolucao, valorLocacao);
        BancoDeDadosLocacoes.adicionarLocacao(novaLocacao);

        System.out.println("Locação registrada com sucesso!");
        BancoDeDadosLocacoes.imprimeUltimaLocacao();
    }

    private static void atualizarDisponibilidade(Veiculo veiculoEscolhido) {
        veiculoEscolhido.setDisponibilidade(false);
    }

}
