package ejercicio2;
import java.util.Scanner;
public class ValidadorContrasenya {

    public boolean validar(String contrasena) {

        if (contrasena == null || contrasena.trim().isEmpty()) {
            return false;
        }

        if (contrasena.length() < 8) {
            return false;
        }

        boolean tieneMayuscula = false;
        boolean tieneNumero = false;

        for (int i = 0; i < contrasena.length(); i++) {
            char c = contrasena.charAt(i);

            if (Character.isUpperCase(c)) {
                tieneMayuscula = true;
            }
            else if (Character.isDigit(c)) {
                tieneNumero = true;
            }
        }

        return tieneMayuscula && tieneNumero;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ValidadorContrasenya validador = new ValidadorContrasenya();

        System.out.println("-- VALIDADOR DE CONTRASEÑA --");
        System.out.print("Introduce una contraseña: ");
        String password = sc.nextLine();

        boolean resultado = validador.validar(password);

        if (resultado) {
            System.out.println("Contraseña válida.");
        }
        else {
            System.out.println("Contraseña no válida.");
        }

        sc.close();
    }
}