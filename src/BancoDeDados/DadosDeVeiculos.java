package BancoDeDados;
import Veiculos.Veiculo;

//Nota para a avaliação: usamos estes dados para ter algo para exibir numa primeira
//corrida do código. A opção de adicionar valores à lista também está contemplada.

public class DadosDeVeiculos {
    public static void gerarVeiculosDeExemplo() {
        for (int i = 0; i < 7; i++) {

            boolean ehDisponivel = (i % 2 == 0);

            Veiculo veiculo = new Veiculo("Modelo"+i, "placa"+i, 159.5+i, ehDisponivel);

            BancoDeDadosVeiculos.adicionarVeiculo(veiculo);
        }
    }
}