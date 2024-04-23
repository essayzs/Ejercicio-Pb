import java.util.Scanner;
public class ejercicio9 {
    public static void main(String[] args) {
        // Definir el valor del IVA (en porcentaje)
        final double IVA_PORCENTAJE = 0.16;

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la cantidad
        System.out.println("Ingrese la cantidad:");
        double cantidad = scanner.nextDouble();

        // Calcular el IVA
        double iva = cantidad * IVA_PORCENTAJE;

        // Mostrar el resultado del IVA
        System.out.println("El IVA sobre la cantidad ingresada es: " + iva);

        // Cerrar el Scanner
        scanner.close();
    }
}
