import java.util.Scanner;

public class ejercicio63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int suma = 0;
        int valor;

        System.out.println("Ingrese valores enteros. Ingrese un valor en el rango (20-30] o 0 para terminar:");

        // Leer valores enteros hasta que se introduzca un valor en el rango (20-30] o se introduzca el valor 0
        while (true) {
            valor = scanner.nextInt();

            if (valor == 0 || (valor > 20 && valor <= 30)) {
                break;
            }

            if (valor > 0) {
                suma += valor;
            }
        }

        System.out.println("La suma de los valores mayores a 0 introducidos es: " + suma);

        scanner.close(); // Cerrar el scanner al finalizar
    }
}
