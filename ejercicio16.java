import java.util.Scanner;
public class ejercicio16 {
    public static void main(String[] args) {
     // Crear un objeto Scanner para leer la entrada del usuario
     Scanner scanner = new Scanner(System.in);

     // Definir la puntuación mínima requerida para aprobar el examen
     final int PUNTUACION_MINIMA = 60;

     // Solicitar al usuario que ingrese su puntuación en el examen
     System.out.println("Ingrese su puntuación en el examen:");
     int puntuacion = scanner.nextInt();

     // Determinar si la persona ganó o no el examen
     if (puntuacion >= PUNTUACION_MINIMA) {
         System.out.println("¡Felicidades! Has ganado el examen.");
     } else {
         System.out.println("Lo siento, no has ganado el examen.");
     }

     // Cerrar el Scanner
     scanner.close();   
    }
}
