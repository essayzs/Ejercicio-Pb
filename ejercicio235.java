import java.util.Scanner;

public class ejercicio235 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de N para la serie de Fibonacci: ");
        int n = scanner.nextInt();

        System.out.println("Serie de Fibonacci hasta el " + n + "º término:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        scanner.close();
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
