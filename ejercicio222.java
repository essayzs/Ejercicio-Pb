import java.util.Scanner;

public class ejercicio222 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        int suma = 0;
        int contador = 0;
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;

        System.out.println("Ingresa números enteros (termina con 0):");

        do {
            numero = scanner.nextInt();

            if (numero != 0) {
                suma += numero;
                contador++;
                maximo = Math.max(maximo, numero);
                minimo = Math.min(minimo, numero);
            }

        } while (numero != 0);

        if (contador > 0) {
            double media = (double) suma / contador;
            System.out.println("Máximo: " + maximo);
            System.out.println("Mínimo: " + minimo);
            System.out.println("Media: " + media);
        } else {
            System.out.println("No se ingresaron números.");
        }

        scanner.close();
    }
}
