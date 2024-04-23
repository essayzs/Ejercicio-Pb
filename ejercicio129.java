import java.util.Scanner;

public class ejercicio129 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese el número del mes y el año
        System.out.print("Ingrese el número del mes (1-12): ");
        int mes = scanner.nextInt();
        System.out.print("Ingrese el año: ");
        int año = scanner.nextInt();

        // Determinar el número total de días para el mes ingresado
        int numDias = determinarNumDias(mes, año);

        // Mostrar el número total de días para el mes ingresado
        System.out.println("El número total de días para el mes " + mes + " del año " + año + " es: " + numDias);

        scanner.close();
    }

    public static int determinarNumDias(int mes, int año) {
        // Array con el número total de días para cada mes
        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Ajustar el número de días para febrero en años bisiestos
        if (esBisiesto(año) && mes == 2) {
            return 29;
        }

        // Devolver el número total de días para el mes ingresado
        return diasPorMes[mes - 1];
    }

    public static boolean esBisiesto(int año) {
        // Un año es bisiesto si es divisible por 4, excepto si es divisible por 100 pero no por 400
        return (año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0));
    }
}
