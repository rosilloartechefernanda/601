
package funciones;

public class funcionMultiplo {
    public String retornaMultiplo(int numero){
        
          if (numero%3 ==0 && numero%5==0){
                return"TRIFIV";
                }
        
                else if (numero%3 ==0){
                   return "TRI";
                    }
                
                        else if(numero%5==0){
                            return "FIV";
                            }
          
        return "NINGUN VALOR";
             
    }
}
