import java.util.Scanner;

public class ejercicio230 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int dividendo, divisor;
        double resultado;
        
        do {
            // Solicitar al usuario el dividendo y el divisor
            System.out.println("Ingrese el dividendo (mayor que cero): ");
            dividendo = scanner.nextInt();
            
            System.out.println("Ingrese el divisor (mayor que cero y menor que el dividendo): ");
            divisor = scanner.nextInt();
            
            // Verificar si los números ingresados cumplen con las condiciones
            if (dividendo > 0 && divisor > 0 && divisor < dividendo) {
                // Calcular la división
                resultado = (double) dividendo / divisor;
                System.out.println("El resultado de la división es: " + resultado);
            } else {
                System.out.println("Los números ingresados no cumplen con las condiciones. Inténtelo de nuevo.");
            }
        } while (!(dividendo > 0 && divisor > 0 && divisor < dividendo));
        
        scanner.close();
    }
}
