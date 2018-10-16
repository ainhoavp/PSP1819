/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Modelo.HiloPersona;
import Modelo.Jardin;

/**
 *
 * @author Ainhoa
 */
public class MainJardin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      
        Jardin jardin = new Jardin(100);
        
        for (int i = 0; i <30; i++) {
            {
                new HiloPersona("P "+i, jardin).start();
            }
        }
        
    }
    
}
