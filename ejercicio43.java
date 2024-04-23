public class ejercicio43 {
    public static void main(String[] args) {
         // Ejemplo de uso de la función
         int numero1 = 10;
         int numero2 = 5;
         int menor = encontrarMenor(numero1, numero2);
         System.out.println("El número menor entre " + numero1 + " y " + numero2 + " es: " + menor);
     }
 
     // Función para encontrar el número menor entre dos enteros
     public static int encontrarMenor(int num1, int num2) {
         if (num1 < num2) {
             return num1;
         } else {
             return num2;
         }
    }
}
