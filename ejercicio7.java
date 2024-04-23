import java.util.Scanner;
public class ejercicio7 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el número
        System.out.println("Ingrese un número:");
        double numero = scanner.nextDouble();

        // Determinar si el número es positivo, negativo o cero
        if (numero > 0) {
            System.out.println("El número ingresado es positivo.");
        } else if (numero < 0) {
            System.out.println("El número ingresado es negativo.");
        } else {
            System.out.println("El número ingresado es cero.");
        }

        // Cerrar el Scanner
        scanner.close();
    }
}
