package Clientes;

public class Cliente {
    private final int CPF_SIZE = 11;
    private final int  CNPJ_SIZE = 14;

    private String name;
    private String idNumber;
    private String adress;
    private String telephoneNumber;

    public Cliente(String name, String idNumber, String adress, String telephoneNumber) {
        this.name = name;
        this.idNumber = idNumber;
        this.adress = adress;
        this.telephoneNumber = telephoneNumber;
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
        int intLength = idNumber.length();
        //CPF, CNPJ ou erro
//        if (intLength == CPF_SIZE) {
//
//        } else if (intLength == CNPJ_SIZE) {
//
//        }
//        else {
//            //exception
//        }
        this.idNumber = idNumber;
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
}
