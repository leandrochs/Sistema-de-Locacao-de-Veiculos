package Veiculos;

public class CarroPremium extends Veiculo implements ServicosDeLuxo {
        public CarroPremium(String modelo, String placa, double valorDiaria, boolean disponibilidade, boolean isVeiculoDeLuxo) {
            super(modelo, placa, valorDiaria, disponibilidade, isVeiculoDeLuxo);
        }

//    @Override
    public void informacoesDoVeiculo() {
        System.out.println("Carro Premium, modelo:" + getModelo() + ", placa: " + getPlaca());
    }

  @Override
    public void oferecerServicoPremium() {
        System.out.println("Serviço premium disponivel, para veiculo premium " + getModelo());
    }
}

