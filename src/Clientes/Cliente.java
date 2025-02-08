package Clientes;

import java.util.Scanner;

public class Cliente {
    private final int CPF_SIZE = 11;
    private final int  CNPJ_SIZE = 14;

    private String name;
    private String idNumber;
    private String adress;
    private String telephoneNumber;
    private String tipoDeCliente;

    public Cliente(String name, String idNumber, String adress, String telephoneNumber) {
        this.name = name;
        this.idNumber = idNumber;
        this.adress = adress;
        this.telephoneNumber = telephoneNumber;
        setIdNumber(idNumber);
    }

    public String getName() {
        return name;
    }

    public void setNome(String name) {
        this.name = name;
    }

    public String getIdNumber() {
        return idNumber;
    }


public void setIdNumber(String idNumber) {
    boolean valid;
    Scanner scanner = new Scanner(System.in);
    do {
        int intLength = idNumber.length();
        if (intLength == CNPJ_SIZE) {
            this.tipoDeCliente = "PJ";
            this.idNumber = idNumber;
            valid = true;
        } else if (intLength == CPF_SIZE) {
            this.tipoDeCliente = "PF";
            this.idNumber = idNumber;
            valid = true;
        } else {
            System.out.println("IdNumber invalido. Por favor, insira novamente:");
            idNumber = scanner.nextLine();
            valid = false;
        }
    } while (!valid);
}

    public String getAdress() {
    return adress;
}

public void setAdress(String adress) {
    this.adress = adress;
}

public String getTelephoneNumber() {
    return telephoneNumber;
}

public void setTelephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
}

@Override
public String toString() {
    return "Cliente{" +
            "name='" + name + '\'' +
            ", idNumber='" + idNumber + '\'' +
            ", adress='" + adress + '\'' +
            ", telephoneNumber='" + telephoneNumber + '\'' +
            '}';
}
}