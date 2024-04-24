import java.util.Scanner;

public class ejercicio177 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.print("Ingresa un número entero positivo: ");
        int numero = scanner.nextInt();

        // Validar que el número sea positivo
        if (numero <= 0) {
            System.out.println("El número debe ser positivo.");
            return;
        }

        // Mostrar los divisores del número
        System.out.print("Los divisores de " + numero + " son: ");
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        scanner.close();
    }
}
