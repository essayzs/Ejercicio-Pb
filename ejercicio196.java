import java.util.Scanner;

public class ejercicio196 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Crear el arreglo de 18x10 para almacenar los ingresos de los vendedores por producto
        double[][] ingresos = new double[18][10];

        // Capturar los ingresos de cada vendedor por producto
        for (int vendedor = 0; vendedor < 18; vendedor++) {
            System.out.println("Ingresos del vendedor " + (vendedor + 1) + ":");
            for (int producto = 0; producto < 10; producto++) {
                System.out.print("Producto " + (producto + 1) + ": $");
                ingresos[vendedor][producto] = scanner.nextDouble();
            }
        }

        // Mostrar el total de ingresos de cada vendedor
        System.out.println("\nTotal de ingresos por vendedor:");
        for (int vendedor = 0; vendedor < 18; vendedor++) {
            double totalVendedor = 0;
            for (int producto = 0; producto < 10; producto++) {
                totalVendedor += ingresos[vendedor][producto];
            }
            System.out.println("Vendedor " + (vendedor + 1) + ": $" + totalVendedor);
        }

        // Mostrar el promedio por producto
        System.out.println("\nPromedio de ingresos por producto:");
        for (int producto = 0; producto < 10; producto++) {
            double totalProducto = 0;
            for (int vendedor = 0; vendedor < 18; vendedor++) {
                totalProducto += ingresos[vendedor][producto];
            }
            double promedioProducto = totalProducto / 18;
            System.out.println("Producto " + (producto + 1) + ": $" + promedioProducto);
        }

        // Mostrar el promedio por vendedor
        System.out.println("\nPromedio de ingresos por vendedor:");
        for (int vendedor = 0; vendedor < 18; vendedor++) {
            double totalVendedor = 0;
            for (int producto = 0; producto < 10; producto++) {
                totalVendedor += ingresos[vendedor][producto];
            }
            double promedioVendedor = totalVendedor / 10;
            System.out.println("Vendedor " + (vendedor + 1) + ": $" + promedioVendedor);
        }

        // Calcular los ingresos totales
        double ingresosTotales = 0;
        for (int vendedor = 0; vendedor < 18; vendedor++) {
            for (int producto = 0; producto < 10; producto++) {
                ingresosTotales += ingresos[vendedor][producto];
            }
        }
        System.out.println("\nIngresos totales: $" + ingresosTotales);

        scanner.close(); // Cerrar el scanner
    }
}
