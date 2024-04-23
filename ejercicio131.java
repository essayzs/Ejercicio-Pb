import java.util.Scanner;

public class ejercicio131 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese la tarifa por hora y las horas trabajadas
        System.out.print("Ingrese la tarifa por hora: ");
        double tarifaPorHora = scanner.nextDouble();
        System.out.print("Ingrese las horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();

        // Calcular el salario total del trabajador
        double salarioTotal = calcularSalarioTotal(tarifaPorHora, horasTrabajadas);

        // Mostrar el salario total del trabajador
        System.out.println("El salario total del trabajador es: $" + salarioTotal);

        scanner.close();
    }

    public static double calcularSalarioTotal(double tarifaPorHora, int horasTrabajadas) {
        double salarioTotal;

        // Si las horas trabajadas son menos o iguales a 40, se calcula normalmente
        if (horasTrabajadas <= 40) {
            salarioTotal = tarifaPorHora * horasTrabajadas;
        } else {
            // Si las horas trabajadas son más de 40, se calculan las horas extras al doble
            int horasNormales = 40;
            int horasExtras = horasTrabajadas - horasNormales;
            salarioTotal = (tarifaPorHora * horasNormales) + (tarifaPorHora * 2 * horasExtras);
        }

        return salarioTotal;
    }
}
