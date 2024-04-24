import java.util.Scanner;

public class ejercicio172 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el periodo en formato MM AAAA
        System.out.println("Ingrese el periodo en formato MM AAAA (por ejemplo, 10-2021):");
        String periodo = scanner.nextLine();

        // Separar el mes y el año del periodo ingresado por el usuario
        String[] partes = periodo.split("-");
        int mes = Integer.parseInt(partes[0]);
        int anio = Integer.parseInt(partes[1]);

        // Mostrar los 12 meses anteriores al periodo ingresado por el usuario
        System.out.println("Los 12 meses anteriores a " + periodo + " son:");
        for (int i = 0; i < 12; i++) {
            // Calcular el mes y el año para el mes actual
            mes--;
            if (mes == 0) {
                mes = 12;
                anio--;
            }
            // Mostrar el mes actual en formato MM-AAAA
            System.out.printf("%02d-%d\n", mes, anio);
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
