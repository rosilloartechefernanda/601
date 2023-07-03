
package excepciones3;

import javax.swing.JOptionPane;

public class Excepciones3 {

        public static void main(String[] args) {
        int x, y;
        try{
            
            x=Integer.parseInt(JOptionPane.showInputDialog (null, "Ingrese un numero 1", "Solicito numero", 3));
            y=Integer.parseInt(JOptionPane.showInputDialog (null, "Ingrese un numero 2", "Solicito numero", 3));
            JOptionPane.showMessageDialog(null, "La division de "+ x + "/"+ y+ " es "+ (x/y), "Mostrando resultado", 1);
        }catch(NumberFormatException n){
            System.out.println(n.getMessage() + " No es numero entero");
        }catch (ArithmeticException a){
            System.out.println(a.getMessage() + " No se puede dividir entre 0");
        }
    }
    
}
