import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class CriarVeiculo {

    List<Veiculo> veiculos = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    private boolean placaRepetida(String placa){
        for (Veiculo veiculo : veiculos) {
            if (veiculo.placa.equals(placa)) {
                System.out.println("Veículo já cadastrado.");
                return true;
            }
        }
        return false;
    }

    public void cadastrarVeiculo() {

        int tipoVeiculo;

        while(true) {
            System.out.println("Escolha o tipo de veículo que deseja cadastrar: ");
            System.out.println("Digite 1 para Carro Comum");
            System.out.println("Digite 2 para Carro Premium");
            System.out.println("Digite 3 para SUV");
            System.out.println("Digite 4 para Moto");
            System.out.println("Digite 5 para Caminhão");

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
                veiculo = new CarroComum(modelo, placa, valorDiaria, disponibilidade);
                break;
            case 2:
                veiculo = new CarroPremium(modelo, placa, valorDiaria, disponibilidade);
                break;
            case 3:
                veiculo = new SUV(modelo, placa, valorDiaria, disponibilidade);
                break;
            case 4:
                veiculo = new Moto(modelo, placa, valorDiaria, disponibilidade);
                break;
            case 5:
                veiculo = new Caminhao(modelo, placa, valorDiaria, disponibilidade);
                break;
            default:
                System.out.println("Tipo de veículo não encontrado.");
                break;
        }
        veiculos.add(veiculo);
        System.out.println("Veículo cadastrado com sucesso.");
    }
}
