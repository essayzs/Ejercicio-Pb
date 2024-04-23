public class ejercicio29 {
    public static void main(String[] args) {
        // Ejemplo de uso de la función cubo
        float numero = 3.5f;
        float resultado = cubo(numero);
        System.out.println("El cubo de " + numero + " es: " + resultado);
    }

    // Función para calcular el cubo de un número real (float)
    public static float cubo(float numero) {
        return numero * numero * numero;
    }
}
