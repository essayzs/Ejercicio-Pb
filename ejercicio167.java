import java.util.Scanner;

public class ejercicio167 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Variables para almacenar el total y la cantidad de números ingresados
        double total = 0;
        int cantidadNumeros = 0;

        // Pedir al usuario que ingrese los números y calcular el promedio
        System.out.println("Ingrese una lista de números positivos (ingrese 0 para terminar):");
        double numero = scanner.nextDouble();
        while (numero != 0) {
            if (numero > 0) {
                total += numero;
                cantidadNumeros++;
            } else {
                System.out.println("Por favor, ingrese solo números positivos.");
            }
            numero = scanner.nextDouble();
        }

        // Calcular el promedio
        double promedio = 0;
        if (cantidadNumeros > 0) {
            promedio = total / cantidadNumeros;
        }

        // Mostrar el resultado
        System.out.println("El promedio de los números ingresados es: " + promedio);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
