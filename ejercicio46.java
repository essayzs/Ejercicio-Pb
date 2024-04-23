import java.util.Scanner;

public class ejercicio46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la distancia en millas:");
        double millas = scanner.nextDouble();

        // Convertimos las millas a metros utilizando la relación de conversión
        double metros = millas * 1852;

        System.out.println(millas + " millas equivale a " + metros + " metros.");
        scanner.close();
    }
}
