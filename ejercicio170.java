import java.util.Scanner;

public class ejercicio170 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese los numeradores y denominador de las fracciones
        System.out.println("Ingrese el numerador de la primera fracción:");
        int numerador1 = scanner.nextInt();
        System.out.println("Ingrese el numerador de la segunda fracción:");
        int numerador2 = scanner.nextInt();
        System.out.println("Ingrese el denominador de las fracciones:");
        int denominador = scanner.nextInt();

        // Calcular la suma de las fracciones
        int sumaNumerador = numerador1 + numerador2;

        // Calcular la resta de las fracciones
        int restaNumerador = numerador1 - numerador2;

        // Mostrar los resultados
        System.out.println("La suma de las fracciones es: " + sumaNumerador + "/" + denominador);
        System.out.println("La resta de las fracciones es: " + restaNumerador + "/" + denominador);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
