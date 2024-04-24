import java.util.Scanner;

public class ejercicio164 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Variables para almacenar la cantidad de boletos vendidos y la venta bruta
        int totalBoletos = 0;
        int ventaBruta = 0;

        // Variables para contar la cantidad de boletos vendidos de cada tipo
        int boletosAdulto = 0;
        int boletosNino = 0;
        int boletosPromocion = 0;

        // Pedir datos al menos en 10 ocasiones
        for (int i = 1; i <= 10; i++) {
            System.out.println("Venta #" + i);
            System.out.println("Seleccione el tipo de boleto vendido:");
            System.out.println("1. Adulto ($60)");
            System.out.println("2. Niño ($30)");
            System.out.println("3. Promoción ($20)");

            // Leer la opción del usuario
            int opcion = scanner.nextInt();

            // Actualizar las variables según el tipo de boleto vendido
            switch (opcion) {
                case 1:
                    totalBoletos++;
                    ventaBruta += 60;
                    boletosAdulto++;
                    break;
                case 2:
                    totalBoletos++;
                    ventaBruta += 30;
                    boletosNino++;
                    break;
                case 3:
                    totalBoletos++;
                    ventaBruta += 20;
                    boletosPromocion++;
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    i--; // Decrementar i para repetir la iteración
                    break;
            }
        }

        // Mostrar el resumen
        System.out.println("\nResumen de ventas:");
        System.out.println("Total de boletos vendidos: " + totalBoletos);
        System.out.println("Venta bruta total: $" + ventaBruta);
        System.out.println("Boletos de tipo Adulto vendidos: " + boletosAdulto);
        System.out.println("Boletos de tipo Niño vendidos: " + boletosNino);
        System.out.println("Boletos de tipo Promoción vendidos: " + boletosPromocion);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
