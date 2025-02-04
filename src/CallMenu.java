import Clientes.Cliente;

import java.util.Scanner;

public class CallMenu {
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("1) Gerar relatórios");
            System.out.println("2) Cadastrar cliente");
            System.out.println("3) Cadastrar veículo");
            System.out.println("4) Listar veículos");
            System.out.println("5) Veículo de luxo (locação)");
            System.out.println("6) Sair");
            System.out.print("Digite a opção desejada: ");
            option = scanner.nextInt();
            //Validar para casos de texto não quebrar o código

            switch (option) {
                case 1:
                    System.out.println("Opção 1: Gerar relatórios");
                    break;
                case 2:
                    System.out.println("Opção 2: Cadastrar cliente");
                    break;
                case 3:
                    System.out.println("Opção 3: Cadastrar veículo");
                    break;
                case 4:
                    System.out.println("Opção 4: Listar veículos");
                    break;
                case 5:
                    System.out.println("Opção 5: Veículo de luxo (locação)");
                    break;
                case 6:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (option != 6);

        scanner.close();
    }
}
