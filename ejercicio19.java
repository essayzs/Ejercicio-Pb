import java.util.Scanner;
public class ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el sueldo básico
        System.out.println("Ingrese el sueldo básico del empleado:");
        double sueldoBasico = scanner.nextDouble();

        // Solicitar el monto por horas extras
        System.out.println("Ingrese el monto por horas extras:");
        double horasExtras = scanner.nextDouble();

        // Calcular el total ganado antes del descuento
        double totalAntesDescuento = sueldoBasico + horasExtras;

        // Calcular el descuento del 20%
        double descuento = 0.20 * totalAntesDescuento;

        // Calcular el total ganado después del descuento
        double totalDespuesDescuento = totalAntesDescuento - descuento;

        // Imprimir los resultados
        System.out.println("Sueldo básico: " + sueldoBasico);
        System.out.println("Total del descuento (20%): " + descuento);
        System.out.println("Total ganado: " + totalDespuesDescuento);
        scanner.close();
    }
}
