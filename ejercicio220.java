import java.util.Scanner;

public class ejercicio220 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int suma = 0;
        int cantidadNumeros = 0;
        int numero;

        // Leer números hasta que se ingrese -1
        do {
            System.out.print("Ingrese un número (ingrese -1 para terminar): ");
            numero = scanner.nextInt();

            // Verificar si el número es válido
            if (numero >= 0) {
                suma += numero;
                cantidadNumeros++;
            } else if (numero != -1) {
                System.out.println("¡Error! Ingrese un número positivo o -1 para terminar.");
            }
        } while (numero != -1);

        // Calcular la media aritmética si se han ingresado números válidos
        if (cantidadNumeros > 0) {
            double media = (double) suma / cantidadNumeros;
            System.out.println("La media aritmética de los números ingresados es: " + media);
        } else {
            System.out.println("No se ingresaron números válidos.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}
