import java.util.concurrent.TimeUnit;

public class ejercicio136 {
    public static void main(String[] args) {
        int horas = 0;
        int minutos = 0;
        int segundos = 0;

        while (true) {
            // Mostrar el reloj en formato Horas:Minutos:Segundos
            System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);

            // Incrementar los segundos
            segundos++;
            if (segundos == 60) {
                segundos = 0;
                // Incrementar los minutos
                minutos++;
                if (minutos == 60) {
                    minutos = 0;
                    // Incrementar las horas
                    horas++;
                    if (horas == 24) {
                        horas = 0; // Reiniciar el contador de horas a 0 al llegar a 24
                    }
                }
            }

            // Esperar 1 segundo antes de actualizar la hora en pantalla
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
