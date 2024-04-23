import java.util.Scanner;

public class ejercicio74 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        double numero1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número:");
        double numero2 = scanner.nextDouble();

        System.out.println("Ingrese el tercer número:");
        double numero3 = scanner.nextDouble();

        ordenarNumeros(numero1, numero2, numero3);

        scanner.close();
    }

    public static void ordenarNumeros(double num1, double num2, double num3) {
        double mayor, medio, menor;

        // Encontrar el mayor número
        mayor = Math.max(num1, Math.max(num2, num3));

        // Encontrar el menor número
        menor = Math.min(num1, Math.min(num2, num3));

        // El número restante es el medio
        if (num1 != mayor && num1 != menor) {
            medio = num1;
        } else if (num2 != mayor && num2 != menor) {
            medio = num2;
        } else {
            medio = num3;
        }

        System.out.println("Los números ordenados de mayor a menor son: " + mayor + ", " + medio + ", " + menor);
    }
}
