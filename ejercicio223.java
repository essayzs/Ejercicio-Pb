public class ejercicio223 {
    public static void main(String[] args) {
        int cuenta = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0 || i % 3 == 0) {
                cuenta++;
            }
        }

        System.out.println("La cantidad de números que son múltiplos de 2 o de 3 entre 1 y 100 es: " + cuenta);
    }
}
