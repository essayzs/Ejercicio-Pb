import java.util.Scanner;
public class ejercicio28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.println("Ingrese un número para la cuenta atrás:");

        // Leer el número ingresado por el usuario
        int numero = scanner.nextInt();

        // Realizar la cuenta atrás desde el número ingresado hasta 0
        System.out.println("Cuenta atrás:");
        for (int i = numero; i >= 0; i--) {
            System.out.println(i);
        }

        scanner.close(); // Cerrar el scanner al finalizar
    }
}
