import java.util.Scanner;

public class ejercicio33 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de empleados:");
        int n = scanner.nextInt();

        int contadorMas700 = 0;
        double sumaSalarios = 0;
        int contadorMujeres = 0;
        int contadorVarones = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el sexo del empleado (M para mujer, V para varón):");
            char sexo = scanner.next().charAt(0);

            System.out.println("Ingrese el salario del empleado:");
            double salario = scanner.nextDouble();

            sumaSalarios += salario;

            if (salario > 700) {
                contadorMas700++;
            }

            if (sexo == 'M' || sexo == 'm') {
                contadorMujeres++;
            } else if (sexo == 'V' || sexo == 'v') {
                contadorVarones++;
            }
        }

        double promedioSalarios = sumaSalarios / n;
        double porcentajeMujeres = (double) contadorMujeres / n * 100;
        double porcentajeVarones = (double) contadorVarones / n * 100;

        System.out.println("Cantidad de personas que ganan más de 700 al mes: " + contadorMas700);
        System.out.println("Promedio de salarios: " + promedioSalarios);
        System.out.println("Porcentaje de mujeres que trabajan en esa empresa: " + porcentajeMujeres + "%");
        System.out.println("Porcentaje de varones que trabajan en esa empresa: " + porcentajeVarones + "%");
        scanner. close();
    }
}
