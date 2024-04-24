import java.util.Scanner;

public class ejercicio204 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la cantidad en dólares
        System.out.print("Ingresa la cantidad en dólares: ");
        double dolares = scanner.nextDouble();

        // Definir el valor de cambio de dólares a bolivianos
        double valorCambio = 8.08;

        // Calcular la cantidad en bolivianos
        double bolivianos = dolares * valorCambio;

        // Mostrar el resultado
        System.out.println(dolares + " dólares equivalen a " + bolivianos + " bolivianos.");

        // Cerrar el Scanner
        scanner.close();
    }
}
