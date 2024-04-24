import java.util.Scanner;

public class ejercicio225 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del lado del cuadrado: ");
        int lado = Integer.parseInt(scanner.nextLine());

        if (lado <= 0) {
            System.out.println("El tamaño del lado debe ser un número positivo.");
        } else {
            dibujarCuadrado(lado);
        }

        scanner.close();
    }

    public static void dibujarCuadrado(int lado) {
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                if (i == 0 || i == lado - 1 || j == 0 || j == lado - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
