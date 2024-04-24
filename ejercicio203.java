import java.util.Scanner;

public class ejercicio203 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese su edad
        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        // Calcular el número de pulsaciones por cada 10 segundos
        double numPulsaciones = (220.0 - edad) / 10;

        // Mostrar el resultado
        System.out.println("El número de pulsaciones por cada 10 segundos es: " + numPulsaciones);

        // Cerrar el Scanner
        scanner.close();
    }
}
