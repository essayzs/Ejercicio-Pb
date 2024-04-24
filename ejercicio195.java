public class ejercicio195 {
    public static void main(String[] args) {
        // Arreglo ordenado de 20 elementos
        int[] arreglo = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40};

        // Elemento a buscar
        int elementoABuscar = 24;

        // Realizar la búsqueda binaria
        int comparaciones = 0;
        int indiceEncontrado = busquedaBinaria(arreglo, elementoABuscar, comparaciones);

        // Mostrar resultados
        if (indiceEncontrado != -1) {
            System.out.println("Elemento encontrado en el índice: " + indiceEncontrado);
            System.out.println("Cantidad de comparaciones realizadas: " + comparaciones);
        } else {
            System.out.println("Elemento no encontrado en el arreglo.");
        }
    }

    // Método de búsqueda binaria
    public static int busquedaBinaria(int[] arreglo, int elementoABuscar, int comparaciones) {
        int izquierda = 0;
        int derecha = arreglo.length - 1;

        while (izquierda <= derecha) {
            comparaciones++;
            int medio = izquierda + (derecha - izquierda) / 2;

            // Si el elemento está en la mitad
            if (arreglo[medio] == elementoABuscar) {
                return medio;
            }
            // Si el elemento es más pequeño, buscar en la mitad izquierda
            if (arreglo[medio] < elementoABuscar) {
                izquierda = medio + 1;
            }
            // Si el elemento es más grande, buscar en la mitad derecha
            else {
                derecha = medio - 1;
            }
        }
        // Elemento no encontrado
        return -1;
    }
}
