import java.util.Scanner;

public class ejercicio187 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la posición actual de la reina
        System.out.print("Ingrese la posición actual de la reina (fila columna): ");
        int filaActual = scanner.nextInt();
        int columnaActual = scanner.nextInt();

        // Solicitar al usuario la posición a la cual se moverá la reina
        System.out.print("Ingrese la posición a la cual se moverá la reina (fila columna): ");
        int filaDestino = scanner.nextInt();
        int columnaDestino = scanner.nextInt();

        // Verificar si el movimiento es válido
        boolean movimientoValido = esMovimientoValido(filaActual, columnaActual, filaDestino, columnaDestino);

        // Mostrar el resultado
        if (movimientoValido) {
            System.out.println("El movimiento es válido.");
        } else {
            System.out.println("El movimiento no es válido.");
            scanner.close();
        }
    }

    // Función para verificar si el movimiento de la reina es válido
    public static boolean esMovimientoValido(int filaActual, int columnaActual, int filaDestino, int columnaDestino) {
        // Verificar si la fila o la columna son las mismas (movimiento en línea recta)
        if (filaActual == filaDestino || columnaActual == columnaDestino) {
            return true;
        }

        // Verificar si el movimiento es en diagonal
        int diferenciaFilas = Math.abs(filaDestino - filaActual);
        int diferenciaColumnas = Math.abs(columnaDestino - columnaActual);
        return diferenciaFilas == diferenciaColumnas;
    }
}
