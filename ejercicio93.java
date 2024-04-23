import java.util.Scanner;

public class ejercicio93 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el tiempo en minutos
        System.out.println("Ingrese el tiempo en minutos:");
        int minutos = scanner.nextInt();

        // Calcular horas, minutos y segundos
        int horas = minutos / 60;
        int minutosRestantes = minutos % 60;
        int segundos = minutosRestantes * 60;

        // Mostrar el tiempo en horas, minutos y segundos
        System.out.println("Tiempo ingresado:");
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutosRestantes);
        System.out.println("Segundos: " + segundos);

        scanner.close();
    }
}
