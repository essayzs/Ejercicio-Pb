import java.util.Scanner;

public class ejercicio127 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese la fecha (día, mes, año)
        System.out.print("Ingrese el día: ");
        int dia = scanner.nextInt();
        System.out.print("Ingrese el mes (1-12): ");
        int mes = scanner.nextInt();
        System.out.print("Ingrese el año: ");
        int año = scanner.nextInt();

        // Determinar la estación del año
        String estacion = determinarEstacion(dia, mes);

        // Mostrar la estación del año
        System.out.println("La fecha " + dia + "/" + mes + "/" + año + " corresponde a la estación: " + estacion);

        scanner.close();
    }

    public static String determinarEstacion(int dia, int mes) {
        String estacion;

        // Determinar la estación del año según el mes y el día
        if ((mes == 3 && dia >= 20) || (mes == 4) || (mes == 5) || (mes == 6 && dia < 21)) {
            estacion = "Primavera";
        } else if ((mes == 6 && dia >= 21) || (mes == 7) || (mes == 8) || (mes == 9 && dia < 23)) {
            estacion = "Verano";
        } else if ((mes == 9 && dia >= 23) || (mes == 10) || (mes == 11) || (mes == 12 && dia < 21)) {
            estacion = "Otoño";
        } else {
            estacion = "Invierno";
        }

        return estacion;
    }
}
