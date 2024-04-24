import java.util.Scanner;

public class ejercicio206 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese su salario anterior
        System.out.print("Ingresa tu salario anterior: ");
        double salarioAnterior = scanner.nextDouble();

        // Calcular el incremento (25% del salario anterior)
        double incremento = 0.25 * salarioAnterior;

        // Calcular el nuevo salario sumando el incremento al salario anterior
        double nuevoSalario = salarioAnterior + incremento;

        // Mostrar el nuevo salario
        System.out.println("Tu nuevo salario es: " + nuevoSalario);

        // Cerrar el Scanner
        scanner.close();
    }
}
