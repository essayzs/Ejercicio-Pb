import java.util.Scanner;

public class ejercicio218 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un número N positivo y par
        int N;
        do {
            System.out.print("Ingrese un número positivo y par (N): ");
            N = scanner.nextInt();
        } while (N <= 0 || N % 2 != 0); // Verificar que N sea positivo y par

        // Calcular la suma de los primeros N números naturales
        int suma = 0;
        for (int i = 1; i <= N; i++) {
            suma += i;
        }

        // Mostrar el resultado
        System.out.println("La suma de los primeros " + N + " números naturales es: " + suma);

        // Cerrar el scanner
        scanner.close();
    }
}
