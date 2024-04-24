import java.util.Scanner;

public class ejercicio194 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un arreglo para almacenar los 10 números
        int[] numeros = new int[10];

        // Solicitar al usuario que ingrese los 10 números
        System.out.println("Ingrese 10 números:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Aplicar el algoritmo de ordenamiento de burbuja
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    // Intercambiar los elementos si están en el orden incorrecto
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        // Mostrar los números ordenados
        System.out.println("Números ordenados de forma ascendente:");
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        // Cerrar el Scanner al final
        scanner.close();
    }
}
