package BancoDeDados;
import Veiculos.Veiculo;
import java.util.ArrayList;
import java.util.List;

public class BancoDeDadosVeiculos {
    public static List<Veiculo> listaVeiculos = new ArrayList<>();

    public static void adicionarVeiculo(Veiculo veiculo) {
        listaVeiculos.add(veiculo);
    }
    public static void imprimirVeiculos () {
        for (Veiculo veiculo : listaVeiculos) {
            System.out.println(veiculo.toString());
        }
    }
}
