
package excepciones9;

public class Excepciones9 {

    public static void main(String[] args) {
        String[] nombre = new String[3];
        nombre[0] = "Marisol";
        nombre[1] = "Ricardo";

        try {
            String apellido = nombre[2].toUpperCase(); 
            System.out.println("Apellido: " + apellido);
        } catch (NullPointerException e) {
            System.out.println("¡Error: Referencia nula!");
            e.printStackTrace();
        }
    }
}
