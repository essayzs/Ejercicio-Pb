import java.util.Scanner;

public class ejercicio120 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String respuesta;

        // Saludo inicial
        System.out.println("Hola usuario!");

        // Bucle para preguntar si desea seguir imprimiendo el saludo
        do {
            System.out.print("¿Desea que siga imprimiendo el saludo? [S/N]: ");
            respuesta = scanner.nextLine();

            if (respuesta.equalsIgnoreCase("S")) {
                System.out.println("Hola usuario!");
            } else if (!respuesta.equalsIgnoreCase("N")) {
                System.out.println("Respuesta no válida. Por favor, responda con S o N.");
            }
        } while (!respuesta.equalsIgnoreCase("N"));

        scanner.close();
    }
}
