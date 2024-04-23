import java.util.Scanner;

public class ejercicio112 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mostrar el menú de opciones
        System.out.println("Línea de autobuses ADO, seleccione su destino:");
        System.out.println("a) Cartagena. [$150]");
        System.out.println("b) Barranquilla. [$320]");
        System.out.println("c) Sincelejo. [$120]");
        System.out.println("d) Valledupar. [$90]");
        System.out.println("e) Santa Marta.[$110]");

        // Solicitar al usuario que seleccione una opción
        System.out.println("Seleccione su destino (a-e):");
        char opcion = scanner.next().charAt(0);

        // Mostrar el mensaje según la opción seleccionada
        switch (opcion) {
            case 'a':
                System.out.println("Su destino es \"Cartagena\", tiempo de traslado 2 hrs, costo $200.");
                break;
            case 'b':
                System.out.println("Su destino es \"Barranquilla\", tiempo de traslado X hrs, costo $320.");
                break;
            case 'c':
                System.out.println("Su destino es \"Sincelejo\", tiempo de traslado X hrs, costo $120.");
                break;
            case 'd':
                System.out.println("Su destino es \"Valledupar\", tiempo de traslado X hrs, costo $90.");
                break;
            case 'e':
                System.out.println("Su destino es \"Santa Marta\", tiempo de traslado X hrs, costo $110.");
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        }

        scanner.close();
    }
}
