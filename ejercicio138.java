import java.util.Scanner;

public class ejercicio138 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Mostrar el menú de opciones
            System.out.println("Menú de opciones:");
            System.out.println("1. Calcular área de un cuadrado");
            System.out.println("2. Calcular área de un círculo");
            System.out.println("3. Calcular área de un triángulo");
            System.out.println("0. Salir");
            System.out.print("Ingrese su opción: ");
            
            // Leer la opción del usuario
            int opcion = scanner.nextInt();

            // Realizar la acción correspondiente según la opción elegida
            switch (opcion) {
                case 0:
                    System.out.println("¡Hasta luego!");
                    scanner.close();
                    return;
                case 1:
                    System.out.print("Ingrese la longitud del lado del cuadrado: ");
                    double lado = scanner.nextDouble();
                    double areaCuadrado = calcularAreaCuadrado(lado);
                    System.out.println("El área del cuadrado es: " + areaCuadrado);
                    break;
                case 2:
                    System.out.print("Ingrese el radio del círculo: ");
                    double radio = scanner.nextDouble();
                    double areaCirculo = calcularAreaCirculo(radio);
                    System.out.println("El área del círculo es: " + areaCirculo);
                    break;
                case 3:
                    System.out.print("Ingrese la base del triángulo: ");
                    double base = scanner.nextDouble();
                    System.out.print("Ingrese la altura del triángulo: ");
                    double altura = scanner.nextDouble();
                    double areaTriangulo = calcularAreaTriangulo(base, altura);
                    System.out.println("El área del triángulo es: " + areaTriangulo);
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }
        }
    }

    // Método para calcular el área de un cuadrado
    public static double calcularAreaCuadrado(double lado) {
        return lado * lado;
    }

    // Método para calcular el área de un círculo
    public static double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    // Método para calcular el área de un triángulo
    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }
}
