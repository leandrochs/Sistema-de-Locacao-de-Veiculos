package Veiculos;

public class CarroPremium extends Veiculo implements ServicosDeLuxo {
        public CarroPremium(String modelo, String placa, double valorDiaria, boolean disponibilidade) {
            super(modelo, placa, valorDiaria, disponibilidade);
        }

    @Override
    public void informacoesDoVeiculo() {

    }

    @Override
    public String oferecerServicoPremium() {
        return "";
    }
}

