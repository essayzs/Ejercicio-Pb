import java.util.Scanner;

public class ejercicio232 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números que desea procesar: ");
        int cantidadNumeros = scanner.nextInt();

        int positivos = 0;
        int negativos = 0;
        int neutros = 0;

        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                neutros++;
            }
        }

        System.out.println("Total de números positivos: " + positivos);
        System.out.println("Total de números negativos: " + negativos);
        System.out.println("Total de números neutros: " + neutros);

        scanner.close();
    }
}
