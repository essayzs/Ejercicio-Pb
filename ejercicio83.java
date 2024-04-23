import java.util.Scanner;

public class ejercicio83 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese tres números
        System.out.println("Ingrese el primer número:");
        double num1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número:");
        double num2 = scanner.nextDouble();

        System.out.println("Ingrese el tercer número:");
        double num3 = scanner.nextDouble();

        // Calcular el promedio de los tres números
        double promedio = (num1 + num2 + num3) / 3;

        // Verificar si el promedio es mayor a 7 y mostrar el resultado
        if (promedio > 7) {
            System.out.println("APROBADO");
        } else {
            System.out.println("MEJORE LA NOTA");
        }

        scanner.close();
    }
}
