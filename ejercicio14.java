import java.util.Scanner;
public class ejercicio14 {
    public static void main(String[] args) {
     // Crear un objeto Scanner para leer la entrada del usuario
     Scanner scanner = new Scanner(System.in);

     // Solicitar al usuario que ingrese el número de cuatro dígitos
     System.out.println("Ingrese un número de cuatro dígitos:");
     int numero = scanner.nextInt();

     // Obtener cada dígito individualmente
     int digito1 = numero / 1000;
     int digito2 = (numero / 100) % 10;
     int digito3 = (numero / 10) % 10;
     int digito4 = numero % 10;

     // Calcular la suma de los dígitos
     int suma = digito1 + digito2 + digito3 + digito4;

     // Mostrar la suma de los dígitos
     System.out.println("La suma de los dígitos es: " + suma);

     // Cerrar el Scanner
     scanner.close();   
    }
}
