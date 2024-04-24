import java.util.Scanner;

public class ejercicio240 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese los dos números a multiplicar
        System.out.print("Ingrese el primer número: ");
        int multiplicando = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int multiplicador = scanner.nextInt();

        // Variables para almacenar el resultado y el contador de iteraciones
        int resultado = 0;
        int contador = 0;

        // Realizar la multiplicación mediante sumas sucesivas
        while (contador < multiplicador) {
            resultado += multiplicando;
            contador++;
        }

        // Mostrar el resultado de la multiplicación
        System.out.println("El resultado de la multiplicación es: " + resultado);

        scanner.close();
    }
}
