import java.util.Scanner;

public class ejercicio117 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int cantidadNumeros = 0;
        int numero;

        // Leer números hasta que se ingrese 0
        while (true) {
            System.out.println("Ingrese un número (0 para terminar):");
            numero = scanner.nextInt();

            if (numero == 0) {
                break;
            }

            cantidadNumeros++;
        }

        System.out.println("Cantidad de números leídos: " + cantidadNumeros);

        scanner.close();
    }
}
