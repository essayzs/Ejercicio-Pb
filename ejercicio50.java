import java.util.Scanner;

public class ejercicio50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese tres números
        System.out.println("Ingrese el primer número:");
        double numero1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número:");
        double numero2 = scanner.nextDouble();

        System.out.println("Ingrese el tercer número:");
        double numero3 = scanner.nextDouble();

        // Mostrar la suma de los tres números
        double suma = numero1 + numero2 + numero3;
        System.out.println("La suma de los tres números es: " + suma);

        // Mostrar la multiplicación de los tres números
        double multiplicacion = numero1 * numero2 * numero3;
        System.out.println("La multiplicación de los tres números es: " + multiplicacion);
        scanner.close();
    }
}
