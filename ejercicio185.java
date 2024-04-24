import java.util.Scanner;

public class ejercicio185 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario los datos necesarios para generar la CURP
        System.out.print("Ingrese el primer apellido: ");
        String primerApellido = scanner.nextLine().toUpperCase();

        System.out.print("Ingrese el segundo apellido: ");
        String segundoApellido = scanner.nextLine().toUpperCase();

        System.out.print("Ingrese el nombre(s): ");
        String nombre = scanner.nextLine().toUpperCase();

        System.out.print("Ingrese la fecha de nacimiento (en formato AAAAMMDD): ");
        String fechaNacimiento = scanner.nextLine();

        System.out.print("Ingrese el sexo (F o M): ");
        String sexo = scanner.nextLine().toUpperCase();

        System.out.print("Ingrese las dos letras correspondientes a la entidad de nacimiento (por ejemplo, BC): ");
        String entidadNacimiento = scanner.nextLine().toUpperCase();

        // Obtener las letras y dígitos necesarios para la CURP
        String letraSegundoApellido = obtenerPrimeraConsonanteInterna(primerApellido);
        String letraPrimerApellido = obtenerPrimeraConsonanteInterna(segundoApellido);
        String letraNombre = obtenerPrimeraConsonanteInterna(nombre);
        String digitosFechaNacimiento = fechaNacimiento.substring(2, 8);
        char digitoVerificador = obtenerDigitoVerificador(fechaNacimiento);

        // Generar la CURP
        String curp = segundoApellido.charAt(0) + letraNombre + digitosFechaNacimiento + sexo + entidadNacimiento
                + letraPrimerApellido + letraSegundoApellido + letraNombre + digitoVerificador + generarHomoclave();

        // Mostrar la CURP generada
        System.out.println("CURP generada: " + curp);
        scanner.close();
    }

    // Función para obtener la primera consonante interna de una cadena
    public static String obtenerPrimeraConsonanteInterna(String cadena) {
        StringBuilder consonantes = new StringBuilder();
        for (int i = 1; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (esConsonante(caracter)) {
                consonantes.append(caracter);
                break;
            }
        }
        return consonantes.toString();
    }

    // Función para determinar si un caracter es una consonante
    public static boolean esConsonante(char c) {
        return "BCDFGHJKLMNPQRSTVWXYZ".indexOf(c) != -1;
    }

    // Función para obtener el dígito verificador
    public static char obtenerDigitoVerificador(String fechaNacimiento) {
        int anio = Integer.parseInt(fechaNacimiento.substring(0, 4));
        return (anio < 2000) ? fechaNacimiento.charAt(8) : 'A';
    }

    // Función para generar la homoclave de forma aleatoria
    public static String generarHomoclave() {
        StringBuilder homoclave = new StringBuilder();
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        for (int i = 0; i < 2; i++) {
            int indice = (int) (Math.random() * caracteres.length());
            homoclave.append(caracteres.charAt(indice));
        }
        return homoclave.toString();
    }
}
