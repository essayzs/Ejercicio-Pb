import java.util.Scanner;

public class ejercicio92 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el tamaño de los vectores
        System.out.println("Ingrese el tamaño de los vectores:");
        int n = scanner.nextInt();

        // Crear los vectores
        int[] vector1 = new int[n];
        int[] vector2 = new int[n];

        // Solicitar al usuario que ingrese los elementos del primer vector
        System.out.println("Ingrese los elementos del primer vector:");
        for (int i = 0; i < n; i++) {
            vector1[i] = scanner.nextInt();
        }

        // Solicitar al usuario que ingrese los elementos del segundo vector
        System.out.println("Ingrese los elementos del segundo vector:");
        for (int i = 0; i < n; i++) {
            vector2[i] = scanner.nextInt();
        }

        // Calcular el producto escalar
        int productoEscalar = calcularProductoEscalar(vector1, vector2);

        // Mostrar el producto escalar
        System.out.println("El producto escalar de los vectores es: " + productoEscalar);

        scanner.close();
    }

    // Función para calcular el producto escalar de dos vectores
    public static int calcularProductoEscalar(int[] vector1, int[] vector2) {
        int productoEscalar = 0;
        for (int i = 0; i < vector1.length; i++) {
            productoEscalar += vector1[i] * vector2[i];
        }
        return productoEscalar;
    }
}
