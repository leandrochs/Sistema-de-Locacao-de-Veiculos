package Veiculos;

import BancoDeDados.BancoDeDadosVeiculos;
import Utils.MensagensErro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CriarVeiculo {

    static Scanner sc = new Scanner(System.in);

    private static boolean placaRepetida(String placa) {
        for (Veiculo veiculo : BancoDeDadosVeiculos.listaVeiculos) {
            if (veiculo.getPlaca().equalsIgnoreCase(placa)) {
                System.out.println(MensagensErro.VEICULO_EXISTENTE.getMensagem());
                return true;
            }
        }
        return false;
    }

    public static void cadastrarVeiculo() {
        while (true) {
            int tipoVeiculo = 0;

            while (true) {
                try {
                    System.out.println("\nEscolha o tipo de veículo que deseja cadastrar:");
                    System.out.println("1) Carro Comum");
                    System.out.println("2) Carro Premium");
                    System.out.println("3) SUV");
                    System.out.println("4) Moto");
                    System.out.println("5) Caminhão");
                    System.out.println("6) Voltar ao menu Inicial");

                    tipoVeiculo = sc.nextInt();
                    sc.nextLine();

                    if (tipoVeiculo >= 1 && tipoVeiculo <= 6) {
                        break;
                    } else {
                        System.out.println(MensagensErro.OPCAO_INVALIDA.getMensagem());
                    }
                } catch (InputMismatchException e) {
                    System.out.println(MensagensErro.ENTRADA_INVALIDA.getMensagem());
                    sc.nextLine();
                }
            }

            if (tipoVeiculo == 6) {
                System.out.println("Voltando ao menu inicial...");
                return;
            }

            System.out.println("Digite o modelo do veículo:");
            String modelo = sc.nextLine().trim();

            System.out.println("Digite a placa do veículo:");
            String placa = sc.nextLine().trim();

            if (placaRepetida(placa)) {
                continue;
            }

            double valorDiaria = 0;
            while (true) {
                try {
                    System.out.println("Digite a tarifa diária de locação do veículo:");
                    valorDiaria = sc.nextDouble();
                    sc.nextLine();
                    if (valorDiaria > 0) {
                        break;
                    } else {
                        System.out.println("O valor da diária deve ser positivo.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println(MensagensErro.ENTRADA_INVALIDA.getMensagem());
                    sc.nextLine();
                }
            }

            boolean disponibilidade = true;
            Veiculo veiculo = null;

            switch (tipoVeiculo) {
                case 1:
                    veiculo = new CarroComum(modelo, placa, valorDiaria, disponibilidade, false);
                    break;
                case 2:
                    veiculo = new CarroPremium(modelo, placa, valorDiaria, disponibilidade, true);
                    break;
                case 3:
                    veiculo = new SUV(modelo, placa, valorDiaria, disponibilidade, true);
                    break;
                case 4:
                    veiculo = new Moto(modelo, placa, valorDiaria, disponibilidade, false);
                    break;
                case 5:
                    veiculo = new Caminhao(modelo, placa, valorDiaria, disponibilidade, false);
                    break;
            }

            if (veiculo != null) {
                BancoDeDadosVeiculos.adicionarVeiculo(veiculo);
                System.out.println("Veículo cadastrado com sucesso.");
                BancoDeDadosVeiculos.imprimeUltimoVeiculo();
            }

            int opcao;

            while (true) {
                try {
                    System.out.println("Deseja cadastrar um novo veículo?");
                    System.out.println("1) Sim");
                    System.out.println("2) Voltar para o menu inicial");
                    opcao = sc.nextInt();
                    sc.nextLine();

                    if (opcao == 1) {
                        break;
                    } else if (opcao == 2) {
                        return;
                    } else {
                        System.out.println(MensagensErro.OPCAO_INVALIDA.getMensagem());
                    }

                } catch (InputMismatchException e) {
                    sc.nextLine();
                    System.out.println(MensagensErro.ENTRADA_INVALIDA.getMensagem());
                }
            }

        }
    }
}
