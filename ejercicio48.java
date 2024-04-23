import java.util.Scanner;

public class ejercicio48 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese dos números
        System.out.println("Ingrese el primer número:");
        double numero1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número:");
        double numero2 = scanner.nextDouble();

        // Mostrar la suma
        System.out.println("Suma: " + (numero1 + numero2));

        // Mostrar la resta
        System.out.println("Resta: " + (numero1 - numero2));

        // Mostrar la multiplicación
        System.out.println("Multiplicación: " + (numero1 * numero2));

        // Verificar si el segundo número es cero para evitar una división por cero
        if (numero2 != 0) {
            // Mostrar la división
            System.out.println("División: " + (numero1 / numero2));
            
            // Mostrar el resto (módulo) de la división
            System.out.println("Resto (Módulo): " + (numero1 % numero2));
        } else {
            System.out.println("No se puede dividir por cero.");
            scanner.close();
        }
    }
}
