import java.util.Scanner;

public class ejercicio228 {
    public static void main(String[] args) {
        // Definir el código de usuario y la contraseña
        final String codigoCorrecto = "1";
        final String contraseñaCorrecta = "1234";
        
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Variables para almacenar el código de usuario y la contraseña ingresados por el usuario
        String codigoUsuario;
        String contraseña;
        
        // Ciclo para solicitar al usuario el código de usuario y la contraseña
        do {
            // Solicitar al usuario el código de usuario
            System.out.print("Ingrese el código de usuario: ");
            codigoUsuario = scanner.nextLine();
            
            // Solicitar al usuario la contraseña
            System.out.print("Ingrese la contraseña: ");
            contraseña = scanner.nextLine();
            
            // Verificar si el código de usuario y la contraseña son correctos
            if (codigoUsuario.equals(codigoCorrecto) && contraseña.equals(contraseñaCorrecta)) {
                System.out.println("¡Bienvenido!");
                break; // Salir del ciclo si la autenticación es exitosa
            } else {
                System.out.println("Código de usuario o contraseña incorrectos. Inténtelo nuevamente.");
            }
        } while (true); // El ciclo se ejecutará indefinidamente hasta que la autenticación sea exitosa
        
        // Cerrar el scanner para evitar fugas de recursos
        scanner.close();
    }
}
