import java.util.Scanner;

public class ejercicio150 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número entero
        System.out.print("Ingresa un número entero positivo: ");
        int numero = scanner.nextInt();

        // Validar si el número ingresado es positivo
        if (numero <= 0) {
            System.out.println("El número ingresado no es válido. Debe ser un número entero positivo.");
            return;
        }

        // Calcular la descomposición en factores primos
        System.out.print("La descomposición en factores primos de " + numero + " es: ");
        descomponerEnFactoresPrimos(numero);

        // Cerrar el objeto Scanner
        scanner.close();
    }

    // Método para descomponer un número en factores primos
    public static void descomponerEnFactoresPrimos(int numero) {
        // Iterar desde el primer número primo (2) hasta la mitad del número
        for (int i = 2; i <= numero / 2; i++) {
            // Mientras el número sea divisible por el número primo actual (i), imprimir el factor primo y actualizar el número
            while (numero % i == 0) {
                System.out.print(i);
                numero /= i;
                // Si el número todavía es divisible por el mismo factor, imprimir el signo de multiplicación
                if (numero != 1) {
                    System.out.print(" * ");
                }
            }
        }
        // Si el número es mayor que 1 al final del ciclo, imprimir el último factor primo
        if (numero > 1) {
            System.out.print(numero);
        }
        System.out.println();
    }
}
