import BancoDeDados.BancoDeDadosClientes;
import BancoDeDados.BancoDeDadosVeiculos;
import Clientes.CriarCliente;
import Veiculos.CriarVeiculo;

import java.util.Scanner;

public class CallMenu {
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\nMenu do Sistema de Locação de Veículos");
            System.out.println("\n * Gerenciar Veículos");
            System.out.println("1) Cadastrar veículo");
            System.out.println("2) Listar veículos disponíveis");
            System.out.println("3) Listar veículos alugados");
            System.out.println("4) Listar veículos de luxo");

            System.out.println("\n * Gerenciar Clientes");
            System.out.println("5) Cadastrar cliente");
            System.out.println("6) Listar clientes");

            System.out.println("\n * Locação de Veículos");
            System.out.println("7) Alugar veículo");
            System.out.println("8) Devolver veículo");

            System.out.println("\n * Finalizar");
            System.out.println("9) Sair do sistema");

            System.out.print("\nDigite a opção desejada: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Opção 1: Cadastrar veículo");
                    CriarVeiculo.cadastrarVeiculo();
                    break;
                case 2:
                    System.out.println("Opção 2: Listar veículos disponíveis");
                    BancoDeDadosVeiculos.imprimirVeiculos();
                    break;
                case 3:
                    System.out.println("Opção 3: Listar veículos alugados");
                    break;
                case 4:
                    System.out.println("Opção 4: Listar veículos de luxo");
                    break;
                case 5:
                    System.out.println("Opção 5: Cadastrar cliente");
                    CriarCliente.cadastrarCliente();
                    break;
                case 6:
                    System.out.println("Opção 6: Listar clientes");
                    BancoDeDadosClientes.imprimirClientes();
                    break;
                case 7:
                    System.out.println("Opção 7: Alugar veículo");
                    break;
                case 8:
                    System.out.println("Opção 8: Devolver veículo");
                    break;
                case 9:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (option != 9);

        scanner.close();
    }
}
