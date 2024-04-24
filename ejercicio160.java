import java.util.Scanner;

public class ejercicio160 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el tiempo en segundos
        System.out.print("Ingresa el tiempo en segundos: ");
        int segundos = scanner.nextInt();

        // Calcular los días, horas y minutos
        int dias = segundos / (24 * 3600);
        segundos %= (24 * 3600);
        int horas = segundos / 3600;
        segundos %= 3600;
        int minutos = segundos / 60;
        segundos %= 60;

        // Mostrar el resultado
        System.out.println("Días: " + dias);
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
