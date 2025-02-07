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

    public static void imprimeUltimoVeiculo() {
        if (listaVeiculos.isEmpty()) {
            System.out.println("Sem veículos cadastrados!");;
        }
        System.out.println(listaVeiculos.get(listaVeiculos.size() - 1));
    }
}

