/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

import Leche.LecheDeslactosada;
import Leche.LecheDescremada;
import Leche.LecheEntera;
import Postres.*;

/**
 *
 * @author Pedro Mendoza
 */
public class ManejadorDeLeche {
    private LecheEntera lEntera;
    
    public ManejadorDeLeche(LecheEntera lecheEntera){
        lEntera = lecheEntera;
    }
    
    public void cambiarTipoLeche(Postre postre){
        lEntera.cambiarTipoLeche(postre);
    }        
    
}
