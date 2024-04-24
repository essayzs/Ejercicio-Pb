import java.util.Scanner;

public class ejercicio190 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicializar las denominaciones monetarias
        int[] denominaciones = {1000, 500, 300, 200, 100};
        int[] cantidades = {0, 0, 0, 0, 0}; // Cantidades de cada denominación

        // Realizar 5 transacciones
        for (int i = 1; i <= 5; i++) {
            System.out.println("Transacción " + i);

            // Solicitar la cantidad a pagar
            System.out.print("Ingrese la cantidad a pagar: ");
            int cantidadPagar = scanner.nextInt();

            // Solicitar el pago del cliente
            System.out.print("Ingrese el pago del cliente: ");
            int pagoCliente = scanner.nextInt();

            // Calcular el cambio
            int cambio = pagoCliente - cantidadPagar;

            // Determinar las denominaciones monetarias para el cambio
            for (int j = 0; j < denominaciones.length; j++) {
                cantidades[j] = cambio / denominaciones[j];
                cambio %= denominaciones[j];
            }

            // Mostrar el cambio y las denominaciones utilizadas
            System.out.println("Cambio: " + (pagoCliente - cantidadPagar));
            System.out.println("Denominaciones utilizadas:");
            for (int j = 0; j < denominaciones.length; j++) {
                if (cantidades[j] > 0) {
                    System.out.println("$" + denominaciones[j] + " - Cantidad: " + cantidades[j]);
                }
            }
            System.out.println();
            scanner.close();
        }
    }
}
