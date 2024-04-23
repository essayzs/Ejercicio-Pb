import java.util.Scanner;

public class ejercicio79 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el voltaje de una bombilla (en voltios):");
        double voltajeBombilla = scanner.nextDouble();

        double voltajeTotal = calcularVoltajeTotal(voltajeBombilla);

        System.out.println("El voltaje total de las tres bombillas en kilovoltios es: " + voltajeTotal);

        scanner.close();
    }

    public static double calcularVoltajeTotal(double voltajeBombilla) {
        // Convertimos el voltaje de una bombilla de voltios a kilovoltios
        double voltajeKilovoltios = voltajeBombilla / 1000;

        // El voltaje total es el mismo que el voltaje de una sola bombilla
        return voltajeKilovoltios;
    }
}
