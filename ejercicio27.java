import java.util.Scanner;
public class ejercicio27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese su género y su nombre
        System.out.println("Ingrese su género (M para masculino, F para femenino):");
        String genero = scanner.nextLine().toUpperCase();

        System.out.println("Ingrese su nombre:");
        String nombre = scanner.nextLine();

        // Determinar el saludo adecuado según el género
        if (genero.equals("M")) {
            System.out.println("Bienvenido " + nombre);
        } else if (genero.equals("F")) {
            System.out.println("Bienvenida " + nombre);
        } else {
            System.out.println("Hola indeciso");
        }

        scanner.close(); // Cerrar el scanner al finalizar
    }
}
