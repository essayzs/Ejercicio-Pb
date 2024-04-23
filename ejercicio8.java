import java.util.Scanner;
public class ejercicio8 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el dividendo
        System.out.println("Ingrese el dividendo:");
        int dividendo = scanner.nextInt();

        // Solicitar al usuario que ingrese el divisor
        System.out.println("Ingrese el divisor:");
        int divisor = scanner.nextInt();

        // Calcular el resto de la división
        int resto = dividendo % divisor;

        // Mostrar el resultado del resto
        System.out.println("El resto de la división es: " + resto);

        // Cerrar el Scanner
        scanner.close();
    }
}
