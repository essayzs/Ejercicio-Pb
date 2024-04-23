import java.util.Scanner;

public class ejercicio49 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese una cadena de texto
        System.out.println("Ingrese una cadena de texto:");
        String texto = scanner.nextLine();

        // Obtener la primera letra utilizando la función primeraLetra
        char primera = primeraLetra(texto);

        // Mostrar la primera letra
        System.out.println("La primera letra de la cadena es: " + primera);
        scanner.close();
    }

    // Función para obtener la primera letra de una cadena de texto
    public static char primeraLetra(String texto) {
        // Verificar si la cadena no está vacía
        if (texto.length() > 0) {
            // Devolver el primer carácter de la cadena
            return texto.charAt(0);
        } else {
            // Si la cadena está vacía, devolver un carácter nulo
            return '\0';
            
        }
    }
}
