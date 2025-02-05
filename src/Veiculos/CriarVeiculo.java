package Veiculos;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;



public class CriarVeiculo {

   static List<Veiculo> veiculos = new ArrayList<>();
   static Scanner sc = new Scanner(System.in);

    private static boolean placaRepetida(String placa){
        for (Veiculo veiculo : veiculos) {
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
            System.out.println("1) Comum");
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
                veiculo = new Veiculo.CarroComum(modelo, placa, valorDiaria, disponibilidade);
                break;
            case 2:
                veiculo = new Veiculo.CarroPremium(modelo, placa, valorDiaria, disponibilidade);
                break;
            case 3:
                veiculo = new Veiculo.SUV(modelo, placa, valorDiaria, disponibilidade);
                break;
            case 4:
                veiculo = new Veiculo.Moto(modelo, placa, valorDiaria, disponibilidade);
                break;
            case 5:
                veiculo = new Veiculo.Caminhao(modelo, placa, valorDiaria, disponibilidade);
                break;
            default:
                System.out.println("Tipo de veículo não encontrado.");
                break;
        }
        veiculos.add(veiculo);
        System.out.println("Veículo cadastrado com sucesso.");
    }
}
