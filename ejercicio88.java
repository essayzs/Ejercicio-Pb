import java.util.Scanner;

public class ejercicio88 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese tres voltajes distintos
        System.out.println("Ingrese tres voltajes distintos:");
        double voltaje1 = scanner.nextDouble();
        double voltaje2 = scanner.nextDouble();
        double voltaje3 = scanner.nextDouble();

        // Calcular el promedio de los tres voltajes
        double promedio = (voltaje1 + voltaje2 + voltaje3) / 3;

        // Determinar el mensaje a mostrar según el promedio de los voltajes
        String mensaje;
        if (promedio < 115) {
            mensaje = "VOLTAJE CORRECTO";
        } else if (promedio >= 115 && promedio < 220) {
            mensaje = "ALTO VOLTAJE";
        } else {
            mensaje = "PELIGRO";
        }

        // Mostrar el mensaje correspondiente
        System.out.println(mensaje);

        scanner.close();
    }
}
