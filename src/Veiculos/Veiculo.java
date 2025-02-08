package Veiculos;

public class Veiculo {
    public String modelo;
    private String placa;
    private double valorDiaria;
    public boolean disponibilidade;
    boolean isVeiculoDeLuxo;

        //construtor
    public Veiculo(String modelo, String placa, double valorDiaria, boolean disponibilidade, boolean isVeiculoDeLuxo) {
        this.modelo = modelo;
        this.placa = placa;
        this.valorDiaria = valorDiaria;
        this.disponibilidade = disponibilidade;
        this.isVeiculoDeLuxo = isVeiculoDeLuxo;
    }

    @Override
    public String toString() {
        return "Veiculo [Modelo=" + modelo + ", Placa=" + placa + ", Valor Diária=" + valorDiaria + ", Disponibilidade=" + disponibilidade + "]" + ", Veiculo de luxo =" + isVeiculoDeLuxo;
    }

        // metodos acessores get e set
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public boolean isVeiculoDeLuxo() {
        return isVeiculoDeLuxo;
    }

    public void setVeiculoDeLuxo(boolean veiculoDeLuxo) {
        if (modelo.equals("CarroComum") || modelo.equals("SUV")) {
            isVeiculoDeLuxo = true;
        } else {
            isVeiculoDeLuxo = false;
        }
    }

    //metodo que calcula valor da diaria
    public double calcularValorDiaria(int dias) {
        return valorDiaria * dias;
    }

    //metodo que exibe informações de veiculo
//    public abstract void informacoesDoVeiculo();

}









