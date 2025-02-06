package Veiculos;

public class Moto extends Veiculo {
        public Moto(String modelo, String placa, double valorDiaria, boolean disponibilidade) {
            super(modelo, placa, valorDiaria, disponibilidade);
        }

//    @Override
    public void informacoesDoVeiculo() {
            System.out.println("Moto, modelo:" + getModelo() + ", placa: " + getPlaca());
    }
}


