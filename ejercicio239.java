import java.util.Scanner;

public class ejercicio239 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int suma = 0;
        int numero;

        // Pedir números al usuario hasta que se ingrese 999
        do {
            System.out.print("Ingrese un número (999 para terminar): ");
            numero = scanner.nextInt();
            
            // Verificar si el número ingresado es distinto de 999 antes de sumarlo
            if (numero != 999) {
                suma += numero;
            }
        } while (numero != 999);

        // Mostrar la suma de los números ingresados
        System.out.println("La suma de los números ingresados es: " + suma);

        scanner.close();
    }
}
