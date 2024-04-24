import java.util.Scanner;

public class ejercicio182 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario un número
        System.out.print("Ingrese un número entero (menor o igual a 1000): ");
        int numero = scanner.nextInt();

        // Validar si el número está en el rango permitido
        if (numero < 1 || numero > 1000) {
            System.out.println("El número debe estar en el rango de 1 a 1000.");
            return;
        }

        // Convertir el número a número romano
        String numeroRomano = convertirANumeroRomano(numero);

        // Mostrar el resultado
        System.out.println("El número " + numero + " en números romanos es: " + numeroRomano);
        scanner.close();
    }

    // Función para convertir un número a números romanos
    public static String convertirANumeroRomano(int numero) {
        // Arreglos para las letras romanas y sus valores
        String[] simbolos = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int[] valores = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};

        // Crear una cadena para almacenar el número romano
        StringBuilder resultado = new StringBuilder();

        // Iterar a través de los valores romanos
        int indice = 12; // Comenzar desde el valor más alto
        while (numero > 0) {
            // Dividir el número entre el valor actual
            int cociente = numero / valores[indice];
            numero %= valores[indice];

            // Agregar las letras romanas correspondientes al resultado
            for (int i = 0; i < cociente; i++) {
                resultado.append(simbolos[indice]);
            }

            // Pasar al siguiente valor romano
            indice--;
        }

        // Devolver el número romano
        return resultado.toString();
    }
}
