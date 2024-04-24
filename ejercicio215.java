import java.util.Scanner;

public class ejercicio215 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese los datos del último reporte y los datos actuales
        System.out.print("Kilometraje de la última vez que se reportó: ");
        double kilometrajeAnterior = scanner.nextDouble();

        System.out.print("Kilometraje actual: ");
        double kilometrajeActual = scanner.nextDouble();

        System.out.print("Litros de gasolina repostados la última vez: ");
        double litrosAnteriores = scanner.nextDouble();

        System.out.print("Cantidad de gasolina actual: ");
        double litrosActuales = scanner.nextDouble();

        // Calcular la cantidad de kilómetros recorridos desde el último reporte
        double distanciaRecorrida = kilometrajeActual - kilometrajeAnterior;

        // Calcular la cantidad de litros utilizados desde el último reporte
        double litrosUtilizados = litrosAnteriores - litrosActuales;

        // Calcular el consumo medio del coche en litros cada 100 kilómetros
        double consumoMedio = (litrosUtilizados / distanciaRecorrida) * 100;

        // Mostrar el consumo medio del coche
        System.out.println("El consumo medio del coche es de " + consumoMedio + " litros cada 100 kilómetros.");

        // Cerrar el Scanner
        scanner.close();
    }
}
