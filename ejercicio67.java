import java.util.Scanner;

public class ejercicio67 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor de n:");
        int n = scanner.nextInt();

        long factorial = calcularFactorial(n);
        System.out.println("El factorial de " + n + " es: " + factorial);

        scanner.close();
    }

    public static long calcularFactorial(int n) {
        // Inicializar el factorial como 1
        long factorial = 1;
        // Calcular el factorial multiplicando cada número desde 1 hasta n
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
