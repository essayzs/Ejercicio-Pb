import java.util.Scanner;
public class ejercicio54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la medida en centímetros
        System.out.println("Ingrese la medida en centímetros:");

        // Leer la medida en centímetros ingresada por el usuario
        double medidaCentimetros = scanner.nextDouble();

        // Convertir la medida de centímetros a pulgadas (1 pulgada = 2.54 centímetros)
        double medidaPulgadas = medidaCentimetros / 2.54;

        // Mostrar la medida en pulgadas
        System.out.println("La medida en pulgadas es: " + medidaPulgadas + " pulgadas.");

        scanner.close(); // Cerrar el scanner al finalizar
    }
}
