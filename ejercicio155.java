import java.util.Scanner;

public class ejercicio155 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese una palabra
        System.out.print("Por favor, ingresa una palabra: ");
        String palabra = scanner.nextLine();

        // Convertir la palabra a minúsculas para evitar problemas de sensibilidad a mayúsculas
        palabra = palabra.toLowerCase();

        // Verificar si la palabra es palíndroma
        if (esPalindroma(palabra)) {
            System.out.println("La palabra \"" + palabra + "\" es palíndroma.");
        } else {
            System.out.println("La palabra \"" + palabra + "\" no es palíndroma.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }

    // Función para verificar si una palabra es palíndroma
    public static boolean esPalindroma(String palabra) {
        int longitud = palabra.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(longitud - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
