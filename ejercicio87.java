import java.util.Scanner;

public class ejercicio87 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la longitud del lado del triángulo equilátero
        System.out.println("Ingrese la longitud del lado del triángulo equilátero:");
        double lado = scanner.nextDouble();

        // Calcular el área del triángulo equilátero
        double area = calcularAreaTrianguloEquilatero(lado);

        // Mostrar el área del triángulo
        System.out.println("El área del triángulo equilátero es: " + area);

        // Verificar si el área es mayor a 1000 y mostrar "DATOS NO VÁLIDOS" en ese caso
        if (area > 1000) {
            System.out.println("DATOS NO VÁLIDOS");
        }

        scanner.close();
    }

    public static double calcularAreaTrianguloEquilatero(double lado) {
        // El área del triángulo equilátero se calcula como (lado^2 * √3) / 4
        double area = (Math.pow(lado, 2) * Math.sqrt(3)) / 4;
        return area;
    }
}
