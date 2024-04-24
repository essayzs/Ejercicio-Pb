import java.util.Scanner;

public class ejercicio199 {
    private static final char[][] tablero = new char[8][8];
    private static int puntosJugador1 = 0;
    private static int puntosJugador2 = 0;

    public static void main(String[] args) {
        inicializarTablero();
        mostrarTablero();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Ingrese la fila del peón (0-7): ");
            int fila = scanner.nextInt();
            System.out.print("Ingrese la columna del peón (0-7): ");
            int columna = scanner.nextInt();
            System.out.print("Ingrese el jugador (1 o 2): ");
            int jugador = scanner.nextInt();
            scanner.close();

            if (validarMovimiento(fila, columna, jugador)) {
                tablero[fila][columna] = (char) (jugador + '0'); // Colocar el peón en el tablero
                if (jugador == 1) {
                    puntosJugador1++;
                } else {
                    puntosJugador2++;
                }
                mostrarTablero();
                System.out.println("Puntos del jugador 1: " + puntosJugador1);
                System.out.println("Puntos del jugador 2: " + puntosJugador2);
            } else {
                System.out.println("Movimiento no válido. Inténtelo de nuevo.");
            }
        }
    }

    private static void inicializarTablero() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tablero[i][j] = '.';
            }
        }
    }

    private static void mostrarTablero() {
        System.out.println("  0 1 2 3 4 5 6 7");
        for (int i = 0; i < 8; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 8; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean validarMovimiento(int fila, int columna, int jugador) {
        if (fila < 0 || fila > 7 || columna < 0 || columna > 7) {
            return false; // Fuera del tablero
        }

        if (tablero[fila][columna] != '.') {
            return false; // La casilla ya está ocupada
        }

        if (jugador == 1 && fila < 7) {
            return true; // El jugador 1 solo puede mover hacia arriba
        }

        if (jugador == 2 && fila > 0) {
            return true; // El jugador 2 solo puede mover hacia abajo
        }

        return false; // Movimiento no permitido para el jugador
    }
}
