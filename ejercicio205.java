import java.util.Scanner;

public class ejercicio205 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la cantidad en bolivianos
        System.out.print("Ingresa la cantidad en bolivianos: ");
        double bolivianos = scanner.nextDouble();

        // Solicitar al usuario que ingrese el tipo de cambio actual
        System.out.print("Ingresa el tipo de cambio actual (Bolivianos por dólar): ");
        double tipoCambio = scanner.nextDouble();

        // Calcular la cantidad en dólares
        double dolares = bolivianos / tipoCambio;

        // Mostrar el resultado
        System.out.println(bolivianos + " bolivianos equivalen a aproximadamente " + dolares + " dólares.");

        // Cerrar el Scanner
        scanner.close();
    }
}
