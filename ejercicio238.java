import java.util.Scanner;

public class ejercicio238 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer un número del usuario
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        // Calcular la suma de los dígitos del número
        int suma = 0;
        int numeroOriginal = numero; // Guardar una copia del número original para mostrarlo al final
        while (numero != 0) {
            suma += numero % 10; // Obtener el último dígito y sumarlo
            numero /= 10; // Eliminar el último dígito del número
        }

        // Mostrar el resultado
        System.out.println("La suma de los dígitos de " + numeroOriginal + " es: " + suma);

        scanner.close();
    }
}
