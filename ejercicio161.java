import java.util.Scanner;

public class ejercicio161 {
    public static void main(String[] args) {
        
    
    Scanner scanner = new Scanner(System.in);

    // Pedir al usuario que ingrese los valores de las variables
    System.out.print("Ingresa el valor de la primera variable: ");
    int var1 = scanner.nextInt();

    System.out.print("Ingresa el valor de la segunda variable: ");
    int var2 = scanner.nextInt();

    // Mostrar los valores originales de las variables
    System.out.println("Valores originales:");
    System.out.println("Primera variable: " + var1);
    System.out.println("Segunda variable: " + var2);

    // Intercambiar los valores de las variables
    int temp = var1;
    var1 = var2;
    var2 = temp;

    // Mostrar los valores intercambiados de las variables
    System.out.println("\nValores intercambiados:");
    System.out.println("Primera variable: " + var1);
    System.out.println("Segunda variable: " + var2);

    // Cerrar el objeto Scanner
    scanner.close();
}
}
