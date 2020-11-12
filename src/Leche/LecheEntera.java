/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leche;

import Postres.*;

public abstract class LecheEntera {
    public abstract void usarHelado();
    public abstract void usarPastel();
    
    public void cambiarTipoLeche(Object postre){
        // Cambiar tipo de leche en la preparación de los postres, usar leche deslactosada
        System.out.println(postre.getClass());
        System.out.println(Pastel.class);
        
        if(postre.getClass() == Pastel.class){
            this.usarPastel(); 
        
        }else{
            this.usarHelado(); 
        }
    }
}
