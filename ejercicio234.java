import java.util.Scanner;

public class ejercicio234 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        if (esCapicua(numero)) {
            System.out.println("El número " + numero + " es capicúa.");
        } else {
            System.out.println("El número " + numero + " no es capicúa.");
        }

        scanner.close();
    }

    public static boolean esCapicua(int num) {
        int original = num;
        int reverso = 0;

        // Invertir el número
        while (num != 0) {
            int digito = num % 10;
            reverso = reverso * 10 + digito;
            num = num / 10;
        }

        // Comprobar si el número es igual a su reverso
        return original == reverso;
    }
}
