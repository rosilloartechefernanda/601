
package excepciones6;

public class Excepciones6 {

    public static void main(String[] args) {
        //ArrayIndexOutOfBoundsException
      int[] numbers = {1, 2, 3, 4, 5};

        try {
            // Intentamos acceder a un índice fuera del rango del array
            int element = numbers[11];
            System.out.println("Elemento obtenido: " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("¡Error: Índice fuera de rango!");
            e.printStackTrace();
        }
    }
}