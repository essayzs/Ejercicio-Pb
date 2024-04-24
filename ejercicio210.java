import java.util.Scanner;

public class ejercicio210 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el monto del presupuesto anual del hospital
        System.out.print("Ingresa el monto del presupuesto anual del hospital: ");
        double presupuestoAnual = scanner.nextDouble();

        // Calcular la cantidad de dinero que recibirá cada área
        double ginecologia = presupuestoAnual * 0.40;
        double traumatologia = presupuestoAnual * 0.30;
        double pediatria = presupuestoAnual * 0.30;

        // Mostrar los resultados
        System.out.println("Cantidad de dinero para Ginecología: $" + ginecologia);
        System.out.println("Cantidad de dinero para Traumatología: $" + traumatologia);
        System.out.println("Cantidad de dinero para Pediatría: $" + pediatria);

        // Cerrar el Scanner
        scanner.close();
    }
}
