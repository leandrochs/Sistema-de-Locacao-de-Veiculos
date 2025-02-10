package LocacaoDeVeiculos.Alugar;

import Clientes.Cliente;
import Veiculos.Veiculo;
import java.time.LocalDate;

public class LocacaoRegistro {
    private Veiculo veiculo;
    private Cliente cliente;
    private LocalDate dataLocacao;
    private LocalDate dataDevolucao;

    public LocacaoRegistro(Veiculo veiculo, Cliente cliente, LocalDate dataLocacao, LocalDate dataDevolucao) {
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.dataLocacao = dataLocacao;
        this.dataDevolucao = dataDevolucao;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }


    @Override
    public String toString() {
        return "Locação:\n" +
                "Veículo: " + veiculo + "\n" +
                "Cliente: " + cliente + "\n" +
                "Data de Locação: " + dataLocacao + "\n" +
                "Data de Devolução: " + dataDevolucao + "\n";
    }
}
