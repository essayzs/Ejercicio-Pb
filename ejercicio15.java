import java.util.Scanner;
public class ejercicio15 {
    public static void main(String[] args) {
     // Crear un objeto Scanner para leer la entrada del usuario
     Scanner scanner = new Scanner(System.in);

     // Solicitar al usuario que ingrese su edad
     System.out.println("Ingrese su edad:");
     int edad = scanner.nextInt();

     // Comprobar si la persona es mayor o menor de edad
     if (edad >= 18) {
         System.out.println("Eres mayor de edad.");
     } else {
         System.out.println("Eres menor de edad.");
     }

     // Cerrar el Scanner
     scanner.close();   
    }
}
