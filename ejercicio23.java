import java.util.Scanner;
public class ejercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Generar tres dígitos aleatorios distintos entre 0 y 9
        int digito1, digito2, digito3;
        do {
            digito1 = (int) (Math.random() * 10);
            digito2 = (int) (Math.random() * 10);
            digito3 = (int) (Math.random() * 10);
        } while (digito1 == digito2 || digito1 == digito3 || digito2 == digito3);

        // Mensaje de bienvenida
        System.out.println("Bienvenido al juego del Rojo-Amarillo-Verde!");
        System.out.println("Intenta adivinar los tres dígitos distintos generados.");

        // Inicializar el número de intentos
        int intentos = 0;

        // Comenzar el juego
        while (intentos < 4) {
            intentos++;

            // Solicitar al jugador que ingrese los tres dígitos
            System.out.println("Intento #" + intentos + ": Ingresa tres dígitos distintos separados por espacios:");
            int d1 = scanner.nextInt();
            int d2 = scanner.nextInt();
            int d3 = scanner.nextInt();

            // Comprobar si los dígitos coinciden con los generados
            if (d1 == digito1 && d2 == digito2 && d3 == digito3) {
                System.out.println("¡Felicidades! Has adivinado los tres dígitos en " + intentos + " intentos.");
                break;
            }

            // Determinar las pistas de rojo, amarillo y verde
            int rojo = 0, amarillo = 0, verde = 0;

            if (d1 == digito1 || d1 == digito2 || d1 == digito3) {
                if (d1 == digito1) verde++;
                else rojo++;
            } else amarillo++;

            if (d2 == digito1 || d2 == digito2 || d2 == digito3) {
                if (d2 == digito2) verde++;
                else rojo++;
            } else amarillo++;

            if (d3 == digito1 || d3 == digito2 || d3 == digito3) {
                if (d3 == digito3) verde++;
                else rojo++;
            } else amarillo++;

            // Mostrar las pistas al jugador
            System.out.println("Pistas:");
            System.out.println("Rojo: " + rojo);
            System.out.println("Amarillo: " + amarillo);
            System.out.println("Verde: " + verde);
        }
        
        if (intentos == 4) {
            System.out.println("Lo siento, has agotado tus 4 intentos. Los dígitos correctos eran: " + digito1 + ", " + digito2 + ", " + digito3 + ".");
        }
        
        scanner.close(); // Cerrar el scanner al finalizar el juego
    }
}
