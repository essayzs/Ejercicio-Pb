import java.util.Scanner;

public class ejercicio135 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario la cantidad de números
        System.out.print("Ingrese la cantidad de números a comparar: ");
        int cantidadNumeros = scanner.nextInt();

        // Validar que la cantidad de números sea positiva
        if (cantidadNumeros <= 0) {
            System.out.println("La cantidad de números debe ser un número positivo.");
            return;
        }

        // Pedir al usuario que ingrese los números
        System.out.println("Ingrese los números:");
        int numero;
        int mayor = Integer.MIN_VALUE; // Inicializar el mayor con el menor valor posible
        int menor = Integer.MAX_VALUE; // Inicializar el menor con el mayor valor posible
        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numero = scanner.nextInt();

            // Actualizar el mayor y el menor
            if (numero > mayor) {
                mayor = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        // Mostrar el resultado
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);

        scanner.close();
    }
}
