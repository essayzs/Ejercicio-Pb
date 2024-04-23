import java.util.Scanner;
public class ejercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese los valores de A y B
        System.out.println("Ingrese el valor de A:");
        int A = scanner.nextInt();

        System.out.println("Ingrese el valor de B:");
        int B = scanner.nextInt();

        // Intercambiar los valores utilizando una variable temporal
        int temp = A;
        A = B;
        B = temp;

        // Imprimir los valores intercambiados
        System.out.println("Después del intercambio:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        scanner.close();
    }
}
