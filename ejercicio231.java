import java.util.Scanner;

public class ejercicio231 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidadNumeros = 10;
        int suma = 0;

        System.out.println("Ingrese " + cantidadNumeros + " números:");

        for (int i = 0; i < cantidadNumeros; i++) {
            int numero = scanner.nextInt();
            if (numero > 0) {
                System.out.println("Número " + (i + 1) + ": " + numero);
                suma += numero;
            }
        }

        System.out.println("La suma de los números positivos es: " + suma);
        scanner.close();
    }
}
