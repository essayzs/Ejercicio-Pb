import java.util.Scanner;

public class ejercicio128 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese el año
        System.out.print("Ingrese el año (formato de 4 dígitos): ");
        int año = scanner.nextInt();

        // Determinar si el año es bisiesto
        boolean esBisiesto = determinarBisiesto(año);

        // Mostrar si el año es bisiesto o no
        if (esBisiesto) {
            System.out.println("El año " + año + " es bisiesto.");
        } else {
            System.out.println("El año " + año + " no es bisiesto.");
        }

        scanner.close();
    }

    public static boolean determinarBisiesto(int año) {
        // Un año es bisiesto si es divisible por 4, excepto si es divisible por 100 pero no por 400
        return (año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0));
    }
}
