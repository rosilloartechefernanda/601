
package excepciones2;

import javax.swing.JOptionPane;

public class Excepciones2 {

    public static void main(String[] args) {
        int x, y;
        try{
            
            x=Integer.parseInt(JOptionPane.showInputDialog (null, "Ingrese un numero 1", "Solicito numero", 3));
            
        }catch(NumberFormatException n){
            System.out.println(n.getMessage() + " No es numero entero");
        }
        
    }
    
}
