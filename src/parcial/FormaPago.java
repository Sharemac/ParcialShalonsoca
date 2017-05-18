/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

/**
 *
 * @author Estudiante
 */
public class FormaPago implements Pago {

    @Override
    public void RedireccionarOnLinePayments() {
        System.out.println("Ha sido redirrecionado a la entidad correspondiente");
    }
    
}
