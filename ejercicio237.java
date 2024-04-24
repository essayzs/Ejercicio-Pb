import java.util.Scanner;

public class ejercicio237 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        // Validar que los números son correctos
        if (num1 <= num2) {
            System.out.println("Números impares desde " + num1 + " hasta " + num2 + ":");
            for (int i = num1; i <= num2; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println(); // Imprimir nueva línea al final
        } else {
            System.out.println("El primer número debe ser menor o igual al segundo número.");
        }

        scanner.close();
    }
}
