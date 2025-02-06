package Veiculos;

public class CarroComum extends Veiculo {
        public CarroComum(String modelo, String placa, double valorDiaria, boolean disponibilidade) {
            super(modelo, placa, valorDiaria, disponibilidade);
        }

//    @Override
    public void informacoesDoVeiculo() {
        System.out.println("Carro comum modelo:" + getModelo() + ", placa: " + getPlaca());
    }
}

