import java.util.Scanner;

public class ejercicio95 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el tamaño del vector
        System.out.println("Ingrese el tamaño del vector:");
        int n = scanner.nextInt();

        // Crear el vector
        int[] vector = new int[n];

        // Solicitar al usuario que ingrese los elementos del vector
        System.out.println("Ingrese los elementos del vector:");
        for (int i = 0; i < n; i++) {
            vector[i] = scanner.nextInt();
        }

        // Ordenar el vector de mayor a menor
        ordenarVector(vector);

        // Mostrar el vector ordenado
        System.out.println("El vector ordenado de mayor a menor es:");
        for (int num : vector) {
            System.out.print(num + " ");
        }

        scanner.close();
    }

    // Función para ordenar un vector de enteros de mayor a menor usando bubble sort
    public static void ordenarVector(int[] vector) {
        int n = vector.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vector[j] < vector[j + 1]) {
                    // Intercambiar vector[j] y vector[j + 1]
                    int temp = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = temp;
                }
            }
        }
    }
}
