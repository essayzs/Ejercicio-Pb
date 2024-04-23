import java.util.Scanner;

public class ejercicio52 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número entero
        System.out.println("Ingrese un número entero para ver su tabla de multiplicar:");
        int numero = scanner.nextInt();

        // Llamar a la función tablaMultiplicar para escribir la tabla de multiplicar del número ingresado
        tablaMultiplicar(numero);
        scanner.close();
    }

    // Función para escribir la tabla de multiplicar de un número
    public static void tablaMultiplicar(int numero) {
        // Iterar desde 0 hasta 10 para mostrar la tabla de multiplicar
        for (int i = 0; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
