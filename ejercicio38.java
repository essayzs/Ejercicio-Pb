import java.util.Scanner;

public class ejercicio38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la edad de la persona:");
        int edad = scanner.nextInt();

        // Calculamos la cantidad de fruta en kilogramos consumida
        double frutaKg = edad * 8;

        // Convertimos los kilogramos de fruta a gramos
        double frutaGramos = frutaKg * 1000;

        // Calculamos la cantidad de manzanas consumidas
        int manzanasConsumidas = (int) (frutaGramos / 4);

        System.out.println("La persona ha consumido " + frutaGramos + " gramos de fruta.");

        System.out.println("La persona ha consumido " + manzanasConsumidas + " manzanas.");
        scanner.close();
    }
}
