/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;


public class Artistas extends Usuario {
    private String InfoCurriculum;
    private String Distinciones;

    public Artistas(String InfoCurriculum, String Distinciones, String Nombre, String Apellido) {
        super(Nombre, Apellido);
        this.InfoCurriculum = InfoCurriculum;
        this.Distinciones = Distinciones;
    }

    @Override
    public void ListarInformacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
