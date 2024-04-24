import java.util.Scanner;

public class ejercicio227 {
    public static void main(String[] args) {
        // Precios de los productos
        double precioBocadilloJamón = 1.5;
        double precioRefresco = 1.05;
        double precioCerveza = 0.75;
        
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario el número de unidades consumidas de cada producto
        System.out.print("Ingrese el número de bocadillos de jamón consumidos: ");
        int bocadillosJamón = scanner.nextInt();
        
        System.out.print("Ingrese el número de refrescos consumidos: ");
        int refrescos = scanner.nextInt();
        
        System.out.print("Ingrese el número de cervezas consumidas: ");
        int cervezas = scanner.nextInt();
        
        // Calcular la cuenta total
        double total = (precioBocadilloJamón * bocadillosJamón) + 
                       (precioRefresco * refrescos) + 
                       (precioCerveza * cervezas);
        
        // Mostrar el total de la cuenta
        System.out.println("El total de la cuenta es: " + total + " Bs.");
        
        // Cerrar el scanner para evitar fugas de recursos
        scanner.close();
    }
}
