import java.util.Scanner;
public class ejercicio10 {
   public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Ingrese la longitud de la base del triángulo:");
     double base = scanner.nextDouble();
     System.out.println("Ingrese la altura del triángulo:");
     double altura = scanner.nextDouble();
     double area = (base * altura) / 2;
     System.out.println("El área del triángulo es: " + area);
     scanner.close();
   } 
}
