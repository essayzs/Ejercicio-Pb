import java.util.Scanner;
public class ejercicio32 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el largo del rectángulo en metros:");
        double largo = scanner.nextDouble();

        System.out.println("Ingrese el ancho del rectángulo en metros:");
        double ancho = scanner.nextDouble();

        double area = largo * ancho;
        double areaCentimetros = area * 10000; // 1 metro = 100 centímetros, por lo tanto 1 metro cuadrado = 10000 centímetros cuadrados
        double areaMilimetros = area * 1000000; // 1 metro = 1000 milímetros, por lo tanto 1 metro cuadrado = 1000000 milímetros cuadrados

        System.out.println("El área del rectángulo es:");
        System.out.println("En metros cuadrados: " + area);
        System.out.println("En centímetros cuadrados: " + areaCentimetros);
        System.out.println("En milímetros cuadrados: " + areaMilimetros);
        scanner.close();
    }
}