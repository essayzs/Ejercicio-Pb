import java.util.Scanner;

public class ejercicio81 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el radio del círculo
        System.out.println("Ingrese el radio del círculo:");
        double radio = scanner.nextDouble();

        // Calcular el área del círculo
        double area = calcularAreaCirculo(radio);

        // Mostrar el área del círculo
        System.out.println("El área del círculo es: " + area);

        // Verificar si el área es mayor a 5000 y mostrar "DATOS ERRÓNEOS" en ese caso
        if (area > 5000) {
            System.out.println("DATOS ERRÓNEOS");
        }

        scanner.close();
    }

    public static double calcularAreaCirculo(double radio) {
        // El área del círculo se calcula como pi * radio^2
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }
}
