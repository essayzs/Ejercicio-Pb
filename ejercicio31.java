import java.util.Scanner;

public class ejercicio31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la base y la altura del triángulo en milímetros
        System.out.println("Ingrese la base del triángulo en milímetros:");
        float baseMilimetros = scanner.nextFloat();

        System.out.println("Ingrese la altura del triángulo en milímetros:");
        float alturaMilimetros = scanner.nextFloat();

        // Calcular el área del triángulo en milímetros cuadrados
        float areaMilimetrosCuadrados = (baseMilimetros * alturaMilimetros) / 2;

        // Convertir el área a centímetros cuadrados (1 milímetro cuadrado = 0.01 centímetros cuadrados)
        float areaCentimetrosCuadrados = areaMilimetrosCuadrados * 0.01f;

        // Convertir el área a metros cuadrados (1 milímetro cuadrado = 0.000001 metros cuadrados)
        float areaMetrosCuadrados = areaMilimetrosCuadrados * 0.000001f;

        // Mostrar los resultados
        System.out.println("El área del triángulo es:");
        System.out.println("En milímetros cuadrados: " + areaMilimetrosCuadrados + " mm^2");
        System.out.println("En centímetros cuadrados: " + areaCentimetrosCuadrados + " cm^2");
        System.out.println("En metros cuadrados: " + areaMetrosCuadrados + " m^2");

        scanner.close(); // Cerrar el scanner al finalizar
    }
}
