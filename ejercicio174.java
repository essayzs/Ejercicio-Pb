import java.util.Scanner;

public class ejercicio174 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese su nombre completo y el área/departamento
        System.out.print("Ingrese su nombre completo: ");
        String nombreCompleto = scanner.nextLine();

        System.out.print("Ingrese el área/departamento: ");
        String area = scanner.nextLine();

        // Generar el nombre de usuario
        String nombreUsuario = generarNombreUsuario(nombreCompleto, area);

        // Mostrar el nombre de usuario generado
        System.out.println("Nombre de usuario generado: " + nombreUsuario);

        // Cerrar el objeto Scanner
        scanner.close();
    }

    // Método para generar el nombre de usuario
    public static String generarNombreUsuario(String nombreCompleto, String area) {
        // Dividir el nombre completo en partes (primer nombre, primer apellido y segundo apellido)
        String[] partesNombre = nombreCompleto.split(" ");

        // Obtener las iniciales del primer nombre, primer apellido y segundo apellido
        String inicialNombre = partesNombre[0].substring(0, 1).toLowerCase();
        String inicialApellido1 = partesNombre[1].substring(0, 1).toLowerCase();
        String inicialApellido2 = partesNombre[2].substring(0, 1).toLowerCase();

        // Eliminar tildes y espacios en blanco del área/departamento y convertirlo a minúsculas
        area = area.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Concatenar las iniciales del nombre y apellidos con el área/departamento
        String nombreUsuario = area + inicialNombre + inicialApellido1 + inicialApellido2;

        return nombreUsuario;
    }
}
