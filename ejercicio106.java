import java.util.Scanner;

public class ejercicio106 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese dos números enteros positivos
        System.out.println("Ingrese el primer número entero positivo:");
        int m = Math.abs(scanner.nextInt()); // Valor absoluto para garantizar que sea positivo
        System.out.println("Ingrese el segundo número entero positivo:");
        int n = Math.abs(scanner.nextInt()); // Valor absoluto para garantizar que sea positivo

        // Calcular el máximo común divisor utilizando el algoritmo de Euclides
        int mcd = encontrarMCD(m, n);

        // Mostrar el máximo común divisor
        System.out.println("El máximo común divisor de " + m + " y " + n + " es: " + mcd);

        scanner.close();
    }

    // Función recursiva para encontrar el máximo común divisor utilizando el algoritmo de Euclides
    public static int encontrarMCD(int m, int n) {
        // Si el segundo número es cero, el MCD es el primer número
        if (n == 0) {
            return m;
        }
        // Calcular el resto de la división m/n
        int r = m % n;
        // Llamar recursivamente a la función con el segundo número y el resto
        return encontrarMCD(n, r);
    }
}
