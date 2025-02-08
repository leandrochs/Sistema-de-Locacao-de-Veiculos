package LocacaoDeVeiculos.Devolver;
import BancoDeDados.BancoDeDadosVeiculos;
import LocacaoDeVeiculos.Alugar.LocacaoRegistro;
import Veiculos.Veiculo;

import java.util.ArrayList;
import java.util.Scanner;

import static BancoDeDados.BancoDeDadosLocacoes.listaLocacoes;
import static BancoDeDados.BancoDeDadosVeiculos.listaVeiculos;

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
    private String placa;

    private static Scanner sc = new Scanner(System.in);

    private static String lerPlaca(){
        System.out.println(listaLocacoes.toString());
        System.out.println("Digite a placa do veículo que deseja devolver: ");
        String placa = sc.nextLine();
        return placa;
    }

    private static void checarExistencia(String placa) {
        boolean veiculoExiste = false;
        for(Veiculo veiculo : listaVeiculos){
            if(veiculo.getPlaca().equals(placa)){
            veiculoExiste = true;
            break;
            }
        }
        if(!veiculoExiste){
            System.out.println("Veículo não encontrado no Banco de Dados");
        }
    }

    private static void checarListaLocacoes(String placa){
        boolean veiculoLocado = false;
        for(LocacaoRegistro locacao : listaLocacoes){
            if(locacao.getVeiculo().getPlaca().equals(placa)){
                veiculoLocado = true;
                break;
            }
        }
        if(!veiculoLocado){
            System.out.println("Veículo não está locado");
        }
    }

    private static void confirmarDevolucao(String placa) {
        System.out.printf("Confirma a devolução do veículo: %s? (S/N)\n", placa);
        String respostaDevolucao = sc.nextLine().trim().toUpperCase();
        if (!respostaDevolucao.equals("S")) {
            System.out.println("Devolução cancelada");
            return;
        }
    }

    private static void atualizarDisponibilidadeVeiculo(String placa) {
        for(Veiculo veiculo : listaVeiculos){
            if(veiculo.getPlaca().equals(placa)){
                veiculo.setDisponibilidade(true);
            }
        }
    }

    public static void removerLocacao(String placa) {
        for(int i = 0; i < listaLocacoes.size(); i++){
            LocacaoRegistro locacao = listaLocacoes.get(i);
            if(locacao.getVeiculo().getPlaca().equals(placa)){
                listaLocacoes.remove(i);
            }
        }
    }

    public static void devolverLocacao() {
        String placa = lerPlaca();
        checarExistencia(placa);
        checarListaLocacoes(placa);
        confirmarDevolucao(placa);
        atualizarDisponibilidadeVeiculo(placa);
        removerLocacao(placa);
        System.out.println("Veículo devolvido com sucesso!");
    }

}
