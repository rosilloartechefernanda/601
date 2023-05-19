package pkg3.v2trifiv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class V2TRIFIV {

    public static void main(String[] args) throws IOException {
        // declaracion de variables
            BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));

            int num;
            float multres;
            float multcinco;

        // entrada de datos
            System.out.println("Dame un numero: ");
            num=Integer.parseInt(bufEntrada.readLine());
            
        // procesar datos
            multres = num%3;
            multcinco= num%5;
        
        // salida de datos
        
             if (multres ==0 && multcinco==0){
                System.out.println("TRIFIV");
                }
        
                else if (multres ==0){
                   System.out.println("TRI");
                    }
                
                        else if(multcinco==0){
                            System.out.println("FIV");
                            }
             
    }

}
