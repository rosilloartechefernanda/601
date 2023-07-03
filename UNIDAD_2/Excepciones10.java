
package excepciones10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Excepciones10 {

    public static void main(String[] args) {
         //IOException
       BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("nonexistentfile.txt"));
            String line = reader.readLine();
            System.out.println(line);
        } catch (IOException e) {
            System.out.println("¡Error: se produjo una excepción de E/S!");
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}