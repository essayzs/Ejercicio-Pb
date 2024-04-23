import java.util.Scanner;

public class ejercicio100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese dos números
        System.out.println("Ingrese el primer número:");
        int numero1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número:");
        int numero2 = scanner.nextInt();

        // Calcular la suma de los dos números
        int suma = numero1 + numero2;

        // Determinar si la suma es par o impar y mostrar el resultado
        if (suma % 2 == 0) {
            System.out.println("La suma de los dos números es par");
        } else {
            System.out.println("La suma de los dos números es impar");
        }

        scanner.close();
    }
}
