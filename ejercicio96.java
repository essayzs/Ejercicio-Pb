import java.util.Scanner;

public class ejercicio96 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese una frase
        System.out.println("Ingrese una frase:");
        String frase = scanner.nextLine();

        // Dividir la frase en palabras
        String[] palabras = frase.split(" ");

        // Mostrar cada palabra seguida del número de letras que la componen
        System.out.println("Palabras y número de letras:");
        for (String palabra : palabras) {
            System.out.println(palabra + " - " + palabra.length() + " letras");
        }

        scanner.close();
    }
}
