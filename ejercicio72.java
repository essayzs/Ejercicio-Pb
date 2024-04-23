import java.util.Scanner;

public class ejercicio72 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de horas trabajadas:");
        double horasTrabajadas = scanner.nextDouble();

        System.out.println("Ingrese la tarifa por hora:");
        double tarifaPorHora = scanner.nextDouble();

        double salario = calcularSalario(horasTrabajadas, tarifaPorHora);
        System.out.println("El salario del trabajador es: $" + salario);

        scanner.close();
    }

    public static double calcularSalario(double horasTrabajadas, double tarifaPorHora) {
        double salario;

        if (horasTrabajadas > 40) {
            double horasRegulares = 40;
            double horasExtras = horasTrabajadas - 40;
            double tarifaPorHoraExtra = tarifaPorHora * 1.5; // Incremento del 50% para horas extras
            salario = horasRegulares * tarifaPorHora + horasExtras * tarifaPorHoraExtra;
        } else {
            salario = horasTrabajadas * tarifaPorHora;
        }

        return salario;
    }
}
