import java.util.Scanner;

public class ejercicio59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un entero del 1 al 10
        System.out.println("Ingrese un entero del 1 al 10:");
        int numero = scanner.nextInt();

        // Validar si el número ingresado está en el rango correcto
        if (numero < 1 || numero > 10) {
            System.out.println("El número debe estar en el rango del 1 al 10.");
            return; // Salir del programa si el número no está en el rango correcto
        }

        // Mostrar la tabla de multiplicar del número ingresado
        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        scanner.close(); // Cerrar el scanner al finalizar
    }
}
