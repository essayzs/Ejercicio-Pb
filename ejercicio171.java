import java.util.Scanner;

public class ejercicio171 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Mostrar el menú de opciones
        System.out.println("Menú de conversión de unidades:");
        System.out.println("1 - Libras a kilogramos");
        System.out.println("2 - Millas a kilómetros");
        System.out.println("3 - Galones a litros");
        System.out.println("4 - Fahrenheit a Celsius");
        System.out.println("5 - Salir");

        // Pedir al usuario que elija una opción del menú
        System.out.println("Ingrese el número de la opción que desea:");
        int opcion = scanner.nextInt();

        // Realizar la conversión según la opción elegida
        switch (opcion) {
            case 1:
                System.out.println("Ingrese el valor en libras:");
                double libras = scanner.nextDouble();
                double kilogramos = libras * 0.453592;
                System.out.println(libras + " libras equivalen a " + kilogramos + " kilogramos.");
                break;
            case 2:
                System.out.println("Ingrese el valor en millas:");
                double millas = scanner.nextDouble();
                double kilometros = millas * 1.60934;
                System.out.println(millas + " millas equivalen a " + kilometros + " kilómetros.");
                break;
            case 3:
                System.out.println("Ingrese el valor en galones:");
                double galones = scanner.nextDouble();
                double litros = galones * 3.78541;
                System.out.println(galones + " galones equivalen a " + litros + " litros.");
                break;
            case 4:
                System.out.println("Ingrese el valor en grados Fahrenheit:");
                double fahrenheit = scanner.nextDouble();
                double celsius = (fahrenheit - 32) * 5 / 9;
                System.out.println(fahrenheit + " grados Fahrenheit equivalen a " + celsius + " grados Celsius.");
                break;
            case 5:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opción no válida.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
