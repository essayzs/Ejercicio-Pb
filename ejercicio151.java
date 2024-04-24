import java.util.Scanner;

public class ejercicio151 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese una cadena de caracteres
        System.out.print("Ingresa una cadena de caracteres: ");
        String cadena = scanner.nextLine();

        // Verificar la longitud de la cadena
        if (cadena.length() > 10) {
            // Mostrar la cadena en pantalla si tiene más de 10 caracteres
            System.out.println("La cadena ingresada es: " + cadena);
        } else {
            // No mostrar la cadena si tiene 10 caracteres o menos
            System.out.println("La longitud de la cadena es menor o igual a 10, no se mostrará.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
