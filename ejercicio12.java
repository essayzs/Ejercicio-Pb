import java.util.Scanner;
public class ejercicio12 {
    public static void main(String[] args) {
      // Crear un objeto Scanner para leer la entrada del usuario
      Scanner scanner = new Scanner(System.in);

      // Solicitar al usuario que ingrese los tres números
      System.out.println("Ingrese el primer número:");
      double numero1 = scanner.nextDouble();

      System.out.println("Ingrese el segundo número:");
      double numero2 = scanner.nextDouble();

      System.out.println("Ingrese el tercer número:");
      double numero3 = scanner.nextDouble();

      // Calcular el promedio de los tres números
      double promedio = (numero1 + numero2 + numero3) / 3;

      // Calcular la suma de los tres números
      double suma = numero1 + numero2 + numero3;

      // Mostrar el promedio y la suma
      System.out.println("El promedio de los tres números es: " + promedio);
      System.out.println("La suma de los tres números es: " + suma);

      // Mostrar el doble del primer número
      System.out.println("El doble del primer número es: " + (numero1 * 2));

      // Mostrar el triple del segundo número
      System.out.println("El triple del segundo número es: " + (numero2 * 3));

      // Mostrar el cuadrado del tercer número
      System.out.println("El cuadrado del tercer número es: " + (numero3 * numero3));

      // Cerrar el Scanner
      scanner.close();   
    }
}
