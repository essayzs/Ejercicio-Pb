import java.util.Scanner;

public class ejercicio35 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de horas trabajadas:");
        int horasTrabajadas = scanner.nextInt();

        System.out.println("Ingrese la tarifa por hora:");
        double tarifaPorHora = scanner.nextDouble();

        double salario;

        if (horasTrabajadas <= 40) {
            salario = horasTrabajadas * tarifaPorHora;
        } else {
            // Calcula el salario normal hasta 40 horas
            double salarioNormal = 40 * tarifaPorHora;
            // Calcula el salario por las horas extras (con un 50% más de la tarifa)
            double salarioExtra = (horasTrabajadas - 40) * (tarifaPorHora * 1.5);
            // Suma los dos salarios
            salario = salarioNormal + salarioExtra;
        }

        System.out.println("El salario del profesor es: " + salario);
        scanner.close();
    }
}
