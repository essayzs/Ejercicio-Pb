import java.util.Scanner;

public class ejercicio200 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el capital invertido: ");
        double capital = scanner.nextDouble();

        double tasaInteresMensual = 0.015; // 1.5% en formato decimal
        int tiempoMeses = 2;

        double interes = capital * tasaInteresMensual * tiempoMeses;
        double total = capital + interes;

        System.out.println("El interés ganado después de 2 meses es: " + interes);
        System.out.println("El total después de 2 meses es: " + total);
        
        scanner.close();
    }
}
