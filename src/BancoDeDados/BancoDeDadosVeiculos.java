package BancoDeDados;
import Veiculos.Veiculo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BancoDeDadosVeiculos {
    public static List<Veiculo> listaVeiculos = new ArrayList<>();
    private static final Scanner sc = new Scanner(System.in);

    public static void adicionarVeiculo(Veiculo veiculo) {
        listaVeiculos.add(veiculo);
    }

    public static void imprimirTodosVeiculos() {
        for (Veiculo veiculo : listaVeiculos) {
            System.out.println(veiculo.toString());
        }
    }

    public static void imprimirVeiculosDisponiveis() {
        for (Veiculo veiculo : listaVeiculos) {
            if (veiculo.disponibilidade) {
                System.out.println(veiculo);
            }
        }
    }

    public static void imprimeUltimoVeiculo() {
        if (listaVeiculos.isEmpty()) {
            System.out.println("Sem veículos cadastrados!");
        }
        System.out.println(listaVeiculos.get(listaVeiculos.size() - 1));
    }

    public static void imprimirVeiculosAlugados() {
        for (Veiculo veiculo : listaVeiculos) {
            if (!veiculo.disponibilidade) {
                System.out.println(veiculo);
            }
        }
    }

    public static void imprimirVeiculosDeLuxo() {
        for (Veiculo veiculo : listaVeiculos) {
            if (veiculo.isVeiculoDeLuxo()) {
                System.out.println(veiculo);
            }
        }
    }
}

