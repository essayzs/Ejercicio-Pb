import java.util.Scanner;

public class ejercicio89 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la distancia en metros
        System.out.println("Ingrese la distancia en metros:");
        double distanciaMetros = scanner.nextDouble();

        // Convertir la distancia de metros a kilómetros
        double distanciaKilometros = convertirMetrosAKilometros(distanciaMetros);

        // Mostrar la distancia en kilómetros
        System.out.println("La distancia en kilómetros es: " + distanciaKilometros + " km");

        scanner.close();
    }

    public static double convertirMetrosAKilometros(double metros) {
        // 1 kilómetro = 1000 metros
        return metros / 1000;
    }
}
