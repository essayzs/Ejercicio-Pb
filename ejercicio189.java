import java.util.Scanner;

public class ejercicio189 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario las coordenadas de inicio
        System.out.print("Ingrese la coordenada de inicio (x,y): ");
        int xInicio = scanner.nextInt();
        int yInicio = scanner.nextInt();

        // Solicitar al usuario las coordenadas de destino
        System.out.print("Ingrese la coordenada de destino (x,y): ");
        int xDestino = scanner.nextInt();
        int yDestino = scanner.nextInt();
        scanner.close();
        // Verificar si el movimiento del caballo es válido
        boolean esValido = validarMovimientoCaballo(xInicio, yInicio, xDestino, yDestino);

        // Mostrar el resultado
        if (esValido) {
            System.out.println("El movimiento del caballo es válido.");
        } else {
            System.out.println("El movimiento del caballo no es válido.");
        }
    }

    // Función para validar si un movimiento del caballo es válido
    public static boolean validarMovimientoCaballo(int xInicio, int yInicio, int xDestino, int yDestino) {
        // Verificar si el movimiento es válido
        int dx = Math.abs(xDestino - xInicio);
        int dy = Math.abs(yDestino - yInicio);
        return (dx == 1 && dy == 2) || (dx == 2 && dy == 1);
    }
}
