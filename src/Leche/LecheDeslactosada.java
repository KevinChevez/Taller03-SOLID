/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leche;

/**
 *
 * @author Pedro Mendoza
 */
public class LecheDeslactosada extends LecheEntera {
    
    @Override
    public void usarHelado() {
        System.out.println("Usando leche deslactosada");
    }
    /**
     * Se lanza una excepcion al metodo en vez de hacero dentro del metodo
     * @throws RuntimeException 
     */
    @Override
    public void usarPastel() throws RuntimeException{
        // Lanzar error No se puede usar en pastel
        System.out.println(" No se puede agregar leche deslactosada al Pastel");
           
    }
        
}
