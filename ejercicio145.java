import java.util.Scanner;

public class ejercicio145 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Leer los tres lados del triángulo
        System.out.println("Ingrese la longitud de los tres lados del triángulo:");
        double lado1 = scanner.nextDouble();
        double lado2 = scanner.nextDouble();
        double lado3 = scanner.nextDouble();

        // Verificar si los lados forman un triángulo
        if (esTriangulo(lado1, lado2, lado3)) {
            // Determinar el tipo de triángulo
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("El triángulo es equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("El triángulo es isósceles.");
            } else {
                System.out.println("El triángulo es escaleno.");
            }
        } else {
            System.out.println("Los lados proporcionados no forman un triángulo.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }

    // Método para verificar si los lados forman un triángulo
    public static boolean esTriangulo(double lado1, double lado2, double lado3) {
        return lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1;
    }
}
