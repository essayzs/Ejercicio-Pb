import java.util.Scanner;

public class ejercicio141 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.print("Ingrese un número para calcular su raíz cuadrada: ");
        double numero = scanner.nextDouble();

        // Calcular la raíz cuadrada utilizando el método de la división sucesiva
        double raizCuadrada = calcularRaizCuadrada(numero);

        // Mostrar el resultado
        System.out.println("La raíz cuadrada de " + numero + " es aproximadamente: " + raizCuadrada);

        scanner.close();
    }

    // Método para calcular la raíz cuadrada utilizando división sucesiva
    public static double calcularRaizCuadrada(double numero) {
        // Definir los límites de búsqueda para la raíz cuadrada
        double limiteInferior = 0;
        double limiteSuperior = numero;
        double precision = 0.000001; // Precisión deseada

        // Realizar la búsqueda de la raíz cuadrada utilizando división sucesiva
        while (limiteSuperior - limiteInferior > precision) {
            double mitad = (limiteSuperior + limiteInferior) / 2;
            double cuadradoMitad = mitad * mitad;
            if (cuadradoMitad > numero) {
                limiteSuperior = mitad;
            } else {
                limiteInferior = mitad;
            }
        }

        // Truncar el resultado para obtener una aproximación
        return trunc(limiteInferior);
    }

    // Función para truncar un número a su parte entera
    public static double trunc(double numero) {
        return numero < 0 ? Math.ceil(numero) : Math.floor(numero);
    }
}
