
package excepciones11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Excepciones11 {

    public static void main(String[] args) {
        //FileNotFoundException
        
        try {
            // Intentamos abrir un archivo que no existe
            File file = new File("archivo.txt");
            Scanner scanner = new Scanner(file);
            
            // Leemos el contenido del archivo línea por línea
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            
            // Cerramos el scanner
            scanner.close();
        } catch (FileNotFoundException e) {
            // Manejamos la excepción si el archivo no se encuentra
            System.out.println("El archivo no se encontró: " + e.getMessage());
        }
    }
}