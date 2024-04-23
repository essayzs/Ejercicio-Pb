import java.util.Scanner;

public class ejercicio64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor de x (base):");
        int x = scanner.nextInt();

        System.out.println("Ingrese el valor de y (exponente):");
        int y = scanner.nextInt();

        int resultado = calcularPotencia(x, y);
        System.out.println(x + "^" + y + " = " + resultado);

        scanner.close();
    }

    public static int calcularPotencia(int base, int exponente) {
        int resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }
}