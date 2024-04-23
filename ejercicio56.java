public class ejercicio56 {
    public static void main(String[] args) {
        // Ejemplo de uso de la función convertirTiempo
        int segundos = 3665;
        String resultado = convertirTiempo(segundos);
        System.out.println(segundos + " segundos equivalen a: " + resultado);
    }

    // Función para convertir un tiempo expresado en segundos a horas, minutos y segundos
    public static String convertirTiempo(int segundos) {
        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        int segundosRestantes = segundos % 60;

        return horas + " horas, " + minutos + " minutos y " + segundosRestantes + " segundos";
    }
}
