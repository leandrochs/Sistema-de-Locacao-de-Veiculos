package Clientes;
import BancoDeDados.BancoDeDadosClientes;

import java.util.Scanner;

public class CriarCliente {
    public static void cadastrarCliente() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do cliente: ");
        String name = sc.nextLine();

        System.out.print("Digite o telefone do cliente: ");
        String telephoneNumber = sc.nextLine();

        System.out.print("Digite o endereço do cliente: ");
        String adress = sc.nextLine();

        System.out.print("Digite o CPF/CNPJ do cliente: ");
        String idNumber = sc.nextLine();

        Cliente novoCliente = new Cliente(name, idNumber, adress, telephoneNumber);
        BancoDeDadosClientes.adicionaCliente(novoCliente);

        System.out.println("Cliente cadastrado com sucesso: " + name);
        BancoDeDadosClientes.imprimeUltimoCliente();
    }
}