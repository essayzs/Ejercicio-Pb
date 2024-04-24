import java.util.Scanner;

public class ejercicio212 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Definir la ganancia del vendedor y el impuesto
        double gananciaVendedor = 0.12; // 12%
        double impuesto = 0.06; // 6%

        // Solicitar al usuario que ingrese el coste total del automóvil
        System.out.print("Ingrese el coste total del automóvil: ");
        double costeTotal = scanner.nextDouble();

        // Calcular el coste para el consumidor
        double costeConsumidor = costeTotal * (1 + gananciaVendedor + impuesto);

        // Mostrar el coste para el consumidor
        System.out.println("El coste para el consumidor es: " + costeConsumidor);

        // Cerrar el Scanner
        scanner.close();
    }
}
