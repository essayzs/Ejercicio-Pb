import java.util.Scanner;
public class ejercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la cantidad de grados centígrados
        System.out.println("Ingrese la cantidad de grados centígrados a convertir:");
        double gradosCentigrados = scanner.nextDouble();

        // Realizar la conversión a grados Fahrenheit
        double gradosFahrenheit = (gradosCentigrados * 9 / 5) + 32;

        // Mostrar el resultado de la conversión
        System.out.println(gradosCentigrados + " grados centígrados equivalen a " + gradosFahrenheit + " grados Fahrenheit.");
        scanner.close();
    }
}
