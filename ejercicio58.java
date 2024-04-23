import java.util.Scanner;

public class ejercicio58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese las horas trabajadas y el valor por hora
        System.out.println("Ingrese las horas trabajadas:");
        double horasTrabajadas = scanner.nextDouble();

        System.out.println("Ingrese el valor por hora:");
        double valorPorHora = scanner.nextDouble();

        // Calcular el salario
        double salario = calcularSalario(horasTrabajadas, valorPorHora);

        // Mostrar el salario
        System.out.println("El salario es: " + salario);

        scanner.close(); // Cerrar el scanner al finalizar
    }

    // Función para calcular el salario dado las horas trabajadas y el valor por hora
    public static double calcularSalario(double horasTrabajadas, double valorPorHora) {
        return horasTrabajadas * valorPorHora;
    }
}
