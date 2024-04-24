import java.util.Scanner;

public class ejercicio173 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Inicializar variables para el total de la factura y la cantidad total de productos
        double totalFactura = 0;
        int cantidadTotal = 0;

        // Iterar hasta que se ingrese una cantidad de 0
        while (true) {
            // Pedir al usuario que ingrese la cantidad vendida
            System.out.print("Introduzca la cantidad vendida (0 para terminar): ");
            int cantidad = scanner.nextInt();

            // Salir del bucle si la cantidad es 0
            if (cantidad == 0) {
                break;
            }

            // Pedir al usuario que ingrese el precio
            System.out.print("Introduzca el precio: ");
            double precio = scanner.nextDouble();

            // Calcular el subtotal para esta cantidad y precio
            double subtotal = cantidad * precio;

            // Actualizar el total de la factura y la cantidad total de productos
            totalFactura += subtotal;
            cantidadTotal += cantidad;
        }

        // Mostrar el total a pagar y la cantidad total de productos
        System.out.println("Total a pagar: $" + totalFactura);
        System.out.println("Cantidad total de productos: " + cantidadTotal);

        // Cerrar el objeto Scanner
        scanner.close();
    } 
}
