import java.util.Scanner;

public class ejercicio156 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la primera cadena
        System.out.print("Ingresa la primera cadena de caracteres en minúsculas: ");
        String cadena1 = scanner.nextLine();

        // Solicitar al usuario que ingrese la segunda cadena
        System.out.print("Ingresa la segunda cadena de caracteres en minúsculas: ");
        String cadena2 = scanner.nextLine();

        // Convertir las cadenas a mayúsculas
        String cadena1Mayusculas = cadena1.toUpperCase();
        String cadena2Mayusculas = cadena2.toUpperCase();

        // Comparar las cadenas
        if (cadena1Mayusculas.equals(cadena2Mayusculas)) {
            System.out.println("Las cadenas son iguales.");
        } else {
            System.out.println("Las cadenas no son iguales.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
