import java.util.Scanner;

public class ejercicio226 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la altura de la escalera: ");
        int altura = Integer.parseInt(scanner.nextLine());

        if (altura <= 0) {
            System.out.println("La altura de la escalera debe ser un número positivo.");
        } else {
            dibujarEscaleraInvertida(altura);
        }

        scanner.close();
    }

    public static void dibujarEscaleraInvertida(int altura) {
        for (int i = altura; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
