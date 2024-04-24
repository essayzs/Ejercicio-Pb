import java.util.Scanner;

public class ejercicio214 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese las cantidades invertidas por cada persona
        System.out.print("Ingrese la cantidad invertida por la primera persona: ");
        double inversion1 = scanner.nextDouble();

        System.out.print("Ingrese la cantidad invertida por la segunda persona: ");
        double inversion2 = scanner.nextDouble();

        System.out.print("Ingrese la cantidad invertida por la tercera persona: ");
        double inversion3 = scanner.nextDouble();

        // Calcular la cantidad total invertida
        double inversionTotal = inversion1 + inversion2 + inversion3;

        // Calcular el porcentaje de inversión de cada persona
        double porcentaje1 = (inversion1 / inversionTotal) * 100;
        double porcentaje2 = (inversion2 / inversionTotal) * 100;
        double porcentaje3 = (inversion3 / inversionTotal) * 100;

        // Mostrar los porcentajes de inversión de cada persona
        System.out.println("Porcentaje de inversión de la primera persona: " + porcentaje1 + "%");
        System.out.println("Porcentaje de inversión de la segunda persona: " + porcentaje2 + "%");
        System.out.println("Porcentaje de inversión de la tercera persona: " + porcentaje3 + "%");

        // Cerrar el Scanner
        scanner.close();
    }
}
