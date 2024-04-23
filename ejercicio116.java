public class ejercicio116 {
    public static void main(String[] args) {
        int sumaPares = 0;
        int multiplicacionImpares = 1;

        // Suma de los números pares entre 1 y 1000
        for (int i = 2; i <= 1000; i += 2) {
            sumaPares += i;
        }

        // Multiplicación de los números impares entre 1 y 50
        for (int j = 1; j <= 50; j += 2) {
            multiplicacionImpares *= j;
        }

        System.out.println("La suma de los números pares entre 1 y 1000 es: " + sumaPares);
        System.out.println("La multiplicación de los números impares entre 1 y 50 es: " + multiplicacionImpares);
    }
}
