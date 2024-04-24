import java.util.Scanner;

public class ejercicio198 {
    private static final int[][] sudoku = new int[9][9];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        inicializarSudoku();
        mostrarSudoku();

        while (!sudokuCompleto()) {
            System.out.print("Ingrese la fila (1-9): ");
            int fila = scanner.nextInt();
            System.out.print("Ingrese la columna (1-9): ");
            int columna = scanner.nextInt();
            System.out.print("Ingrese el número (1-9): ");
            int numero = scanner.nextInt();

            if (validarMovimiento(fila - 1, columna - 1, numero)) {
                sudoku[fila - 1][columna - 1] = numero;
                mostrarSudoku();
            } else {
                System.out.println("Movimiento no válido. Inténtelo de nuevo.");
            }
        }

        System.out.println("¡Felicidades! Sudoku completado.");
        scanner.close();
    }

    private static void inicializarSudoku() {
        // Aquí puedes inicializar el sudoku con números aleatorios o dejarlo vacío
        // En este ejemplo, lo dejaremos vacío
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sudoku[i][j] = 0;
            }
        }
    }

    private static void mostrarSudoku() {
        System.out.println("-------------------");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + " ");
                if ((j + 1) % 3 == 0) {
                    System.out.print("| ");
                }
            }
            System.out.println();
            if ((i + 1) % 3 == 0) {
                System.out.println("-------------------");
            }
        }
    }

    private static boolean sudokuCompleto() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (sudoku[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean validarMovimiento(int fila, int columna, int numero) {
        // Validar fila y columna
        for (int i = 0; i < 9; i++) {
            if (sudoku[fila][i] == numero || sudoku[i][columna] == numero) {
                return false;
            }
        }

        // Validar sector (cuadrante 3x3)
        int sectorFilaInicio = fila - fila % 3;
        int sectorColumnaInicio = columna - columna % 3;
        for (int i = sectorFilaInicio; i < sectorFilaInicio + 3; i++) {
            for (int j = sectorColumnaInicio; j < sectorColumnaInicio + 3; j++) {
                if (sudoku[i][j] == numero) {
                    return false;
                }
            }
        }

        return true;
    }
}
