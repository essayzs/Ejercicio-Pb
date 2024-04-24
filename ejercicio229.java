import java.util.Scanner;

public class ejercicio229 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero1, numero2;
        
        do {
            // Solicitar al usuario dos números
            System.out.println("Ingrese el primer número: ");
            numero1 = scanner.nextInt();
            
            System.out.println("Ingrese el segundo número: ");
            numero2 = scanner.nextInt();
            
            // Verificar si ambos números son pares y diferentes de cero
            if (esPar(numero1) && esPar(numero2) && numero1 != 0 && numero2 != 0) {
                // Calcular la suma de los números pares
                int suma = numero1 + numero2;
                System.out.println("La suma de los números pares es: " + suma);
            } else if (numero1 != 0 && numero2 != 0) {
                System.out.println("Ambos números deben ser pares.");
            }
        } while (numero1 != 0 && numero2 != 0);
        
        System.out.println("Fin del programa.");
        scanner.close();
    }
    
    // Función para verificar si un número es par
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}
