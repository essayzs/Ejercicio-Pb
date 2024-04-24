import java.util.Scanner;

public class ejercicio219 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un número N
        System.out.print("Ingrese un número entero positivo (N): ");
        int N = scanner.nextInt();

        // Calcular la suma de los N primeros números pares
        int suma = 0;
        for (int i = 1, num = 2; i <= N; i++, num += 2) {
            suma += num;
        }

        // Mostrar el resultado
        System.out.println("La suma de los primeros " + N + " números pares es: " + suma);

        // Cerrar el scanner
        scanner.close();
    }
}
