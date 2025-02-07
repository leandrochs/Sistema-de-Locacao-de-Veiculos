package BancoDeDados;

import LocacaoDeVeiculos.LocacaoRegistro;
import java.util.ArrayList;
import java.util.List;

public class BancoDeDadosLocacoes {
    public static List<LocacaoRegistro> listaLocacoes = new ArrayList<>();

    public static void adicionarLocacao(LocacaoRegistro locacao) {
        listaLocacoes.add(locacao);
    }

    public static void imprimirTodasLocacoes() {
        if (listaLocacoes.isEmpty()) {
            System.out.println("Nenhuma locação registrada.");
            return;
        }

        for (LocacaoRegistro locacao : listaLocacoes) {
            System.out.println(locacao);
        }
    }

    public static void imprimeUltimaLocacao() {
        if (listaLocacoes.isEmpty()) {
            System.out.println("Sem locações cadastradas!");
        }
        System.out.println(listaLocacoes.get(listaLocacoes.size() - 1));
    }
}
