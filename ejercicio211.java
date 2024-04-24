import java.util.Scanner;

public class ejercicio211 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Definir los precios de cada alimento
        double precioBocadilloJamón = 15.0;
        double precioBocadilloQueso = 10.0;
        double precioPatatasFritas = 5.0;
        double precioRefresco = 3.0;
        double precioCerveza = 4.0;

        // Solicitar al usuario que ingrese el número de unidades consumidas de cada alimento
        System.out.println("Ingrese el número de unidades consumidas de cada alimento:");
        System.out.print("Bocadillo de jamón: ");
        int unidadesBocadilloJamón = scanner.nextInt();
        System.out.print("Bocadillo de queso: ");
        int unidadesBocadilloQueso = scanner.nextInt();
        System.out.print("Patatas fritas: ");
        int unidadesPatatasFritas = scanner.nextInt();
        System.out.print("Refresco: ");
        int unidadesRefresco = scanner.nextInt();
        System.out.print("Cerveza: ");
        int unidadesCerveza = scanner.nextInt();

        // Calcular el total de la cuenta
        double totalCuenta = (precioBocadilloJamón * unidadesBocadilloJamón) +
                             (precioBocadilloQueso * unidadesBocadilloQueso) +
                             (precioPatatasFritas * unidadesPatatasFritas) +
                             (precioRefresco * unidadesRefresco) +
                             (precioCerveza * unidadesCerveza);

        // Mostrar el total de la cuenta
        System.out.println("Total de la cuenta: " + totalCuenta + " Bs.");

        // Cerrar el Scanner
        scanner.close();
    }
}
