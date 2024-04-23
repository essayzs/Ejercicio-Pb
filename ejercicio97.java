import java.util.Scanner;

public class ejercicio97 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el consumo en kW
        System.out.println("Ingrese el consumo en kW:");
        double consumo = scanner.nextDouble();

        // Calcular el porcentaje de consumo en relación con 10000 kW
        double porcentajeConsumo = (consumo / 10000) * 100;

        // Determinar la eficiencia energética y mostrar el resultado
        if (porcentajeConsumo >= 80 && porcentajeConsumo <= 100) {
            System.out.println("CONSUMO MEDIO");
        } else if (porcentajeConsumo > 100) {
            System.out.println("ALTO CONSUMO DE ENERGÍA");
        } else {
            System.out.println("El consumo ingresado está por debajo del 80%");
        }

        scanner.close();
    }
}
