import java.util.Arrays;
import java.util.Scanner;

public class ejercicio168 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese las 5 letras vocales
        System.out.println("Ingrese las 5 letras vocales en desorden:");
        String entrada = scanner.nextLine().toLowerCase(); // Convertir a minúsculas para simplificar la comparación

        // Convertir la entrada a un arreglo de caracteres
        char[] vocales = entrada.toCharArray();

        // Ordenar el arreglo de caracteres
        Arrays.sort(vocales);

        // Mostrar las vocales ordenadas
        System.out.println("Las vocales ordenadas son:");
        for (char vocal : vocales) {
            System.out.print(vocal + " ");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
