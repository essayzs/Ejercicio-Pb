import java.util.Scanner;

public class ejercicio118 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double totalPagar = 0.0;
        double monto;

        // Solicitar los montos de los 10 artículos
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el monto del artículo " + i + ": $");
            monto = scanner.nextDouble();
            totalPagar += monto;
        }

        System.out.println("El monto total a pagar es: $" + totalPagar);

        scanner.close();
    }
}
