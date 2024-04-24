import java.util.Scanner;

public class ejercicio233 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números negativos que desea procesar: ");
        int cantidadNumeros = scanner.nextInt();

        System.out.println("Ingrese los números negativos:");

        for (int i = 0; i < cantidadNumeros; i++) {
            int numero = scanner.nextInt();
            int positivo = Math.abs(numero); // Convierte el número negativo a positivo

            System.out.println("Número positivo equivalente: " + positivo);
        }

        scanner.close();
    }
}
