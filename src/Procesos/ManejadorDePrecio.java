/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

import Postres.Postre;

/**
 *
 * @author JOVEN EJEMPLAR
 */
public class ManejadorDePrecio {
    
    public double calcularPrecioFinal(Postre postre){
        return postre.calcularPrecioFinal();
    }
    
    public static String showPrecioFinal(Postre postre){
        return postre.showPrecioFinal();
    }
}
