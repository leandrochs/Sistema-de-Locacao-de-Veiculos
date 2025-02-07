package LocacaoDeVeiculos.Alugar;

import BancoDeDados.BancoDeDadosClientes;
import BancoDeDados.BancoDeDadosLocacoes;
import BancoDeDados.BancoDeDadosVeiculos;
import Clientes.Cliente;
import LocacaoDeVeiculos.LocacaoRegistro;
import Veiculos.Veiculo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Locacao {
    public static void iniciarLocacao(Scanner scanner) {

        apresentarVeiculosDisponiveis();
        Veiculo veiculoEscolhido = escolherVeiculo(scanner);
        apresentarClientes();
        Cliente clienteEscolhido = escolherCliente(scanner);
        LocalDate dataDevolucao = escolherDataDevolucao(scanner);
        if (!confirmarLocacao(scanner, veiculoEscolhido, clienteEscolhido, dataDevolucao)) {
            System.out.println("Locação cancelada.");
            return;
        }
        criarLocacao(veiculoEscolhido, clienteEscolhido, dataDevolucao);
    }


    private static void apresentarVeiculosDisponiveis() {
        BancoDeDadosVeiculos.imprimirVeiculosDisponiveis();
    }

    private static Veiculo escolherVeiculo(Scanner scanner) {
        System.out.println("Digite a placa do veículo para locação:");

        String placaDigitada = scanner.next();
        Veiculo veiculoEscolhido = null;

        for (Veiculo veiculoDaLista : BancoDeDadosVeiculos.listaVeiculos) {
            if (veiculoDaLista.getPlaca().equals(placaDigitada)) {
                veiculoEscolhido = veiculoDaLista;
                break;
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

    private static boolean confirmarLocacao(Scanner scanner, Veiculo veiculo, Cliente cliente, LocalDate dataDevolucao) {
        System.out.println("===== Confirmação da Locação =====");
        System.out.println("Veículo: " + veiculo);
        System.out.println("Cliente: " + cliente);
        System.out.println("Data de devolução: " + dataDevolucao);
        System.out.println("Confirmar locação? (S/N)");

        String resposta = scanner.next().trim().toUpperCase();

        return resposta.equals("S");
    }

    private static void criarLocacao(Veiculo veiculoEscolhido, Cliente clienteEscolhido, LocalDate dataDevolucao) {
        LocalDate dataAtual = LocalDate.now();

        atualizarDisponibilidade(veiculoEscolhido);

        LocacaoRegistro novaLocacao = new LocacaoRegistro(veiculoEscolhido, clienteEscolhido, dataAtual, dataDevolucao);
        BancoDeDadosLocacoes.adicionarLocacao(novaLocacao);

        System.out.println("Locação registrada com sucesso!");
        BancoDeDadosLocacoes.imprimeUltimaLocacao();
    }

    private static void atualizarDisponibilidade(Veiculo veiculoEscolhido) {
        veiculoEscolhido.setDisponibilidade(false);
    }

}
