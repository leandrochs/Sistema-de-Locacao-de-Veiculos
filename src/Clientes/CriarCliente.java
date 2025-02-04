package Clientes;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CriarCliente {
    private void cadastrarCliente() {
        List<Cliente> clientes;

        clientes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do cliente: ");
        String name = sc.nextLine();

        System.out.print("Digite o telefone do cliente: ");
        String telephoneNumber = sc.nextLine();

        System.out.print("Digite o endereço do cliente: ");
        String adress = sc.nextLine();

        System.out.print("Digite o CPF/CNPJ do cliente: ");
        String idNumber = sc.nextLine();

        Cliente cliente = new Cliente(name, idNumber, adress, telephoneNumber);
        clientes.add(cliente);

        System.out.println("Cliente cadastrado com sucesso: " + name);
    }
}