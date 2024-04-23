import java.util.Scanner;

public class ejercicio149 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Generar un número aleatorio en el rango [1, 100]
        int numeroAleatorio = generarNumeroAleatorio(1, 100);

        // Solicitar al usuario que piense un número
        System.out.println("Piensa un número entero entre 1 y 100.");

        // Variable para almacenar el número ingresado por el usuario
        int numeroIngresado;

        // Contador de intentos
        int intentos = 0;

        // Bucle para adivinar el número
        do {
            // Solicitar al usuario que ingrese un número
            System.out.print("Adivina el número: ");
            numeroIngresado = scanner.nextInt();
            intentos++;

            // Verificar si el número ingresado es menor, mayor o igual al número aleatorio
            if (numeroIngresado < numeroAleatorio) {
                System.out.println("El número que ingresaste es menor que el número secreto.");
            } else if (numeroIngresado > numeroAleatorio) {
                System.out.println("El número que ingresaste es mayor que el número secreto.");
            } else {
                System.out.println("¡Felicidades! ¡Adivinaste el número en " + intentos + " intentos!");
            }
        } while (numeroIngresado != numeroAleatorio);

        // Cerrar el objeto Scanner
        scanner.close();
    }

    // Método para generar un número aleatorio en un rango específico [min, max]
    public static int generarNumeroAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}
