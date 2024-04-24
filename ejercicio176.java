import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ejercicio176 {
    public static void main(String[] args) {
        // Obtener la fecha actual
        LocalDate fechaActual = LocalDate.now();

        // Determinar la fecha del día siguiente
        LocalDate fechaSiguiente = fechaActual.plusDays(1);

        // Formatear las fechas en formato AAAA-MM-DD
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String fechaActualFormateada = fechaActual.format(formato);
        String fechaSiguienteFormateada = fechaSiguiente.format(formato);

        // Mostrar la fecha del día siguiente
        System.out.println("Fecha actual: " + fechaActualFormateada);
        System.out.println("Fecha del día siguiente: " + fechaSiguienteFormateada);
    }
}
