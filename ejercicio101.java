import java.util.Scanner;

public class ejercicio101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese los dos números
        System.out.println("Ingrese el primer número:");
        int numero1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número:");
        int numero2 = scanner.nextInt();

        // Determinar si el primer número es divisible por el segundo
        if (numero1 % numero2 == 0) {
            System.out.println(numero1 + " es divisible por " + numero2);
        } else {
            System.out.println(numero1 + " no es divisible por " + numero2);
        }

        scanner.close();
    }
}
