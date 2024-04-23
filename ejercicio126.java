import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ejercicio126 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese la fecha en formato AAAA MM DD
        System.out.print("Ingrese la fecha en formato AAAA MM DD: ");
        String fechaStr = scanner.nextLine();

        try {
            // Convertir la cadena de fecha a un objeto Date
            SimpleDateFormat sdfInput = new SimpleDateFormat("yyyy MM dd");
            Date fecha = sdfInput.parse(fechaStr);

            // Formatear la fecha en formato de texto
            SimpleDateFormat sdfOutput = new SimpleDateFormat("dd MMMM 'de' yyyy");
            String fechaTexto = sdfOutput.format(fecha);

            // Mostrar la fecha en formato de texto
            System.out.println("La fecha en formato de texto es: " + fechaTexto);
        } catch (Exception e) {
            System.out.println("Error: Formato de fecha incorrecto. Asegúrese de ingresar la fecha en el formato AAAA MM DD.");
        }

        scanner.close();
    }
}
