import java.util.Scanner;

public class ejercicio113 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double DISTANCIA_MONTERREY_KM = 500; // Distancia a Monterrey en kilómetros

        // Mostrar las opciones de transporte y sus rendimientos de combustible
        System.out.println("Seleccione el tipo de transporte:");
        System.out.println("1) Motocicleta (20 km/lt)");
        System.out.println("2) Automóvil (10 km/lt)");
        System.out.println("3) Pickup (5 km/lt)");

        // Leer la opción de transporte elegida por el usuario
        System.out.print("Elija una opción (1-3): ");
        int opcionTransporte = scanner.nextInt();

        double rendimiento; // Rendimiento de combustible del vehículo en km/lt
        switch (opcionTransporte) {
            case 1:
                rendimiento = 20;
                break;
            case 2:
                rendimiento = 10;
                break;
            case 3:
                rendimiento = 5;
                break;
            default:
                System.out.println("Opción inválida.");
                scanner.close();
                return;
        }

        // Calcular la cantidad de litros necesarios para el viaje a Monterrey
        double litrosNecesarios = DISTANCIA_MONTERREY_KM / rendimiento;

        // Calcular el costo total de la gasolina asumiendo un precio por litro
        double precioGasolinaPorLitro = 20; // Precio de la gasolina por litro (ejemplo)
        double costoGasolina = litrosNecesarios * precioGasolinaPorLitro;

        // Mostrar el costo total de la gasolina para el viaje
        System.out.printf("El costo estimado de gasolina para viajar a Monterrey en %s es: $%.2f%n",
                obtenerNombreTransporte(opcionTransporte), costoGasolina);

        scanner.close();
    }

    // Función para obtener el nombre del tipo de transporte según la opción elegida
    private static String obtenerNombreTransporte(int opcion) {
        switch (opcion) {
            case 1:
                return "Motocicleta";
            case 2:
                return "Automóvil";
            case 3:
                return "Pickup";
            default:
                return "Desconocido";
        }
    }
}
