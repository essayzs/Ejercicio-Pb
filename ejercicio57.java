public class ejercicio57 {
    public static void main(String[] args) {
        // Ejemplo de uso de la función sumaDigitos
        int numero = 12345;
        int suma = sumaDigitos(numero);
        System.out.println("La suma de los dígitos de " + numero + " es: " + suma);
    }

    // Función para sumar los dígitos de un número
    public static int sumaDigitos(int numero) {
        int suma = 0;
        while (numero != 0) {
            suma += numero % 10; // Obtener el último dígito y sumarlo a la suma total
            numero /= 10; // Eliminar el último dígito
        }
        return suma;
    }
}
