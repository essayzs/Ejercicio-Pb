import java.util.Scanner;

public class ejercicio153 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese las dos cadenas de caracteres
        System.out.print("Ingresa la primera cadena de caracteres: ");
        String cadena1 = scanner.nextLine();

        System.out.print("Ingresa la segunda cadena de caracteres: ");
        String cadena2 = scanner.nextLine();

        // Comparar las cadenas para determinar si son iguales
        if (cadena1.equals(cadena2)) {
            System.out.println("Las dos cadenas son iguales.");
        } else {
            // Si las cadenas no son iguales, determinar cuál es mayor alfabéticamente
            int comparacion = cadena1.compareTo(cadena2);
            if (comparacion > 0) {
                System.out.println("La primera cadena es mayor alfabéticamente.");
            } else {
                System.out.println("La segunda cadena es mayor alfabéticamente.");
            }
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
