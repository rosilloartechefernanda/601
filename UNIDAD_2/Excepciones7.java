
package excepciones7;

public class Excepciones7 {

    public static void main(String[] args) {
        //ClassCastException
        
        try {
            Object obj = new Integer(100);
            String str = (String) obj; 
            System.out.println(str);
        } catch (ClassCastException e) {
            System.out.println("¡Error: No se puede realizar la conversión de tipos!");
            e.printStackTrace();
        }
    }
}