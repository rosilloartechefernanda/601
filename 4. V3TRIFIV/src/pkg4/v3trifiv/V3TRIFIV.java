package pkg4.v3trifiv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class V3TRIFIV {

    public static void main(String[] args) throws IOException {
        // DECLARAR VARIABLES
            
             BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
                int num;
                
                // entrada de datos
            System.out.println("Dame un numero: ");
            num=Integer.parseInt(bufEntrada.readLine());

         System.out.println(retornaMultiplos(num));   
    }

    
    
    // creacion de la funcion 
    public static String retornaMultiplos(int numero) {
        float multres;
        float multcinco;

        // procesar datos
        multres = numero % 3;
        multcinco = numero % 5;

            if (multres == 0 && multcinco == 0) {
                return "TRIFIV";
                } else if (multres == 0) {
                    return "TRI";
                    } else if (multcinco == 0) {
                        return "FIV";
                    }
        
            return "NINGUN VALOR";

    }

}
