import java.util.Scanner;

public class ejercicio140 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            // Mostrar el menú
            System.out.println("Menú:");
            System.out.println("1) Salir");
            System.out.println("2) Sumatoria");
            System.out.println("3) Factorial");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("¡Hasta luego!");
                    break;
                case 2:
                    System.out.print("Ingrese un número para calcular su sumatoria: ");
                    int numSumatoria = scanner.nextInt();
                    int sumatoria = calcularSumatoria(numSumatoria);
                    System.out.println("La sumatoria de " + numSumatoria + " es: " + sumatoria);
                    break;
                case 3:
                    System.out.print("Ingrese un número para calcular su factorial: ");
                    int numFactorial = scanner.nextInt();
                    long factorial = calcularFactorial(numFactorial);
                    System.out.println("El factorial de " + numFactorial + " es: " + factorial);
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }
        } while (opcion != 1);

        scanner.close();
    }

    // Método para calcular la sumatoria de un número
    public static int calcularSumatoria(int num) {
        int sumatoria = 0;
        for (int i = 1; i <= num; i++) {
            sumatoria += i;
        }
        return sumatoria;
    }

    // Método para calcular el factorial de un número
    public static long calcularFactorial(int num) {
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
