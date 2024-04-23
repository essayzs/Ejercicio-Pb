import java.util.Scanner;
public class ejercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la cantidad de pulgadas
        System.out.println("Ingrese la cantidad de pulgadas a convertir:");
        double pulgadas = scanner.nextDouble();

        // Realizar la conversión a centímetros
        double centimetros = pulgadas * 2.54;

        // Mostrar el resultado de la conversión
        System.out.println(pulgadas + " pulgadas equivalen a " + centimetros + " centímetros.");
        scanner.close();
    }   
}
