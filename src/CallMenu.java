import BancoDeDados.BancoDeDadosClientes;
import BancoDeDados.BancoDeDadosVeiculos;
import Clientes.CriarCliente;
import LocacaoDeVeiculos.Alugar.Locacao;
import LocacaoDeVeiculos.Devolver.Devolucao;
import Utils.MensagensErro;
import Veiculos.CriarVeiculo;
import Utils.Utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CallMenu {
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            try {
            System.out.println("\n===== Sistema de Locação de Veículos =====");
            System.out.println("\n ** Gerenciar Veículos **");
            System.out.println("1) Cadastrar veículo");
            System.out.println("2) Listar todos veículos");
            System.out.println("3) Listar veículos disponíveis");
            System.out.println("4) Listar veículos alugados");
            System.out.println("5) Listar veículos de luxo");

            System.out.println("\n ** Gerenciar Clientes **");
            System.out.println("6) Cadastrar cliente");
            System.out.println("7) Listar clientes");

            System.out.println("\n ** Locação de Veículos **");
            System.out.println("8) Alugar veículo");
            System.out.println("9) Devolver veículo");

            System.out.println("\n ** Finalizar **");
            System.out.println("0) Sair do sistema");

            System.out.print("\nDigite a opção desejada: ");
            option = scanner.nextInt();

                switch (option) {
                    case 1:
                        System.out.println("Opção 1: Cadastrar veículo");
                        CriarVeiculo.cadastrarVeiculo();
                        break;
                    case 2:
                        System.out.println("Opção 2: Listar todos veículos");
                        BancoDeDadosVeiculos.imprimirTodosVeiculos();
                        Utils.tecleParaVoltar();
                        break;
                    case 3:
                        System.out.println("Opção 3: Listar veículos disponíveis");
                        BancoDeDadosVeiculos.imprimirVeiculosDisponiveis();
                        Utils.tecleParaVoltar();
                        break;
                    case 4:
                        System.out.println("Opção 4: Listar veículos alugados");
                        BancoDeDadosVeiculos.imprimirVeiculosAlugados();
                        Utils.tecleParaVoltar();
                        break;
                    case 5:
                        System.out.println("Opção 5: Listar veículos de luxo");
                        BancoDeDadosVeiculos.imprimirVeiculosDeLuxo();
                        Utils.tecleParaVoltar();
                        break;
                    case 6:
                        System.out.println("Opção 6: Cadastrar cliente");
                        CriarCliente.cadastrarCliente();
                        Utils.tecleParaVoltar();
                        break;
                    case 7:
                        System.out.println("Opção 7: Listar clientes");
                        BancoDeDadosClientes.imprimirClientes();
                        Utils.tecleParaVoltar();
                        break;
                    case 8:
                        System.out.println("Opção 8: Alugar veículo");
                        Locacao.iniciarLocacao(scanner);
                        Utils.tecleParaVoltar();
                        break;
                    case 9:
                        System.out.println("Opção 9: Devolver veículo");
                        Devolucao.devolverLocacao();
                        Utils.tecleParaVoltar();
                        break;
                    case 0:
                        System.out.println("Saindo do sistema...");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println(MensagensErro.ENTRADA_INVALIDA.getMensagem());
                scanner.nextLine();
                option = -1;
            } catch (Exception e) {
                System.out.println("Erro inesperado: " + e.getMessage());
                option = -1;
            }
        } while (option != 0);

        scanner.close();
    }
}