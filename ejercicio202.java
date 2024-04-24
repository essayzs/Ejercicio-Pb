import java.util.Calendar;

public class ejercicio202 {
    public static void main(String[] args) {
        // Obtener el año actual
        int anioActual = Calendar.getInstance().get(Calendar.YEAR);

        // Asumimos que la persona nació en 1990
        int anioNacimiento = 1990;

        // Calcular la edad
        int edad = anioActual - anioNacimiento;

        System.out.println("La edad de la persona es: " + edad + " años.");
    }
}
