/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Coche;
import Modelo.HiloCocheACCION;
import Modelo.Puente;

/**
 *
 * @author Ainhoa
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Puente p = new Puente();
        
        
        for (int i = 0; i < 10; i++) {
            Coche c  = new Coche("Coche "+i);
            new HiloCocheACCION(c, p).start();
            
        }


}
}
