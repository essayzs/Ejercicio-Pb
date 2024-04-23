import java.util.Scanner;

public class ejercicio51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la base y la altura del rectángulo
        System.out.println("Ingrese la base del rectángulo:");
        double base = scanner.nextDouble();

        System.out.println("Ingrese la altura del rectángulo:");
        double altura = scanner.nextDouble();

        // Calcular el área del rectángulo
        double area = base * altura;
        // Calcular el perímetro del rectángulo
        double perimetro = 2 * (base + altura);

        // Mostrar el área y el perímetro del rectángulo
        System.out.println("El área del rectángulo es: " + area);
        System.out.println("El perímetro del rectángulo es: " + perimetro);
        scanner.close();
    }
}
