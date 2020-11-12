/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import Adicionales.Aderezo;
import Adicionales.Crema;
import Adicionales.Frutilla;
import Postres.*;
import Procesos.*;
import Leche.*;
import java.util.ArrayList;
/**
 *
 * @author djurado
 */
public class Sistema {
    /*public static void main(String [ ] args){
        // Producir un helado de vainilla y una torta de chocolate, 
        // a ambos agregarles CREMA y FRUTILLAS
        // y cambiar el tipo de leche por Leche Descremada
        // Finalmente mostrar el precio final de cada uno
        
        
        LecheEntera leche = new LecheDeslactosada();
        ManejadorDeLeche mnj_leche = new ManejadorDeLeche();
        
        // Producir Helado
        Helado helado_vainilla = new Helado("Vainilla");
        helado_vainilla.anadirAderezo(Aderezo.CREMA);
        helado_vainilla.anadirAderezo(Aderezo.FRUTILLA);
        System.out.println(helado_vainilla);
       mnj_leche.cambiarTipoLeche(leche, helado_vainilla);
        System.out.println(helado_vainilla.showPrecioFinal());
        System.out.println(" ");
        // Producir Pastel
        Pastel pastel_chocolate = new Pastel("Chocolate");
        pastel_chocolate.quitarAderezo(Aderezo.CREMA);
        pastel_chocolate.anadirAderezo(Aderezo.FRUTILLA);
        System.out.println(pastel_chocolate);
       mnj_leche.cambiarTipoLeche(leche, pastel_chocolate);
        System.out.println(pastel_chocolate.showPrecioFinal());
        
        
    }*/
    
    public static void main(String [] args){
        // Producir un helado de vainilla y una torta de chocolate, 
        // a ambos agregarles CREMA y FRUTILLAS
        // y cambiar el tipo de leche por Leche Deslactosada
        ArrayList<Postre> arrPostres = new ArrayList<>();
        ManejadorDeLeche mnj_leche = new ManejadorDeLeche(new LecheDescremada());
        
        // Producir Helado
        Postre helado_vainilla = new Helado("Vainilla");
        arrPostres.add(helado_vainilla);
        // Producir Pastel
        Postre pastel_chocolate = new Pastel("Chocolate");
        arrPostres.add(pastel_chocolate);
        
        arrPostres.forEach(postre -> {
            Crema crema =  new Crema();
            crema.setNombre("crema");
            Frutilla frutilla = new Frutilla();
            frutilla.setNombre("frutilla");
            
            postre.anadirAderezo(crema);
            postre.anadirAderezo(frutilla);
            System.out.println(postre);
            mnj_leche.cambiarTipoLeche(postre);
            ManejadorDePrecio.showPrecioFinal(postre);
            System.out.println();
        });        
        
    }
}
