public class ejercicio45 {
    public static void main(String[] args) {
          // Ejemplo de uso de la función
          double numero = 5.5;
          int signo = determinarSigno(numero);
          System.out.println("El signo del número " + numero + " es: " + signo);
      }
  
      // Función para determinar el signo de un número
      public static int determinarSigno(double numero) {
          if (numero < 0) {
              return -1;
          } else if (numero > 0) {
              return 1;
          } else {
              return 0;
          }
    }
}
