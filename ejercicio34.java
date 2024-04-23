import java.util.Scanner;

public class ejercicio34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el monto de la compra en pesos:");
        double montoCompra = scanner.nextDouble();

        double descuento = 0;

        if (montoCompra > 1000) {
            descuento = montoCompra * 0.10; // Descuento del 10%
        } else if (montoCompra > 500) {
            descuento = montoCompra * 0.20; // Descuento del 20%
        }

        double montoFinal = montoCompra - descuento;

        System.out.println("Monto de la compra: " + montoCompra + " pesos");
        
        if (descuento > 0) {
            System.out.println("Descuento aplicado: " + descuento + " pesos");
        } else {
            System.out.println("No se aplicó descuento");
        }

        System.out.println("Monto final a pagar: " + montoFinal + " pesos");
        scanner.close();
    }
}
