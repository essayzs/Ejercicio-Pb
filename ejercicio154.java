import java.util.Scanner;

public class ejercicio154 {
    public static void main(String[] args) {
        // Cadena inicial
        String saludo = "Hola que tal";

        // Crear un objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario su nombre
        System.out.print("Por favor, ingresa tu nombre: ");
        String nombreUsuario = scanner.nextLine();

        // Concatenar el nombre del usuario a la cadena inicial
        String mensajeCompleto = saludo + " " + nombreUsuario;

        // Mostrar el mensaje completo
        System.out.println(mensajeCompleto);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
