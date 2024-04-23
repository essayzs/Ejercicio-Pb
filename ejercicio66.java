import java.util.Scanner;

public class ejercicio66 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor de n:");
        int n = scanner.nextInt();

        int suma = calcularSumaImpares(n);
        System.out.println("La suma de los números impares desde 1 hasta " + (2 * n - 1) + " es: " + suma);

        scanner.close();
    }

    public static int calcularSumaImpares(int n) {
        int suma = 0;
        for (int i = 1; i <= 2 * n - 1; i += 2) {
            suma += i;
        }
        return suma;
    }
}
