
package pkg5.v4trifiv;

import funciones.funcionMultiplo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class V4TRIFIV {


    public static void main(String[] args) throws IOException {
        // declaracion de variables
            BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
                int num;
                
        // creo el objeto
            funcionMultiplo mult = new funcionMultiplo();
        //entrada de datos
            System.out.println("Dame un numero: ");
            num=Integer.parseInt(bufEntrada.readLine());
        //salida de datos
            System.out.println(mult.retornaMultiplo(num));
    }
    
}
