
package excepciones4;

public class Excepciones4 {

    public static void main(String[] args) {
    //Propaga la excepcion
    
    try{
        int division  = miMetodo(10, 0);
        System.out.println(division);
    }catch(ArithmeticException e){
        System.out.println("Excepcion aritmetica arrojada");
        
        }
    }
    
    public static int miMetodo (int a, int b) throws ArithmeticException{
        int c =a/b;
        return c;
    }
}
