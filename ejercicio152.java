import java.util.Scanner;

public class ejercicio152 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese una cadena de caracteres
        System.out.print("Ingresa una cadena de caracteres: ");
        String cadena = scanner.nextLine();

        // Convertir la cadena ingresada a un arreglo de caracteres
        char[] arregloOriginal = cadena.toCharArray();

        // Crear un nuevo arreglo para almacenar la copia
        char[] arregloCopia = new char[arregloOriginal.length];

        // Copiar el contenido del arreglo original al arreglo copia
        for (int i = 0; i < arregloOriginal.length; i++) {
            arregloCopia[i] = arregloOriginal[i];
        }

        // Mostrar el contenido del arreglo copia
        System.out.print("Contenido del arreglo copia: ");
        for (char caracter : arregloCopia) {
            System.out.print(caracter);
        }
        System.out.println();

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
