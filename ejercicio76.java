import java.util.Scanner;

public class ejercicio76 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero:");
        int numero = scanner.nextInt();

        int cifras = contarCifras(numero);

        System.out.println("El número de cifras de " + numero + " es: " + cifras);

        scanner.close();
    }

    public static int contarCifras(int numero) {
        // Convertimos el número entero a su representación en cadena para obtener la longitud de la cadena
        return String.valueOf(numero).length();
    }
}
