import java.util.Scanner;
public class ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese los tres números
        System.out.println("Ingrese el primer número:");
        double numero1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número:");
        double numero2 = scanner.nextDouble();

        System.out.println("Ingrese el tercer número:");
        double numero3 = scanner.nextDouble();

        // Calcular la media aritmética de los tres números
        double media = (numero1 + numero2 + numero3) / 3;

        // Mostrar el resultado de la media aritmética
        System.out.println("La media aritmética de los tres números es: " + media);

        // Cerrar el Scanner
        scanner.close();
    }
}
