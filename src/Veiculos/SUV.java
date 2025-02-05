package Veiculos;

public class SUV extends Veiculo implements ServicosDeLuxo{
        public SUV(String modelo, String placa, double valorDiaria, boolean disponibilidade) {
            super(modelo, placa, valorDiaria, disponibilidade);
        }

    @Override
    public void informacoesDoVeiculo() {
        System.out.println("SUV, modelo:" + getModelo() + ", placa: " + getPlaca());
    }

    @Override
    public void oferecerServicoPremium() {
        System.out.println("Serviço premium disponivel, para veiculo premium " + getModelo());
    }
}


