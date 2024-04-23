import java.util.Scanner;

public class ejercicio121 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int suma = 0;

        // Pedir al usuario que ingrese 5 números y calcular la suma
        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int numero = scanner.nextInt();
            suma += numero;
        }

        // Mostrar la suma total de los números ingresados
        System.out.println("La suma total de los 5 números es: " + suma);

        scanner.close();
    }
}
