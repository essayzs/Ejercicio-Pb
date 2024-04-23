import java.util.Scanner;

public class ejercicio39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la persona:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el año de nacimiento de " + nombre + ":");
        int añoNacimiento = scanner.nextInt();

        System.out.println("Ingrese el año actual:");
        int añoActual = scanner.nextInt();

        // Calculamos la edad de la persona
        int edad = añoActual - añoNacimiento;

        // Calculamos la cantidad de días que ha vivido la persona
        int diasVividos = edad * 365;

        // Calculamos la cantidad de días que ha dormido la persona (34% de los días vividos)
        int diasDormidos = (int) (diasVividos * 0.34);

        System.out.println(nombre + " ha dormido " + diasDormidos + " días en total.");
        scanner.close();
        
    }
}
