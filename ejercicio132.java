import java.util.Scanner;

public class ejercicio132 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 1000; // Saldo inicial de $1000
        
        // Ciclo para mostrar el menú hasta que el usuario elija salir
        while (true) {
            System.out.println("Cajero Automático");
            System.out.println("1. Depósito");
            System.out.println("2. Retiro");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la cantidad a depositar: ");
                    double cantidadDeposito = scanner.nextDouble();
                    saldo += cantidadDeposito; // Añadir la cantidad depositada al saldo
                    System.out.println("Depósito exitoso.");
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double cantidadRetiro = scanner.nextDouble();
                    if (cantidadRetiro > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= cantidadRetiro; // Restar la cantidad retirada al saldo
                        System.out.println("Retiro exitoso.");
                    }
                    break;
                case 3:
                    System.out.println("Gracias por utilizar nuestro cajero automático.");
                    System.out.println("Saldo final: $" + saldo);
                    return; // Salir del programa
                default:
                    System.out.println("Opción inválida. Por favor seleccione nuevamente.");
                    scanner.close();
            }
        }
    }
}
