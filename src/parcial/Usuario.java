/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;


public abstract class Usuario {
    protected String Nombre;
    protected String Apellido;

    public Usuario(String Nombre, String Apellido) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
    }
    public abstract void ListarInformacion();
    
}
