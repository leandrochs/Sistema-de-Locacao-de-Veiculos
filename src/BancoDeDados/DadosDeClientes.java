package BancoDeDados;

import Clientes.Cliente;
//Nota para a avaliação: usamos estes dados para ter algo para exibir numa primeira
//corrida do código. A opção de adicionar valores à lista também está contemplada.
public class DadosDeClientes {

    public static void gerarClientesDeExemplo() {
        for (int i = 0; i < 3; i++) {
            Cliente cliente = new Cliente("Fulano"+i, "5555555555"+i, "Rua"+i, "99999999"+i);
            BancoDeDadosClientes.adicionaCliente(cliente);
        }
    }

    // Outros dados de exemplo



}
