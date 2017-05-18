
package parcial;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;


public class Registro {
    private String text;
    
    
    public void RegistrarTxt() throws FileNotFoundException{
     Scanner s = new Scanner(new File("WebGallery.txt"));
      while (s.hasNextLine()){
         String texto = s.nextLine();
       }
    }
    
    public void ListarUsuario(){
        System.out.println();
    }
}
