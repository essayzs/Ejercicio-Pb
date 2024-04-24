import java.util.Scanner;

public class ejercicio166 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese su peso en kg
        System.out.print("Ingrese su peso en kg: ");
        double peso = scanner.nextDouble();

        // Pedir al usuario que ingrese su altura en metros
        System.out.print("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();

        // Calcular el IMC
        double imc = peso / (altura * altura);

        // Mostrar el IMC
        System.out.println("\nSu IMC es: " + imc);

        // Determinar la clasificación del IMC
        if (imc < 18.5) {
            System.out.println("Usted está bajo peso.");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Usted tiene un peso normal.");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Usted tiene sobrepeso.");
        } else {
            System.out.println("Usted tiene obesidad.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
