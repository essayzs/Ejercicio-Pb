import java.util.Scanner;

public class ejercicio41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la edad de la persona:");
        int edad = scanner.nextInt();

        // Calculamos la cantidad de meses desde el nacimiento hasta la edad actual
        int meses = edad * 12;

        // Calculamos la longitud del cabello en metros (crecimiento de medio centímetro por mes)
        double longitudCabelloMetros = meses * 0.5 / 100;

        System.out.println("La longitud de la cabellera de la persona es de " + longitudCabelloMetros + " metros.");
        scanner.close();
    }
}
