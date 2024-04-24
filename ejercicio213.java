import java.util.Scanner;

public class ejercicio213 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese los tiempos de carrera en minutos para los días lunes, miércoles y viernes
        System.out.print("Ingrese el tiempo de carrera en minutos para el día lunes: ");
        double tiempoLunes = scanner.nextDouble();

        System.out.print("Ingrese el tiempo de carrera en minutos para el día miércoles: ");
        double tiempoMiercoles = scanner.nextDouble();

        System.out.print("Ingrese el tiempo de carrera en minutos para el día viernes: ");
        double tiempoViernes = scanner.nextDouble();

        // Calcular el tiempo promedio de la semana
        double tiempoPromedio = (tiempoLunes + tiempoMiercoles + tiempoViernes) / 3;

        // Mostrar el tiempo promedio de la semana
        System.out.println("El tiempo promedio de la semana es: " + tiempoPromedio + " minutos");

        // Cerrar el Scanner
        scanner.close();
    }
}
