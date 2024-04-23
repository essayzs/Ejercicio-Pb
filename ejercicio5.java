import java.util.Scanner;
public class ejercicio5 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la longitud de la diagonal mayor del rombo
        System.out.println("Ingrese la longitud de la diagonal mayor del rombo:");
        double diagonalMayor = scanner.nextDouble();

        // Solicitar al usuario que ingrese la longitud de la diagonal menor del rombo
        System.out.println("Ingrese la longitud de la diagonal menor del rombo:");
        double diagonalMenor = scanner.nextDouble();

        // Calcular el área del rombo utilizando la fórmula: area = (diagonalMayor * diagonalMenor) / 2
        double area = (diagonalMayor * diagonalMenor) / 2;

        // Mostrar el resultado del área del rombo
        System.out.println("El área del rombo es: " + area);

        // Cerrar el Scanner
        scanner.close();
}
}
