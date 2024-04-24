import java.util.Scanner;

public class ejercicio208 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese las calificaciones parciales
        System.out.println("Ingresa las calificaciones parciales:");
        double calificacionParcial1 = scanner.nextDouble();
        double calificacionParcial2 = scanner.nextDouble();
        double calificacionParcial3 = scanner.nextDouble();

        // Solicitar al usuario que ingrese la calificación de prácticas
        System.out.print("Ingresa la calificación de prácticas: ");
        double calificacionPracticas = scanner.nextDouble();

        // Solicitar al usuario que ingrese la calificación de asistencia
        System.out.print("Ingresa la calificación de asistencia: ");
        double calificacionAsistencia = scanner.nextDouble();

        // Calcular el promedio de las calificaciones parciales
        double promedioParciales = (calificacionParcial1 + calificacionParcial2 + calificacionParcial3) / 3;

        // Calcular la calificación final
        double calificacionFinal = (promedioParciales * 0.6) + (calificacionPracticas * 0.3) + (calificacionAsistencia * 0.1);

        // Mostrar la calificación final
        System.out.println("La calificación final es: " + calificacionFinal);

        // Cerrar el Scanner
        scanner.close();
    }
}
