import java.util.Scanner;

public class ejercicio186 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario una cadena de caracteres
        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.nextLine();

        // Invertir la palabra
        String palabraInvertida = invertirPalabra(palabra);

        // Mostrar la palabra invertida
        System.out.println("Palabra invertida: " + palabraInvertida);
        scanner.close();
    }

    // Función para invertir una palabra
    public static String invertirPalabra(String palabra) {
        StringBuilder palabraInvertida = new StringBuilder();
        for (int i = palabra.length() - 1; i >= 0; i--) {
            palabraInvertida.append(palabra.charAt(i));
        }
        return palabraInvertida.toString();
    }
}
