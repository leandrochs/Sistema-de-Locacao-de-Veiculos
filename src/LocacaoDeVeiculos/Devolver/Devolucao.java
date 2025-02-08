package LocacaoDeVeiculos.Devolver;
import BancoDeDados.BancoDeDadosVeiculos;
import java.util.ArrayList;
import java.util.Scanner;

//
//import java.util.Scanner;
//
//public class Devolucao {
//    Scanner scanner = new Scanner(System.in);
//
//    DEVOLUÇÃO::
//    listarVeiculosAlugados;
//    escolherDevolução;
//    confirmarDevolucao;
//    finalizarLocacao;
//        atualizarDisponibilidadeVeiculo;
//        removerLocacao;
//
//}

public class Devolucao {
    private static ArrayList<String> listaVeiculos = new ArrayList<>();

    public static void checarExistencia(Scanner locacao) {
        System.out.println(listaVeiculos.toString());
        System.out.println("Digite a placa do veículo: ");
        Scanner sc = new Scanner(System.in);
        String placa = sc.nextLine();

        if (!listaVeiculos.contains(placa)) {
            System.out.println("O veículo não existe no banco de dados.");
            return;
        }
    }

    public static void confirmarDevolucao(String placa) {
        System.out.printf("Confirma a devolução do veículo: %s? (S/N)\n", placa);
        Scanner sc = new Scanner(System.in);
        String respostaDevolucao = sc.nextLine().trim().toUpperCase();
        if (!respostaDevolucao.equals("S")) {
            System.out.println("Devolução cancelada");
            return;
        }
    }

//    public void atualizarDisponibilidadeVeiculo(String placa) {
//
//    }

}
