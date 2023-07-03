
package excepciones8;

public class Excepciones8 {

    public static void main(String[] args) {
        
        //ClassNotFoundExceptionExample 
       try {
            Class.forName("com.otherpackage.NonExistentClass");
        } catch (ClassNotFoundException e) {
            System.out.println("¡Error: Clase no encontrada!");
            e.printStackTrace();
        }
    }
}