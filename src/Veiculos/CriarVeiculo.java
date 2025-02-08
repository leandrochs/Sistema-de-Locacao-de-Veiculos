package Veiculos;

import BancoDeDados.BancoDeDadosVeiculos;

import java.util.Scanner;

public class CriarVeiculo {

   static Scanner sc = new Scanner(System.in);

    private static boolean placaRepetida(String placa){
        for (Veiculo veiculo : BancoDeDadosVeiculos.listaVeiculos) {
            if (veiculo.getPlaca().equals(placa)) {
                System.out.println("Veículo já cadastrado.");
                return true;
            }
        }
        return false;
    }

    public static void cadastrarVeiculo() {

        int tipoVeiculo;

        while(true) {
            System.out.println("Escolha o tipo de veículo que deseja cadastrar: ");
            System.out.println("1) Carro Comum");
            System.out.println("2) Carro Premium");
            System.out.println("3) SUV");
            System.out.println("4) Moto");
            System.out.println("5) Caminhão");
            tipoVeiculo = sc.nextInt();
            sc.nextLine();

            if(tipoVeiculo >= 1 && tipoVeiculo <= 5) {
                break;
            }
            else{
                System.out.println("Tipo de veículo não encontrado.");
            }
        }

        System.out.println("Digite o modelo do veículo:");
        String modelo = sc.nextLine();

        System.out.println("Digite a placa do veículo:");
        String placa = sc.nextLine();
        if(placaRepetida(placa)){
            return;
        }



        System.out.println("Digite a tarifa diária de locação do veículo:");
        double valorDiaria = sc.nextDouble();

        boolean disponibilidade = true;
        Veiculo veiculo = null;

        switch (tipoVeiculo) {
            case 1:
                veiculo = new CarroComum(modelo, placa, valorDiaria, disponibilidade, false);
                break;
            case 2:
                veiculo = new CarroPremium(modelo, placa, valorDiaria, disponibilidade,true);
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
            default:
                System.out.println("Tipo de veículo não encontrado.");
                break;
        }
        BancoDeDadosVeiculos.adicionarVeiculo(veiculo);
        System.out.println("Veículo cadastrado com sucesso.");
        BancoDeDadosVeiculos.imprimeUltimoVeiculo();
    }
}
