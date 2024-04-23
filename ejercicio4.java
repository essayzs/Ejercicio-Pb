import java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          // Solicitar al usuario que ingrese el radio del círculo
          System.out.println("Ingrese el radio del círculo:");
          double radio = scanner.nextDouble();
  
          // Calcular el área del círculo utilizando la fórmula: area = π * radio^2
          double area = Math.PI * Math.pow(radio, 2);
  
          // Mostrar el resultado del área
          System.out.println("El área del círculo es: " + area);
  
          // Cerrar el Scanner
          scanner.close();
    }
}
