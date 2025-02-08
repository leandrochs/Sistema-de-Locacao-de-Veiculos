package Veiculos;

public class Caminhao extends Veiculo {
        public Caminhao(String modelo, String placa, double valorDiaria, boolean disponibilidade, boolean isVeiculoDeLuxo) {
            super(modelo, placa, valorDiaria, disponibilidade, isVeiculoDeLuxo);
        }

//    @Override
    public void informacoesDoVeiculo() {
        System.out.println("Caminhão, modelo:" + getModelo() + ", placa: " + getPlaca());
    }
}

