import java.util.Scanner;

public class ejercicio159 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un número
        System.out.print("Ingresa un número entero positivo mayor que 1: ");
        int numero = scanner.nextInt();

        // Verificar si el número es primo
        boolean esPrimo = esPrimo(numero);

        // Mostrar el resultado
        if (esPrimo) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }

    // Función para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        // Si el número es menor o igual a 1, no es primo
        if (numero <= 1) {
            return false;
        }
        // Verificar si el número es divisible por algún número menor que él
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
