import java.util.Scanner;

public class ejercicio84 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese una edad
        System.out.println("Ingrese su edad:");
        int edad = scanner.nextInt();

        // Mostrar la edad ingresada por el usuario
        System.out.println("La edad ingresada es: " + edad);

        scanner.close();
    }
}
