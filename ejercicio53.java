import java.util.Scanner;

public class ejercicio53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la longitud de un lado del cuadrado
        System.out.println("Ingrese la longitud de un lado del cuadrado:");
        double lado = scanner.nextDouble();

        // Calcular el área del cuadrado
        double area = lado * lado;

        // Mostrar el área del cuadrado
        System.out.println("El área del cuadrado es: " + area);
        scanner.close();
    }
}
