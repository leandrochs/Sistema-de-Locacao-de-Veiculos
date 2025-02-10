package Utils;

public class Utils {

    public static void tecleParaVoltar() {
        System.out.println("\nTecle qualquer tecla para voltar ao menu inicial.");
        try {
            System.in.read();
        } catch (Exception e) {

        }
    }
}