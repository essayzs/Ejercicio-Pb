import java.util.Scanner;

public class ejercicio178 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la duración de la llamada en minutos
        System.out.print("Ingresa la duración de la llamada (minutos): ");
        int duracion = scanner.nextInt();

        // Calcular el costo de la llamada
        double costo = calcularCostoLlamada(duracion);

        // Mostrar el costo de la llamada
        System.out.println("El costo de la llamada es: $" + costo);
        scanner.close();
    }

    public static double calcularCostoLlamada(int duracion) {
        double costoBase = 3.00; // Tarifa base por los primeros 3 minutos
        double costoAdicional50 = costoBase * 0.5; // 50% adicional al costo base
        double costoAdicional100 = costoBase * 1.0; // 100% adicional al costo base

        double costo = 0.0;

        if (duracion <= 3) {
            costo = costoBase;
        } else if (duracion <= 7) {
            costo = costoBase + (duracion - 3) * costoAdicional50;
        } else {
            costo = costoBase + 4 * costoAdicional50 + (duracion - 7) * costoAdicional100;
        }

        return costo;
    } 
}
