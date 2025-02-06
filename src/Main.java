import BancoDeDados.DadosDeClientes;
import BancoDeDados.DadosDeVeiculos;

public class Main {
    public static void main(String[] args) {

        DadosDeClientes.gerarClientesDeExemplo();
        DadosDeVeiculos.gerarVeiculosDeExemplo();
        CallMenu.menu();

    }
}

