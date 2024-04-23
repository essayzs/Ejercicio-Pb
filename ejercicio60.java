import java.util.Scanner;

public class ejercicio60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;

        // Leer números hasta que se introduzca un cero
        while (true) {
            System.out.println("Ingrese un número (0 para terminar):");
            int numero = scanner.nextInt();

            if (numero == 0) {
                break; // Salir del bucle si se ingresa un cero
            }

            if (numero > 0) {
                contador++; // Incrementar el contador si el número es mayor que cero
            }
        }

        // Mostrar el número de valores mayores que cero leídos
        System.out.println("El número de valores mayores que cero leídos es: " + contador);

        scanner.close(); // Cerrar el scanner al finalizar
    }
}
