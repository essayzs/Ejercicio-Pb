import java.util.Scanner;
public class ejercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número real
        System.out.println("Ingrese un número real:");
        double numeroReal = scanner.nextDouble();

        // Extraer la parte entera y la parte decimal del número
        int parteEntera = (int) numeroReal;
        double parteDecimal = numeroReal - parteEntera;

        // Mostrar la parte entera y la parte decimal
        System.out.println("Parte entera: " + parteEntera);
        System.out.println("Parte decimal: " + parteDecimal);
        scanner.close();
    }
}
