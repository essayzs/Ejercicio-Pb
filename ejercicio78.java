import java.util.Scanner;

public class ejercicio78 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el monto:");
        double monto = scanner.nextDouble();

        double descuento = calcularDescuento(monto);

        System.out.println("El descuento es: $" + descuento);

        scanner.close();
    }

    public static double calcularDescuento(double monto) {
        double descuento;

        if (monto > 10000) {
            // Descuento del 20% para montos mayores a 10000
            descuento = monto * 0.20;
        } else {
            // Descuento del 10% para montos menores o iguales a 10000
            descuento = monto * 0.10;
        }

        return descuento;
    }
}
