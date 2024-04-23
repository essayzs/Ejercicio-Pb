import java.util.Scanner;

public class ejercicio98 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese dos valores
        System.out.println("Ingrese el primer valor:");
        double valor1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo valor:");
        double valor2 = scanner.nextDouble();

        // Calcular la suma y la resta de los dos valores
        double suma = valor1 + valor2;
        double resta = valor1 - valor2;

        // Verificar si la división de la suma entre la resta es exacta
        if (suma % resta == 0) {
            System.out.println("La división de la suma entre la resta es exacta");
        } else {
            System.out.println("La división de la suma entre la resta no es exacta");
        }

        scanner.close();
    }
}
