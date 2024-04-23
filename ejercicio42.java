import java.util.Scanner;

public class ejercicio42 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de kilovoltios requeridos para el sistema de iluminación:");
        double kilovoltiosRequeridos = scanner.nextDouble();

        // Calculamos la cantidad de naranjas necesarias para producir la cantidad de kilovoltios requeridos
        double naranjasNecesarias = kilovoltiosRequeridos / 0.05;

        // Calculamos el peso total de las naranjas necesarias en toneladas
        double pesoTotalToneladas = naranjasNecesarias * 6 / 1000;

        System.out.println("Se necesitan " + naranjasNecesarias + " naranjas para producir " + kilovoltiosRequeridos + " kilovoltios.");
        System.out.println("El peso total de las naranjas necesarias es de " + pesoTotalToneladas + " toneladas.");
        scanner.close();
    }
}
