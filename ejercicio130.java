import java.util.Scanner;

public class ejercicio130 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el monto del préstamo
        System.out.print("Ingrese el monto del préstamo: ");
        double montoPrestamo = scanner.nextDouble();

        // Pedir al usuario que ingrese el plazo en meses (12 o 24)
        System.out.print("Ingrese el plazo en meses (12 o 24): ");
        int plazoMeses = scanner.nextInt();

        // Calcular la cuota mensual
        double tasaInteresMensual = 0.02; // 2% de interés mensual
        double cuotaMensual = calcularCuotaMensual(montoPrestamo, tasaInteresMensual, plazoMeses);

        // Calcular el monto total a pagar
        double montoTotalPagar = cuotaMensual * plazoMeses;

        // Mostrar el monto total a pagar por mes y el monto total a pagar
        System.out.println("El monto total a pagar por mes es: " + cuotaMensual);
        System.out.println("El monto total a pagar es: " + montoTotalPagar);

        scanner.close();
    }

    public static double calcularCuotaMensual(double montoPrestamo, double tasaInteresMensual, int plazoMeses) {
        // Calcular la cuota mensual utilizando la fórmula de cuota fija
        double cuotaMensual = montoPrestamo * (tasaInteresMensual * Math.pow(1 + tasaInteresMensual, plazoMeses))
                / (Math.pow(1 + tasaInteresMensual, plazoMeses) - 1);
        return cuotaMensual;
    }
}
