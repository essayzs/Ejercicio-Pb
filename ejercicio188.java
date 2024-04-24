import java.util.Scanner;

public class ejercicio188 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la dirección de correo electrónico
        System.out.print("Ingrese la dirección de correo electrónico: ");
        String correo = scanner.nextLine();

        // Verificar si la dirección de correo electrónico es válida
        boolean esValido = validarCorreo(correo);

        // Mostrar el resultado
        if (esValido) {
            System.out.println("La dirección de correo electrónico es válida.");
        } else {
            System.out.println("La dirección de correo electrónico no es válida.");
            scanner.close();
        }
    }

    // Función para validar una dirección de correo electrónico
    public static boolean validarCorreo(String correo) {
        // Expresión regular para validar la dirección de correo electrónico
        String patron = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

        // Verificar si la dirección de correo electrónico coincide con el patrón
        return correo.matches(patron);
    }
}
