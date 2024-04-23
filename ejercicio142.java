import java.util.Scanner;

public class ejercicio142 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el número base (N)
        System.out.print("Ingrese el número base (N): ");
        double base = scanner.nextDouble();

        // Solicitar al usuario que ingrese el exponente (X)
        System.out.print("Ingrese el exponente (X): ");
        int exponente = scanner.nextInt();

        // Calcular la potencia
        double resultado = calcularPotencia(base, exponente);

        // Mostrar el resultado
        System.out.println(base + " elevado a la potencia " + exponente + " es igual a: " + resultado);

        scanner.close();
    }

    // Función para calcular la potencia de un número
    public static double calcularPotencia(double base, int exponente) {
        double resultado = 1;

        // Manejo de casos especiales cuando el exponente es negativo
        if (exponente < 0) {
            base = 1 / base;
            exponente = -exponente;
        }

        // Calcular la potencia utilizando multiplicación repetida
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }

        return resultado;
    }
}
