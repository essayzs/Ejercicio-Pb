import java.util.Scanner;

public class ejercicio221 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String clave = "eureka";
        int intentos = 3;

        while (intentos > 0) {
            System.out.print("Ingresa la clave: ");
            String intento = scanner.nextLine();

            if (intento.equals(clave)) {
                System.out.println("¡Clave correcta! Acceso permitido.");
                break;
            } else {
                intentos--;
                if (intentos > 0) {
                    System.out.println("Clave incorrecta. Te quedan " + intentos + " intentos.");
                } else {
                    System.out.println("Has agotado tus 3 intentos. Acceso denegado.");
                }
            }
        }

        scanner.close();
    }
}
