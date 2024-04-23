import java.util.Scanner;

public class ejercicio30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la distancia en kilómetros
        System.out.println("Ingrese la distancia en kilómetros:");

        // Leer la distancia en kilómetros ingresada por el usuario
        float distanciaKilometros = scanner.nextFloat();

        // Convertir la distancia de kilómetros a metros (1 km = 1000 m)
        float distanciaMetros = distanciaKilometros * 1000;

        // Mostrar la distancia en metros
        System.out.println("La distancia en metros es: " + distanciaMetros + " metros.");

        scanner.close(); // Cerrar el scanner al finalizar
    }
}
