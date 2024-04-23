import java.util.Scanner;

public class ejercicio91 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el nombre
        System.out.println("Ingrese el nombre:");
        String nombre = scanner.nextLine();

        // Solicitar al usuario que ingrese el apellido
        System.out.println("Ingrese el apellido:");
        String apellido = scanner.nextLine();

        // Solicitar al usuario que ingrese la edad
        System.out.println("Ingrese la edad:");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner

        // Solicitar al usuario que ingrese el número de celular
        System.out.println("Ingrese el número de celular:");
        String celular = scanner.nextLine();

        // Mostrar los datos ingresados
        System.out.println("Datos ingresados:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Número de celular: " + celular);

        scanner.close();
    }
}
