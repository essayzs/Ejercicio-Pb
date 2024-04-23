import java.util.Scanner;

public class ejercicio85 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.println("Ingrese un número:");
        int numero = scanner.nextInt();

        // Verificar si el número es par o impar y mostrar el resultado
        if (numero % 2 == 0) {
            System.out.println("El número ingresado es par.");
        } else {
            System.out.println("El número ingresado es impar.");
        }

        scanner.close();
    }
}
