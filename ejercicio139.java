import java.util.Scanner;

public class ejercicio139 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.print("Ingrese un número para calcular su factorial: ");
        int numero = scanner.nextInt();

        // Calcular el factorial del número ingresado
        long factorial = calcularFactorial(numero);

        // Mostrar el resultado
        System.out.println("El factorial de " + numero + " es: " + factorial);

        scanner.close();
    }

    // Método para calcular el factorial de un número
    public static long calcularFactorial(int numero) {
        // Inicializar el factorial como 1
        long factorial = 1;

        // Calcular el factorial iterativamente
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
