import java.util.Scanner;

public class ejercicio110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la temperatura del día
        System.out.println("Ingrese la temperatura del día:");
        double temperatura = scanner.nextDouble();

        // Determinar el comentario según la temperatura
        String comentario;
        if (temperatura >= 0 && temperatura <= 10) {
            comentario = "Mucho Frío";
        } else if (temperatura >= 11 && temperatura <= 18) {
            comentario = "Frío";
        } else if (temperatura >= 19 && temperatura <= 25) {
            comentario = "Templado";
        } else if (temperatura >= 26 && temperatura <= 40) {
            comentario = "Calor";
        } else {
            comentario = "Temperatura fuera de rango";
        }

        // Mostrar el comentario
        System.out.println("Comentario sobre la temperatura del día: " + comentario);

        scanner.close();
    }
}
