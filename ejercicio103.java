import java.util.Scanner;

public class ejercicio103 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese tres números distintos
        System.out.println("Ingrese el primer número:");
        double num1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo número:");
        double num2 = scanner.nextDouble();
        System.out.println("Ingrese el tercer número:");
        double num3 = scanner.nextDouble();

        // Determinar el número menor
        double menor = num1;
        if (num2 < menor) {
            menor = num2;
        }
        if (num3 < menor) {
            menor = num3;
        }

        // Mostrar el número menor
        System.out.println("El número menor ingresado es: " + menor);

        scanner.close();
    }
}
