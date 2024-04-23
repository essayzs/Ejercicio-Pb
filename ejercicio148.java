import java.util.Scanner;

public class ejercicio148 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Array para almacenar las calificaciones de los alumnos
        int[][] calificaciones = new int[5][3];

        // Pedir al usuario que ingrese las calificaciones de los alumnos
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese las calificaciones del alumno " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                System.out.print("Examen " + (j + 1) + ": ");
                calificaciones[i][j] = scanner.nextInt();
            }
        }

        // Calcular el número de alumnos que aprobaron todos los exámenes
        int aprobadosTodos = contarAprobadosTodos(calificaciones);

        // Calcular el número de alumnos que aprobaron al menos un examen
        int aprobadosAlMenosUno = contarAprobadosAlMenosUno(calificaciones);

        // Calcular el número de alumnos que aprobaron únicamente el último examen
        int aprobadosUltimo = contarAprobadosUltimo(calificaciones);

        // Mostrar los resultados
        System.out.println("a) Alumnos que aprobaron todos los exámenes: " + aprobadosTodos);
        System.out.println("b) Alumnos que aprobaron al menos un examen: " + aprobadosAlMenosUno);
        System.out.println("c) Alumnos que aprobaron únicamente el último examen: " + aprobadosUltimo);

        // Cerrar el objeto Scanner
        scanner.close();
    }

    // Método para contar el número de alumnos que aprobaron todos los exámenes
    public static int contarAprobadosTodos(int[][] calificaciones) {
        int contador = 0;
        for (int i = 0; i < 5; i++) {
            if (calificaciones[i][0] >= 60 && calificaciones[i][1] >= 60 && calificaciones[i][2] >= 60) {
                contador++;
            }
        }
        return contador;
    }

    // Método para contar el número de alumnos que aprobaron al menos un examen
    public static int contarAprobadosAlMenosUno(int[][] calificaciones) {
        int contador = 0;
        for (int i = 0; i < 5; i++) {
            if (calificaciones[i][0] >= 60 || calificaciones[i][1] >= 60 || calificaciones[i][2] >= 60) {
                contador++;
            }
        }
        return contador;
    }

    // Método para contar el número de alumnos que aprobaron únicamente el último examen
    public static int contarAprobadosUltimo(int[][] calificaciones) {
        int contador = 0;
        for (int i = 0; i < 5; i++) {
            if (calificaciones[i][2] >= 60 && calificaciones[i][0] < 60 && calificaciones[i][1] < 60) {
                contador++;
            }
        }
        return contador;
    }
}
