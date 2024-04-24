import java.util.Scanner;

public class ejercicio183 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el nombre completo
        System.out.print("Ingrese el nombre completo de la persona: ");
        String nombreCompleto = scanner.nextLine();

        // Convertir el nombre completo a minúsculas para simplificar el conteo
        nombreCompleto = nombreCompleto.toLowerCase();

        // Inicializar contadores para cada vocal
        int contadorA = 0, contadorE = 0, contadorI = 0, contadorO = 0, contadorU = 0;

        // Contar el número de vocales en el nombre completo
        int totalVocales = 0;
        for (int i = 0; i < nombreCompleto.length(); i++) {
            char caracter = nombreCompleto.charAt(i);
            if (esVocal(caracter)) {
                totalVocales++;
                // Incrementar el contador correspondiente a la vocal encontrada
                switch (caracter) {
                    case 'a':
                        contadorA++;
                        break;
                    case 'e':
                        contadorE++;
                        break;
                    case 'i':
                        contadorI++;
                        break;
                    case 'o':
                        contadorO++;
                        break;
                    case 'u':
                        contadorU++;
                        break;
                }
                scanner.close();
            }
        }

        // Mostrar el total de vocales y cuántas veces se repite cada vocal
        System.out.println("Total de vocales en el nombre: " + totalVocales);
        System.out.println("Cantidad de veces que se repite cada vocal:");
        System.out.println("A: " + contadorA);
        System.out.println("E: " + contadorE);
        System.out.println("I: " + contadorI);
        System.out.println("O: " + contadorO);
        System.out.println("U: " + contadorU);
    }

    // Función para verificar si un carácter es una vocal
    public static boolean esVocal(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
