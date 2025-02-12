package LocacaoDeVeiculos.Devolver;
import LocacaoDeVeiculos.Alugar.LocacaoRegistro;
import Veiculos.Veiculo;
import java.util.Scanner;
import static BancoDeDados.BancoDeDadosLocacoes.listaLocacoes;
import static BancoDeDados.BancoDeDadosVeiculos.listaVeiculos;


public class Devolucao {

    private static final Scanner sc = new Scanner(System.in);

    private static String lerPlaca(){
        System.out.println("Digite a placa do veículo que deseja devolver: ");
        return sc.nextLine();
    }

    private static boolean checarExistencia(String placa) {
        boolean veiculoExiste = false;
        for(Veiculo veiculo : listaVeiculos){
            if(veiculo.getPlaca().equals(placa)){
                veiculoExiste = true;
                break;
            }
        }
        if(!veiculoExiste){
            System.out.println("Veículo não encontrado no Banco de Dados");
            return false;
        }
        return true;
    }

    private static boolean checarListaLocacoes(String placa){
        boolean veiculoLocado = false;
        for(LocacaoRegistro locacao : listaLocacoes){
            if(locacao.getVeiculo().getPlaca().equals(placa)){
                veiculoLocado = true;
                break;
            }
        }
        if(!veiculoLocado){
            System.out.println("Veículo não está locado");
            return false;
        }
        return true;
    }

    private static boolean confirmarDevolucao(String placa) {
        System.out.printf("Confirma a devolução do veículo: %s? (S/N)\n", placa);
        String respostaDevolucao = sc.nextLine().trim().toUpperCase();
        if (!respostaDevolucao.equals("S")) {
            System.out.println("Devolução cancelada");
            return false;
        }
        return true;
    }

    private static void atualizarDisponibilidadeVeiculo(String placa) {
        for(Veiculo veiculo : listaVeiculos){
            if(veiculo.getPlaca().equals(placa)){
                veiculo.setDisponibilidade(true);
            }
        }
    }

    public static void removerLocacao(String placa) {
        listaLocacoes.removeIf(locacao -> locacao.getVeiculo().getPlaca().equals(placa));
    }

    public static void devolverLocacao() {
        String placa = lerPlaca();

        if (!checarExistencia(placa)){
            return;
        }

        if(!checarListaLocacoes(placa)){
            return;
        }

        if (!confirmarDevolucao(placa)) {
            return;
        }

        atualizarDisponibilidadeVeiculo(placa);
        removerLocacao(placa);
        System.out.println("Veículo devolvido com sucesso!");
    }

}