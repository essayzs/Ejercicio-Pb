import java.util.Scanner;

public class ejercicio109 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el monto de la venta
        System.out.println("Ingrese el monto de la venta:");
        double montoVenta = scanner.nextDouble();

        // Aplicar el descuento solo si el monto de la venta es mayor a 1000 pesos
        if (montoVenta > 1000) {
            double descuento = montoVenta * 0.10; // Calcular el descuento del 10%
            double montoNeto = montoVenta - descuento;
            System.out.println("El monto neto de la venta con descuento es: " + montoNeto);
        } else {
            // Si el monto de la venta es menor o igual a 1000 pesos, no se aplica descuento
            System.out.println("El monto neto de la venta sin descuento es: " + montoVenta);
        }

        scanner.close();
    }

}
