import java.util.Scanner;

public class ejercicio111 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el número de día
        System.out.println("Ingrese un número de día (1-7):");
        int numeroDia = scanner.nextInt();

        // Convertir el número de día a texto
        String nombreDia;
        switch (numeroDia) {
            case 1:
                nombreDia = "Domingo";
                break;
            case 2:
                nombreDia = "Lunes";
                break;
            case 3:
                nombreDia = "Martes";
                break;
            case 4:
                nombreDia = "Miércoles";
                break;
            case 5:
                nombreDia = "Jueves";
                break;
            case 6:
                nombreDia = "Viernes";
                break;
            case 7:
                nombreDia = "Sábado";
                break;
            default:
                nombreDia = "Número de día inválido";
                break;
        }

        // Mostrar el nombre del día
        System.out.println("El día correspondiente al número " + numeroDia + " es: " + nombreDia);

        scanner.close();
    }
}
