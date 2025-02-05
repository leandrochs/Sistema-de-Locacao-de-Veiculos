package Veiculos;

public class SUV extends Veiculo implements ServicosDeLuxo{
        public SUV(String modelo, String placa, double valorDiaria, boolean disponibilidade) {
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


