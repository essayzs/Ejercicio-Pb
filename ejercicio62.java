import java.util.Scanner;

public class ejercicio62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicializar variables para la temperatura máxima, mínima y suma de temperaturas
        double temperaturaMaxima = Double.MIN_VALUE;
        double temperaturaMinima = Double.MAX_VALUE;
        double sumaTemperaturas = 0;

        // Leer 6 temperaturas cada 4 horas durante un periodo de 24 horas
        for (int i = 1; i <= 6; i++) {
            System.out.println("Ingrese la temperatura para las " + (i * 4) + " horas:");
            double temperatura = scanner.nextDouble();

            // Actualizar la temperatura máxima y mínima si es necesario
            if (temperatura > temperaturaMaxima) {
                temperaturaMaxima = temperatura;
            }
            if (temperatura < temperaturaMinima) {
                temperaturaMinima = temperatura;
            }

            // Sumar la temperatura a la suma total
            sumaTemperaturas += temperatura;
        }

        // Calcular la temperatura media del día
        double temperaturaMedia = sumaTemperaturas / 6;

        // Mostrar los resultados
        System.out.println("La temperatura media del día es: " + temperaturaMedia);
        System.out.println("La temperatura más alta del día es: " + temperaturaMaxima);
        System.out.println("La temperatura más baja del día es: " + temperaturaMinima);

        scanner.close(); // Cerrar el scanner al finalizar
    }
}
