
package pkg2.v1trifiv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class V1TRIFIV {

    public static void main(String[] args) throws IOException {
        
       BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
       
       int num;
       float multres;
       float multcinco;
       
        System.out.println("Dame el numero a comparar: ");
        num=Integer.parseInt(bufEntrada.readLine());
        
        multres= num%3;
        multcinco = num%5;
        
        
        
        if (multres == 0){
            System.out.println("TRI");
        }
        
        if(multcinco==0){
            System.out.println("FIV");
        }
        
         if (multres ==0 && multcinco ==0){
            System.out.println("TRIFIV");
        }
       
        
    }
    
}
