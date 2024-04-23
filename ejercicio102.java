import java.util.Scanner;

public class ejercicio102 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el número de horas trabajadas y la tarifa por hora
        System.out.println("Ingrese el número de horas trabajadas:");
        int horasTrabajadas = scanner.nextInt();
        System.out.println("Ingrese la tarifa por hora:");
        double tarifaPorHora = scanner.nextDouble();

        // Calcular el salario
        double salario;
        if (horasTrabajadas > 40) {
            // Calcular el salario con horas extras (más de 40 horas)
            int horasExtras = horasTrabajadas - 40;
            double salarioBase = 40 * tarifaPorHora;
            double salarioHorasExtras = horasExtras * (tarifaPorHora * 1.25); // Incremento del 25% para horas extras
            salario = salarioBase + salarioHorasExtras;
        } else {
            // Calcular el salario sin horas extras (hasta 40 horas)
            salario = horasTrabajadas * tarifaPorHora;
        }

        // Mostrar el salario del trabajador
        System.out.println("El salario del trabajador es: $" + salario);

        scanner.close();
    }
}
