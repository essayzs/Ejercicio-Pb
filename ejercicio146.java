import java.util.Scanner;

public class ejercicio146 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el número límite para la serie Fibonacci
        System.out.println("Ingrese el número límite para la serie Fibonacci:");
        int limite = scanner.nextInt();

        // Mostrar la serie Fibonacci hasta el límite dado por el usuario
        System.out.println("Serie Fibonacci hasta " + limite + ":");
        for (int i = 0; fibonacci(i) <= limite; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }

    // Método para calcular el término n de la serie Fibonacci
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
