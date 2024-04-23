import java.util.Scanner;
public class ejercicio11 {
   public static void main(String[] args) {
     // Crear un objeto Scanner para leer la entrada del usuario
     Scanner scanner = new Scanner(System.in);

     // Solicitar al usuario que ingrese la base del rectángulo
     System.out.println("Ingrese la longitud de la base del rectángulo:");
     double base = scanner.nextDouble();

     // Solicitar al usuario que ingrese la altura del rectángulo
     System.out.println("Ingrese la altura del rectángulo:");
     double altura = scanner.nextDouble();

     // Calcular el área del rectángulo multiplicando la base por la altura
     double area = base * altura;

     // Mostrar el resultado del área del rectángulo
     System.out.println("El área del rectángulo es: " + area);

     // Cerrar el Scanner
     scanner.close();
   }
}
