import java.util.Scanner;

public class ejercicio69 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor de n:");
        int n = scanner.nextInt();

        int suma = calcularSumaSecuencia(n);
        System.out.println("La suma de la secuencia es: " + suma);

        scanner.close();
    }

    public static int calcularSumaSecuencia(int n) {
        // Calcular el término final de la secuencia
        int terminoFinal = 20 + 2 * n;
        // Calcular la suma utilizando la fórmula de la suma de una progresión aritmética
        int suma = (20 + terminoFinal) * n / 2;
        return suma;
    }
}
