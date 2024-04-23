import java.util.Scanner;

public class ejercicio47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad comprada:");
        double cantidadComprada = scanner.nextDouble();

        System.out.println("Ingrese el precio de la compra:");
        double precioCompra = scanner.nextDouble();

        System.out.println("Ingrese el precio pagado:");
        double precioPagado = scanner.nextDouble();

        // Calculamos el descuento como la diferencia entre el precio de la compra y el precio pagado
        double descuento = precioCompra - precioPagado;

        // Calculamos el porcentaje de descuento
        double porcentajeDescuento = (descuento / precioCompra) * 100;

        System.out.println("El porcentaje de descuento aplicado es: " + porcentajeDescuento + "%");
        scanner.close();
    }
}
