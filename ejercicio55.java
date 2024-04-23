public class ejercicio55 {
    public static void main(String[] args) {
        // Ejemplo de uso de la función esPrimo
        int numero = 17;
        int resultado = esPrimo(numero);
        if (resultado == 1) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }
    }

    // Función para verificar si un número es primo
    public static int esPrimo(int numero) {
        if (numero <= 1) {
            return 0; // No se considera primo si es menor o igual a 1
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return 0; // No es primo si es divisible por otro número además de 1 y sí mismo
            }
        }
        return 1; // Es primo si no se encontró ningún divisor además de 1 y sí mismo
    }
}
