import java.util.Scanner;

public class ejercicio86 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese cinco voltajes
        System.out.println("Ingrese cinco voltajes:");
        double voltaje1 = scanner.nextDouble();
        double voltaje2 = scanner.nextDouble();
        double voltaje3 = scanner.nextDouble();
        double voltaje4 = scanner.nextDouble();
        double voltaje5 = scanner.nextDouble();

        // Calcular el promedio de los cinco voltajes
        double promedio = (voltaje1 + voltaje2 + voltaje3 + voltaje4 + voltaje5) / 5;

        // Verificar si el promedio es mayor a 220 y mostrar el resultado
        if (promedio > 220) {
            System.out.println("ALTO VOLTAJE");
        } else {
            System.out.println("VOLTAJE CORRECTO");
        }

        scanner.close();
    }
}