package BancoDeDados;

import Clientes.Cliente;

public class Dados {

    public static void gerarClientesDeExemplo() {
        for (int i = 0; i < 3; i++) {
            Cliente cliente = new Cliente("Fulano"+i, "5555555555"+i, "Rua"+i, "99999999"+i);
            BancoDeDados.adicionaCliente(cliente);
        }
    }

    // Outros dados de exemplo



}
