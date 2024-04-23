import java.util.Scanner;

public class ejercicio99 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un año
        System.out.println("Ingrese un año:");
        int año = scanner.nextInt();

        // Determinar si el año es bisiesto utilizando la función esBisiesto
        if (esBisiesto(año)) {
            System.out.println(año + " es un año bisiesto");
        } else {
            System.out.println(año + " no es un año bisiesto");
        }

        scanner.close();
    }

    // Función para determinar si un año es bisiesto
    public static boolean esBisiesto(int año) {
        // Un año es bisiesto si es divisible por 4, excepto cuando es divisible por 100 pero no por 400
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
    }
}
