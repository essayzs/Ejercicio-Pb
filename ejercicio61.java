public class ejercicio61 {
    public static void main(String[] args) {
        int sumaCuadrados = 0;

        // Iterar sobre los primeros 10 enteros mayores que cero
        for (int i = 1; i <= 10; i++) {
            sumaCuadrados += i * i; // Agregar el cuadrado del número a la suma
        }

        // Mostrar la suma de los cuadrados en la salida estándar
        System.out.println("La suma de los cuadrados de los 10 primeros enteros mayores que cero es: " + sumaCuadrados);
    }
}
