import java.util.Scanner;
public class ejercicio26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese las longitudes de los catetos
        System.out.println("Ingrese la longitud del primer cateto (a):");
        double a = scanner.nextDouble();

        System.out.println("Ingrese la longitud del segundo cateto (b):");
        double b = scanner.nextDouble();

        // Calcular el cuadrado de la hipotenusa
        double cSquare = Math.pow(a, 2) + Math.pow(b, 2);

        // Mostrar el resultado como el cuadrado de la hipotenusa
        System.out.println("El cuadrado de la hipotenusa es: " + cSquare);

        scanner.close(); // Cerrar el scanner al finalizar
    }
}
