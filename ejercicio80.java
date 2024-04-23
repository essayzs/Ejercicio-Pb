import java.util.Scanner;

public class ejercicio80 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número entero
        System.out.println("Ingrese un número entero:");
        int entero = scanner.nextInt();

        // Solicitar al usuario que ingrese un número real
        System.out.println("Ingrese un número real:");
        double real = scanner.nextDouble();

        // Mostrar los datos ingresados por el usuario
        System.out.println("El número entero ingresado es: " + entero);
        System.out.println("El número real ingresado es: " + real);

        scanner.close();
    }
}
