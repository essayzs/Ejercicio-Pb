import java.util.Scanner;

public class ejercicio125 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese el número múltiplo
        System.out.print("Ingrese el número múltiplo: ");
        int multiplo = scanner.nextInt();

        // Iterar a través de los números del 1 al 3000
        for (int i = 1; i <= 3000; i++) {
            // Verificar si el número es un múltiplo del número ingresado por el usuario
            if (i % multiplo == 0) {
                System.out.println(i); // Imprimir el múltiplo
            }
        }

        scanner.close();
    }
}
