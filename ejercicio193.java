import java.util.Scanner;

public class ejercicio193 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario ingresar un número entre 1 y 255
        System.out.print("Ingrese un número entre 1 y 255: ");
        int numero = scanner.nextInt();

        // Verificar si el número está en el rango permitido
        if (numero < 1 || numero > 255) {
            System.out.println("El número ingresado no está en el rango permitido.");
            return;
        }

        // Convertir el número a binario
        int[] binario = new int[8];
        int indice = 7;
        while (numero > 0) {
            binario[indice--] = numero % 2;
            numero /= 2;
        }

        // Mostrar el número en binario
        System.out.print("El número en binario es: ");
        for (int i = 0; i < 8; i++) {
            System.out.print(binario[i]);
        }
        System.out.println();
        scanner.close();
    }
}
