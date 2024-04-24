import java.util.Scanner;

public class ejercicio165 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese la cantidad de horas, minutos y segundos
        System.out.print("Ingrese la cantidad de horas: ");
        int horas = scanner.nextInt();

        System.out.print("Ingrese la cantidad de minutos: ");
        int minutos = scanner.nextInt();

        System.out.print("Ingrese la cantidad de segundos: ");
        int segundos = scanner.nextInt();

        // Calcular el total de segundos
        int totalSegundos = horas * 3600 + minutos * 60 + segundos;

        // Mostrar el resultado
        System.out.println("\nEl total de segundos es: " + totalSegundos);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
