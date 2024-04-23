import java.util.Scanner;

public class ejercicio94 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número entero
        System.out.println("Ingrese un número entero:");
        int numero = scanner.nextInt();

        // Calcular y mostrar el valor absoluto del número ingresado
        int valorAbsoluto = Math.abs(numero);
        System.out.println("El valor absoluto de " + numero + " es: " + valorAbsoluto);

        scanner.close();
    }
}
