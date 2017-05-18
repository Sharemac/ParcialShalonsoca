
package parcial;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Parcial {

    public static void main(String[] args) throws FileNotFoundException {
      int usuario=0;
        System.out.println("Bienvenido a WebGallery");
        System.out.println("Presione 1 para artista y 2 para comprador");
        
        
     
      PrintStream output = new PrintStream(new File("WebGallery.txt"));
      output.println();
    }
    
}
