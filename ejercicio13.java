import java.util.Scanner;
public class ejercicio13 {
    public static void main(String[] args) {
     // Crear un objeto Scanner para leer la entrada del usuario
     Scanner scanner = new Scanner(System.in);

     // Solicitar al usuario que ingrese los tres números
     System.out.println("Ingrese el primer número:");
     int numero1 = scanner.nextInt();

     System.out.println("Ingrese el segundo número:");
     int numero2 = scanner.nextInt();

     System.out.println("Ingrese el tercer número:");
     int numero3 = scanner.nextInt();

     // Obtener el último dígito de cada número
     int ultimoDigito1 = numero1 % 10;
     int ultimoDigito2 = numero2 % 10;
     int ultimoDigito3 = numero3 % 10;

     // Mostrar los últimos dígitos de cada número
     System.out.println("El último dígito del primer número es: " + ultimoDigito1);
     System.out.println("El último dígito del segundo número es: " + ultimoDigito2);
     System.out.println("El último dígito del tercer número es: " + ultimoDigito3);

     // Cerrar el Scanner
     scanner.close();   
    }
}
