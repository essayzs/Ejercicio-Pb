import java.util.Scanner;

public class ejercicio207 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese los dos valores reales
        System.out.print("Ingresa el primer valor real: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo valor real: ");
        double valor2 = scanner.nextDouble();

        // Realizar las operaciones aritméticas
        double suma = valor1 + valor2;
        double resta = valor1 - valor2;
        double multiplicacion = valor1 * valor2;

        // Verificar si el segundo valor es distinto de cero antes de realizar la división
        double division = 0;
        if (valor2 != 0) {
            division = valor1 / valor2;
        } else {
            System.out.println("Error: No se puede dividir por cero.");
        }

        // Mostrar los resultados
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);

        // Cerrar el Scanner
        scanner.close();
    }
}
