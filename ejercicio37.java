import java.util.Scanner;

public class ejercicio37 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de horas de estacionamiento:");
        int horas = scanner.nextInt();

        System.out.println("Ingrese la cantidad de minutos de estacionamiento:");
        int minutos = scanner.nextInt();

        // Calculamos el tiempo total de estacionamiento en horas
        double tiempoTotal = horas + (minutos / 60.0);

        // Si los minutos no exceden los 10 y las horas son mayores o iguales a 1, no se cobra la hora
        if (minutos <= 10 && horas >= 1) {
            tiempoTotal = Math.ceil(tiempoTotal - 1); // Se resta 1 hora al tiempo total y se redondea hacia arriba
        } else {
            tiempoTotal = Math.ceil(tiempoTotal); // Se redondea hacia arriba al número entero más cercano
        }

        // Calculamos el costo total de estacionamiento
        double costoEstacionamiento = tiempoTotal * 15.00;

        System.out.println("El cliente debe pagar: $" + costoEstacionamiento);
        scanner.close();
    }
}
