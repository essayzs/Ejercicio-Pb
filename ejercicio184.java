import java.util.Scanner;

public class ejercicio184 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario los datos necesarios para generar el RFC
        System.out.print("Ingrese el nombre completo (sin espacios): ");
        String nombreCompleto = scanner.nextLine().toUpperCase();

        System.out.print("Ingrese la fecha de nacimiento o creación (en formato YYYYMMDD): ");
        String fechaNacimiento = scanner.nextLine();

        // Obtener las iniciales del nombre para el RFC
        String iniciales = obtenerIniciales(nombreCompleto);

        // Obtener los primeros 6 caracteres de la fecha de nacimiento para el RFC
        String fechaRFC = fechaNacimiento.substring(2, 8);

        // Generar la homoclave de forma aleatoria (3 caracteres alfanuméricos)
        String homoclave = generarHomoclave();

        // Concatenar los datos para formar el RFC
        String rfc = iniciales + fechaRFC + homoclave;

        // Mostrar el RFC generado
        System.out.println("RFC generado: " + rfc);
        scanner.close();
    }

    // Función para obtener las iniciales del nombre
    public static String obtenerIniciales(String nombre) {
        StringBuilder iniciales = new StringBuilder();
        String[] palabras = nombre.split(" ");
        for (String palabra : palabras) {
            iniciales.append(palabra.charAt(0));
        }
        return iniciales.toString();
    }

    // Función para generar la homoclave aleatoria
    public static String generarHomoclave() {
        StringBuilder homoclave = new StringBuilder();
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        for (int i = 0; i < 3; i++) {
            int indice = (int) (Math.random() * caracteres.length());
            homoclave.append(caracteres.charAt(indice));
        }
        return homoclave.toString();
    }
}
