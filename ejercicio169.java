import java.util.Scanner;

public class ejercicio169 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese su año de nacimiento
        System.out.println("Ingrese su año de nacimiento:");
        int añoNacimiento = scanner.nextInt();

        // Calcular la edad actual
        int edad = 2024 - añoNacimiento;

        // Determinar la etapa de vida según la edad
        String etapa = "";
        if (edad >= 1 && edad <= 12) {
            etapa = "niñez (1-12 años)";
        } else if (edad >= 13 && edad <= 18) {
            etapa = "adolescencia (13-18 años)";
        } else if (edad >= 19 && edad <= 30) {
            etapa = "juventud (19-30 años)";
        } else if (edad >= 31 && edad <= 60) {
            etapa = "adultez (31-60 años)";
        } else if (edad > 60 && edad <= 100) {
            etapa = "vejez (más de 60 años)";
        } else {
            etapa = "fuera del rango de edad especificado";
        }

        // Mostrar la etapa de vida
        System.out.println("Usted se encuentra en la etapa de " + etapa + ".");

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
