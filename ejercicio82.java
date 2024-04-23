import java.util.Scanner;

public class ejercicio82 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.println("Ingrese un número:");
        double numero = scanner.nextDouble();

        // Verificar si el número es positivo o negativo y mostrar el resultado
        if (numero > 0) {
            System.out.println("El número ingresado es positivo.");
        } else if (numero < 0) {
            System.out.println("El número ingresado es negativo.");
        } else {
            System.out.println("El número ingresado es cero.");
        }

        scanner.close();
    }
}
