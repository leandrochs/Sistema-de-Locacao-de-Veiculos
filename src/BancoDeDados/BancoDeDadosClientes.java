package BancoDeDados;

import Clientes.Cliente;

import java.util.ArrayList;
import java.util.List;

public class BancoDeDadosClientes {
    public static List<Cliente> listaClientes = new ArrayList<>();

    public static void adicionaCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }

    public static void imprimirClientes() {
        for (Cliente cliente : listaClientes) {
            System.out.println(cliente);
        }
    }

    public static void getUltimoCliente() {
        if (listaClientes.isEmpty()) {
            System.out.println("Sem clientes cadastrados!");;
        }
        //System.out.println(listaClientes.getLast());
    }
}
