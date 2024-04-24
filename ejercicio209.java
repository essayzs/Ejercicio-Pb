import java.util.Scanner;

public class ejercicio209 {
    public static void main(String[] args) {
    // Crear un objeto Scanner para leer la entrada del usuario
    Scanner scanner = new Scanner(System.in);

    // Solicitar al usuario que ingrese el número de reprobados, aprobados y sobresalientes
    System.out.print("Ingresa el número de reprobados: ");
    int reprobados = scanner.nextInt();

    System.out.print("Ingresa el número de aprobados: ");
    int aprobados = scanner.nextInt();

    System.out.print("Ingresa el número de sobresalientes: ");
    int sobresalientes = scanner.nextInt();

    // Calcular el total de alumnos
    int totalAlumnos = reprobados + aprobados + sobresalientes;

    // Calcular el porcentaje de alumnos que han superado la asignatura
    double porcentajeSuperados = ((aprobados + sobresalientes) * 100.0) / totalAlumnos;

    // Calcular el porcentaje de reprobados, aprobados, notables y sobresalientes
    double porcentajeReprobados = (reprobados * 100.0) / totalAlumnos;
    double porcentajeAprobados = (aprobados * 100.0) / totalAlumnos;
    double porcentajeSobresalientes = (sobresalientes * 100.0) / totalAlumnos;

    // Mostrar los resultados
    System.out.println("Porcentaje de alumnos que han superado la asignatura: " + porcentajeSuperados + "%");
    System.out.println("Porcentaje de reprobados: " + porcentajeReprobados + "%");
    System.out.println("Porcentaje de aprobados: " + porcentajeAprobados + "%");
    System.out.println("Porcentaje de sobresalientes: " + porcentajeSobresalientes + "%");

    // Cerrar el Scanner
    scanner.close();
}
    }

