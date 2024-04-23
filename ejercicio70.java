import java.util.Scanner;

public class ejercicio70 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor de n:");
        int n = scanner.nextInt();

        int resultado = calcularResultado(n);
        System.out.println("El resultado de la expresión es: " + resultado);

        scanner.close();
    }

    public static int calcularResultado(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                // Si el número es par, restamos el término
                suma -= i;
            } else {
                // Si el número es impar, sumamos el término
                suma += i;
            }
        }
        return suma;
    }
}
