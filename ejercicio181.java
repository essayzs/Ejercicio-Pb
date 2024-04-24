import java.util.Scanner;

public class ejercicio181 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario un número
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        // Calcular la suma de los divisores del número
        int sumaDivisores = 0;
        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
            }
        }

        // Verificar si el número es perfecto
        if (sumaDivisores == numero) {
            System.out.println(numero + " es un número perfecto.");
        } else {
            System.out.println(numero + " no es un número perfecto.");
            scanner.close();
        }
    }
}
