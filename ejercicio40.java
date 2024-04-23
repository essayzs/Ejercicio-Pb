import java.util.Scanner;

public class ejercicio40 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de kilos de oro:");
        double kilosOro = scanner.nextDouble();

        System.out.println("Ingrese el precio en pesos por onza de oro:");
        double precioPorOnza = scanner.nextDouble();

        // Convertimos los kilos de oro a gramos
        double gramosOro = kilosOro * 1000;

        // Calculamos el precio por gramo de oro
        double precioPorGramo = precioPorOnza / 28.3495;

        // Calculamos el precio total en pesos
        double precioTotal = gramosOro * precioPorGramo;

        System.out.println("La cantidad de kilos de oro ingresados equivale a " + precioTotal + " pesos.");
        scanner.close();
    }
}
