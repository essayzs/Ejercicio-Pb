public class ejercicio143 {
    public static void main(String[] args) {
        // Inicializar la variable para almacenar la suma
        int suma = 0;

        // Iterar sobre los números del 1 al 100
        for (int i = 1; i <= 100; i++) {
            // Verificar si el número es par
            if (i % 2 == 0) {
                // Si es par, añadirlo a la suma
                suma += i;
            }
        }

        // Mostrar el resultado
        System.out.println("La suma de los números pares entre 1 y 100 es: " + suma);
    }
}
