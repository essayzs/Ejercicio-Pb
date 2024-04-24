import java.util.Scanner;

public class ejercicio162 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el número para mostrar su tabla de multiplicar
        System.out.print("Ingresa un número positivo menor a 10: ");
        int numero = scanner.nextInt();

        // Verificar si el número ingresado es válido
        if (numero < 1 || numero >= 10) {
            System.out.println("El número ingresado no es válido.");
        } else {
            // Mostrar la tabla de multiplicar del número ingresado
            System.out.println("Tabla de multiplicar del " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
