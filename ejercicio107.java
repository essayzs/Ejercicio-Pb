import java.util.Scanner;

public class ejercicio107 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int edad;
        // Solicitar al usuario que ingrese la edad y verificar que esté dentro del rango válido
        do {
            System.out.println("Ingrese su edad (entre 1 y 100):");
            edad = scanner.nextInt();
            if (edad < 1 || edad > 100) {
                System.out.println("Error: La edad debe estar entre 1 y 100. Por favor, inténtelo de nuevo.");
            }
        } while (edad < 1 || edad > 100);

        // Determinar si la persona es mayor o menor de edad
        if (edad >= 18) {
            System.out.println("Usted es mayor de edad.");
        } else {
            System.out.println("Usted es menor de edad.");
        }

        scanner.close();
    }
}
