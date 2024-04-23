import java.util.Scanner;

public class ejercicio122 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int suma = 0;
        int numero;

        // Pedir al usuario que ingrese números hasta que ingrese un cero
        while (true) {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = scanner.nextInt();

            if (numero == 0) {
                break;
            }

            suma += numero;
        }

        // Mostrar la suma total de los números ingresados
        System.out.println("La suma total de los números es: " + suma);

        scanner.close();
    }
}
