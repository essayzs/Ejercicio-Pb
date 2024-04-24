import java.util.Scanner;

public class ejercicio179 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario las calificaciones
        System.out.println("Ingrese las calificaciones del alumno:");
        System.out.print("Matemáticas: ");
        double matematicas = scanner.nextDouble();
        System.out.print("Inglés: ");
        double ingles = scanner.nextDouble();
        System.out.print("Español: ");
        double espanol = scanner.nextDouble();

        // Calcular el promedio
        double promedio = (matematicas + ingles + espanol) / 3;

        // Calcular el total de materias aprobadas y reprobadas
        int materiasAprobadas = 0;
        int materiasReprobadas = 0;
        if (matematicas >= 6) {
            materiasAprobadas++;
        } else {
            materiasReprobadas++;
        }
        if (ingles >= 6) {
            materiasAprobadas++;
        } else {
            materiasReprobadas++;
        }
        if (espanol >= 6) {
            materiasAprobadas++;
        } else {
            materiasReprobadas++;
        }

        // Determinar la materia con menor calificación
        String materiaMenorCalificacion = "";
        double menorCalificacion = Math.min(matematicas, Math.min(ingles, espanol));
        if (menorCalificacion == matematicas) {
            materiaMenorCalificacion = "Matemáticas";
        } else if (menorCalificacion == ingles) {
            materiaMenorCalificacion = "Inglés";
        } else {
            materiaMenorCalificacion = "Español";
        }

        // Mostrar los resultados
        System.out.println("\nPromedio: " + promedio);
        System.out.println("Materias aprobadas: " + materiasAprobadas);
        System.out.println("Materias reprobadas: " + materiasReprobadas);
        System.out.println("Materia con menor calificación: " + materiaMenorCalificacion);
        scanner.close();
    }
}
