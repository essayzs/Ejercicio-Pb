import java.util.Scanner;

public class ejercicio157 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese su nombre en mayúsculas
        System.out.print("Ingresa tu nombre en MAYÚSCULAS: ");
        String nombre = scanner.nextLine();

        // Verificar si el nombre comienza con la letra "A"
        if (nombre.startsWith("A")) {
            // Convertir el nombre a minúsculas
            nombre = nombre.toLowerCase();
            System.out.println("Tu nombre convertido a minúsculas: " + nombre);
        } else {
            System.out.println("Tu nombre no comienza con la letra A, no se ha convertido a minúsculas.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
