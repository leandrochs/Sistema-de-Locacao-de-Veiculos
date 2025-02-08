package Veiculos;

public class Moto extends Veiculo {
        public Moto(String modelo, String placa, double valorDiaria, boolean disponibilidade, boolean isVeiculoDeLuxo) {
            super(modelo, placa, valorDiaria, disponibilidade,isVeiculoDeLuxo);
        }

//    @Override
    public void informacoesDoVeiculo() {
            System.out.println("Moto, modelo:" + getModelo() + ", placa: " + getPlaca());
    }
}


