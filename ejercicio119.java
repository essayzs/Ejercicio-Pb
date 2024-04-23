import java.util.Scanner;

public class ejercicio119 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final String CONTRASEÑA_CORRECTA = "passwd";
        int intentos = 0;
        String contraseñaIngresada;

        // Solicitar la contraseña al usuario hasta que sea correcta o se excedan los intentos
        while (intentos < 3) {
            System.out.print("Ingrese la contraseña: ");
            contraseñaIngresada = scanner.nextLine();

            if (contraseñaIngresada.equals(CONTRASEÑA_CORRECTA)) {
                System.out.println("Contraseña aceptada.");
                break;
            } else {
                System.out.println("Contraseña incorrecta.");
                intentos++;
            }
        }

        // Si se exceden los intentos, mostrar un mensaje correspondiente
        if (intentos == 3) {
            System.out.println("Intentos excedidos.");
        }

        scanner.close();
    }
}
