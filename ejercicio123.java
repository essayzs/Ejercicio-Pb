import java.util.Scanner;

public class ejercicio123 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese el capital inicial, la tasa de interés y el número de días
        System.out.print("Ingrese el capital inicial: ");
        double capitalInicial = scanner.nextDouble();

        System.out.print("Ingrese la tasa de interés (en porcentaje): ");
        double tasaInteres = scanner.nextDouble() / 100; // Convertir la tasa de interés a decimal

        System.out.print("Ingrese el número de días: ");
        int numeroDias = scanner.nextInt();

        // Calcular el capital final
        double capitalFinal = capitalInicial + (capitalInicial * tasaInteres * numeroDias);

        // Mostrar el capital final
        System.out.println("El capital final es: " + capitalFinal);

        scanner.close();
    }
}
