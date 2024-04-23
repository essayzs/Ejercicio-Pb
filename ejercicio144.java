public class ejercicio144 {
    public static void main(String[] args) {
        // Inicializar variables para almacenar la suma de los pares y la multiplicación de los impares
        int sumaPares = 0;
        int multiplicacionImpares = 1;

        // Iterar sobre los números del 1 al 100
        for (int i = 1; i <= 100; i++) {
            // Verificar si el número es par
            if (i % 2 == 0) {
                // Si es par, añadirlo a la suma de los pares
                sumaPares += i;
            } else {
                // Si es impar, multiplicarlo con los impares anteriores
                multiplicacionImpares *= i;
            }
        }

        // Mostrar el resultado
        System.out.println("La suma de los números pares entre 1 y 100 es: " + sumaPares);
        System.out.println("La multiplicación de los números impares entre 1 y 100 es: " + multiplicacionImpares);
    }
}
