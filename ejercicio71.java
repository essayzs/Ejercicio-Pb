import java.util.Scanner;

public class ejercicio71 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor de n:");
        int n = scanner.nextInt();

        System.out.println("La serie Fibonacci hasta " + n + " es:");
        generarSerieFibonacci(n);

        scanner.close();
    }

    public static void generarSerieFibonacci(int n) {
        int primero = 0, segundo = 1;
        int siguiente;

        while (primero <= n) {
            System.out.print(primero + " ");
            siguiente = primero + segundo;
            primero = segundo;
            segundo = siguiente;
        }
    }
}
