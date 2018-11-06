/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Consumidor;
import Modelo.Monitor;
import Modelo.Productor;

/**
 *
 * @author Ainhoa
 */
public class MainMonitores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Monitor monitorAlmacen = new Monitor();
        Productor p1 = new Productor(monitorAlmacen, "p1");
        Consumidor c1 = new Consumidor(monitorAlmacen, "c1");
        
        
        
        p1.start();
        c1.start();

    }
    
}
