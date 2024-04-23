import java.util.Scanner;

public class ejercicio134 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese los tres números enteros
        System.out.print("Ingrese el primer número entero: ");
        int numero1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número entero: ");
        int numero2 = scanner.nextInt();
        System.out.print("Ingrese el tercer número entero: ");
        int numero3 = scanner.nextInt();

        // Validar que los números ingresados no sean iguales
        while (numero1 == numero2 || numero1 == numero3 || numero2 == numero3) {
            System.out.println("Por favor ingrese tres números distintos.");
            System.out.print("Ingrese el primer número entero: ");
            numero1 = scanner.nextInt();
            System.out.print("Ingrese el segundo número entero: ");
            numero2 = scanner.nextInt();
            System.out.print("Ingrese el tercer número entero: ");
            numero3 = scanner.nextInt();
        }

        // Determinar cuál es el mayor y cuál es el menor
        int mayor = Math.max(numero1, Math.max(numero2, numero3));
        int menor = Math.min(numero1, Math.min(numero2, numero3));

        // Mostrar el resultado
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);

        scanner.close();
    }
}
