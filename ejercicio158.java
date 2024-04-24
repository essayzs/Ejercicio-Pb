import java.util.Scanner;

public class ejercicio158 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese una cadena de caracteres para el número entero
        System.out.print("Ingresa un número entero: ");
        String cadenaEntera = scanner.nextLine();

        // Pedir al usuario que ingrese una cadena de caracteres para el número real
        System.out.print("Ingresa un número real: ");
        String cadenaReal = scanner.nextLine();

        // Convertir la cadena de caracteres a números enteros y reales
        int numeroEntero = Integer.parseInt(cadenaEntera);
        double numeroReal = Double.parseDouble(cadenaReal);

        // Calcular la suma de los números enteros y reales
        double suma = numeroEntero + numeroReal;

        // Mostrar el resultado de la suma
        System.out.println("La suma de " + numeroEntero + " y " + numeroReal + " es: " + suma);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
