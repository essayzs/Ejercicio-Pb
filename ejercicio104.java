import java.util.Scanner;

public class ejercicio104 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el número y el índice de la raíz
        System.out.println("Ingrese el número:");
        double numero = scanner.nextDouble();
        System.out.println("Ingrese el índice de la raíz:");
        double indice = scanner.nextDouble();

        // Calcular la raíz
        double raiz = Math.pow(numero, 1.0 / indice);

        // Mostrar la raíz
        System.out.println("La raíz " + indice + " de " + numero + " es: " + raiz);

        scanner.close();
    }
}
