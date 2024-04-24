import java.util.Scanner;

public class ejercicio180 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPersonas = 0;
        int totalHombres = 0;
        int totalMujeres = 0;
        int sumaEdadesHombres = 0;
        int sumaEdadesMujeres = 0;
        int edadMasJoven = Integer.MAX_VALUE;

        // Solicitar al usuario la cantidad de personas en la fiesta
        System.out.print("Ingrese la cantidad de personas en la fiesta: ");
        int cantidadPersonas = scanner.nextInt();

        // Iterar sobre cada persona
        for (int i = 0; i < cantidadPersonas; i++) {
            System.out.println("\nPersona #" + (i + 1) + ":");
            System.out.print("Edad: ");
            int edad = scanner.nextInt();
            System.out.print("Sexo (M/F): ");
            char sexo = scanner.next().charAt(0);

            // Validar que la edad sea mayor de edad
            if (edad < 18) {
                System.out.println("Lo siento, no se permiten menores de edad a la fiesta.");
                continue;
            }

            // Actualizar conteo total de personas
            totalPersonas++;

            // Actualizar conteo de hombres y mujeres
            if (sexo == 'M') {
                totalHombres++;
                sumaEdadesHombres += edad;
            } else if (sexo == 'F') {
                totalMujeres++;
                sumaEdadesMujeres += edad;
            }

            // Actualizar la edad más joven
            if (edad < edadMasJoven) {
                edadMasJoven = edad;
            }
        }

        // Calcular el promedio de edades por sexo
        double promedioEdadesHombres = totalHombres > 0 ? (double) sumaEdadesHombres / totalHombres : 0;
        double promedioEdadesMujeres = totalMujeres > 0 ? (double) sumaEdadesMujeres / totalMujeres : 0;

        // Mostrar los resultados
        System.out.println("\nResumen de la fiesta:");
        System.out.println("Total de personas: " + totalPersonas);
        System.out.println("Total de hombres: " + totalHombres);
        System.out.println("Total de mujeres: " + totalMujeres);
        System.out.println("Promedio de edad de hombres: " + promedioEdadesHombres);
        System.out.println("Promedio de edad de mujeres: " + promedioEdadesMujeres);
        System.out.println("Edad de la persona más joven: " + (edadMasJoven != Integer.MAX_VALUE ? edadMasJoven : "No asistieron personas"));
        scanner.close();
    }
}
