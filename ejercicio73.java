import java.util.Scanner;

public class ejercicio73 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el sueldo del trabajador:");
        double sueldo = scanner.nextDouble();

        double descuento = calcularDescuento(sueldo);
        double sueldoNeto = sueldo - descuento;

        System.out.println("El descuento es: $" + descuento);
        System.out.println("El sueldo neto del trabajador es: $" + sueldoNeto);

        scanner.close();
    }

    public static double calcularDescuento(double sueldo) {
        double descuento = 0;

        if (sueldo <= 1000) {
            descuento = sueldo * 0.10; // 10% de descuento
        } else if (sueldo > 1000 && sueldo <= 2000) {
            descuento = 1000 * 0.10 + (sueldo - 1000) * 0.05; // 10% hasta 1000 y 5% del excedente
        } else {
            descuento = 1000 * 0.10 + 1000 * 0.05 + (sueldo - 2000) * 0.03; // 10% hasta 1000, 5% hasta 2000 y 3% del excedente
        }

        return descuento;
    }
}
