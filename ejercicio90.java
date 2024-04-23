import java.util.Scanner;

public class ejercicio90 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar la matriz
        System.out.println("Ingrese la matriz (filas columnas):");
        int filas = scanner.nextInt();
        int columnas = scanner.nextInt();
        int[][] matriz = new int[filas][columnas];

        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Ingresar el vector
        System.out.println("Ingrese el tamaño del vector:");
        int n = scanner.nextInt();
        int[] vector = new int[n];

        System.out.println("Ingrese los elementos del vector:");
        for (int i = 0; i < n; i++) {
            vector[i] = scanner.nextInt();
        }

        // Contar la cantidad de números primos en la matriz y el vector
        int cantidadPrimosMatriz = contarPrimos(matriz);
        int cantidadPrimosVector = contarPrimos(vector);

        // Mostrar los resultados
        System.out.println("La cantidad de números primos en la matriz es: " + cantidadPrimosMatriz);
        System.out.println("La cantidad de números primos en el vector es: " + cantidadPrimosVector);

        scanner.close();
    }

    // Función para contar la cantidad de números primos en una matriz
    public static int contarPrimos(int[][] matriz) {
        int count = 0;
        for (int[] fila : matriz) {
            for (int num : fila) {
                if (esPrimo(num)) {
                    count++;
                }
            }
        }
        return count;
    }

    // Función para contar la cantidad de números primos en un vector
    public static int contarPrimos(int[] vector) {
        int count = 0;
        for (int num : vector) {
            if (esPrimo(num)) {
                count++;
            }
        }
        return count;
    }

    // Función para verificar si un número es primo
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
