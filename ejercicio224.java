import java.util.Scanner;

public class ejercicio224 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese el nombre del alumno (deje en blanco para terminar): ");
            String nombre = scanner.nextLine();

            if (nombre.isEmpty()) {
                System.out.println("Fin del programa.");
                break;
            }

            double practica, problemas, teoria;
            System.out.print("Ingrese la nota de la parte práctica (0-10): ");
            practica = Double.parseDouble(scanner.nextLine());
            if (practica < 0 || practica > 10) {
                System.out.println("Error: La nota debe estar entre 0 y 10.");
                continue;
            }

            System.out.print("Ingrese la nota de la parte de problemas (0-10): ");
            problemas = Double.parseDouble(scanner.nextLine());
            if (problemas < 0 || problemas > 10) {
                System.out.println("Error: La nota debe estar entre 0 y 10.");
                continue;
            }

            System.out.print("Ingrese la nota de la parte teórica (0-10): ");
            teoria = Double.parseDouble(scanner.nextLine());
            if (teoria < 0 || teoria > 10) {
                System.out.println("Error: La nota debe estar entre 0 y 10.");
                continue;
            }

            double notaFinal = calcularNotaFinal(practica, problemas, teoria);
            System.out.println("Nota final de " + nombre + ": " + notaFinal);
        }

        scanner.close();
    }

    public static double calcularNotaFinal(double practica, double problemas, double teoria) {
        return (practica * 0.1) + (problemas * 0.5) + (teoria * 0.4);
    }
}
