import java.util.Scanner;

public class ejercicio216 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario las calificaciones y promedios de tareas en cada materia
        System.out.println("Ingrese la calificación del examen de Matemáticas (0-100):");
        double calificacionMatematicasExamen = scanner.nextDouble();

        System.out.println("Ingrese el promedio de tareas en Matemáticas (0-100):");
        double promedioTareasMatematicas = scanner.nextDouble();

        System.out.println("Ingrese la calificación del examen de Física (0-100):");
        double calificacionFisicaExamen = scanner.nextDouble();

        System.out.println("Ingrese el promedio de tareas en Física (0-100):");
        double promedioTareasFisica = scanner.nextDouble();

        System.out.println("Ingrese la calificación del examen de Química (0-100):");
        double calificacionQuimicaExamen = scanner.nextDouble();

        System.out.println("Ingrese el promedio de tareas en Química (0-100):");
        double promedioTareasQuimica = scanner.nextDouble();

        // Calcular las calificaciones finales en cada materia
        double calificacionFinalMatematicas = calificacionMatematicasExamen * 0.9 + promedioTareasMatematicas * 0.1;
        double calificacionFinalFisica = calificacionFisicaExamen * 0.8 + promedioTareasFisica * 0.2;
        double calificacionFinalQuimica = calificacionQuimicaExamen * 0.85 + promedioTareasQuimica * 0.15;

        // Calcular el promedio general en las tres materias más difíciles
        double promedioGeneral = (calificacionFinalMatematicas + calificacionFinalFisica + calificacionFinalQuimica) / 3;

        // Mostrar los resultados
        System.out.println("Promedio en Matemáticas: " + calificacionFinalMatematicas);
        System.out.println("Promedio en Física: " + calificacionFinalFisica);
        System.out.println("Promedio en Química: " + calificacionFinalQuimica);
        System.out.println("Promedio general en las tres materias más difíciles: " + promedioGeneral);

        // Cerrar el Scanner
        scanner.close();
    }
}
