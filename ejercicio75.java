import java.util.Scanner;

public class ejercicio75 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el año:");
        int year = scanner.nextInt();

        boolean esBisiesto = verificarBisiesto(year);

        if (esBisiesto) {
            System.out.println(year + " es un año bisiesto.");
        } else {
            System.out.println(year + " no es un año bisiesto.");
        }

        scanner.close();
    }

    public static boolean verificarBisiesto(int year) {
        // Un año es bisiesto si es divisible por cuatro,
        // excepto si es divisible por 100, a no ser que sea divisible por 400.
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
