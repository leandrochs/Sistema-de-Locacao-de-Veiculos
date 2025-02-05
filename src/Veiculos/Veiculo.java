package Veiculos;

public abstract class Veiculo {
    protected String modelo;
    protected String placa;
    protected double valorDiaria;
    protected boolean disponibilidade;

    public Veiculo(String modelo, String placa, double valorDiaria, boolean disponibilidade) {
        this.modelo = modelo;
        this.placa = placa;
        this.valorDiaria = valorDiaria;
        this.disponibilidade = disponibilidade;
    }

    public String getPlaca() {
        return placa;
    }

    static class CarroComum extends Veiculo {
        public CarroComum(String modelo, String placa, double valorDiaria, boolean disponibilidade) {
            super(modelo, placa, valorDiaria, disponibilidade);
        }
    }

    static class CarroPremium extends Veiculo {
        public CarroPremium(String modelo, String placa, double valorDiaria, boolean disponibilidade) {
            super(modelo, placa, valorDiaria, disponibilidade);
        }
    }

    static class SUV extends Veiculo {
        public SUV(String modelo, String placa, double valorDiaria, boolean disponibilidade) {
            super(modelo, placa, valorDiaria, disponibilidade);
        }
    }

    static class Moto extends Veiculo {
        public Moto(String modelo, String placa, double valorDiaria, boolean disponibilidade) {
            super(modelo, placa, valorDiaria, disponibilidade);
        }
    }

    static class Caminhao extends Veiculo {
        public Caminhao(String modelo, String placa, double valorDiaria, boolean disponibilidade) {
            super(modelo, placa, valorDiaria, disponibilidade);
        }
    }

}
