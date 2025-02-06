package BancoDeDados;
import Veiculos.Veiculo;

//Nota para a avaliação: usamos estes dados para ter algo para exibir numa primeira
//corrida do código. A opção de adicionar valores à lista também está contemplada.

public class DadosDeVeiculos {
    public static void gerarVeiculosDeExemplo() {
        for (int i = 0; i < 3; i++) {
            Veiculo Veiculos = new Veiculo("Modelo"+i, "placa"+i, 159.5,true);
            BancoDeDadosVeiculos.adicionarVeiculo(Veiculos);
        }
    }
}