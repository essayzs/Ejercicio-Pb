import java.util.Scanner;
public class ejercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese las 5 notas
        System.out.println("Ingrese las 5 notas:");

        double[] notas = new double[5];
        double suma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            suma += notas[i];
        }

        // Calcular el promedio de las notas
        double promedio = suma / 5;

        // Calcular el doble de las notas
        double[] dobleNotas = new double[5];

        for (int i = 0; i < 5; i++) {
            dobleNotas[i] = notas[i] * 2;
        }

        // Imprimir los resultados
        System.out.println("Suma de las notas: " + suma);
        System.out.println("Promedio de las notas: " + promedio);

        System.out.println("El doble de las notas es:");

        for (int i = 0; i < 5; i++) {
            System.out.println("Nota " + (i + 1) + ": " + dobleNotas[i]);
            scanner.close();
        }
    } 
}
