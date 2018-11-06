package Modelo;

/**
 *
 * @author Ainhoa
 */
public class Monitor {
    
    //generará n valores de entrada y el productor genera los datos y el consumidor los consume (visualizar)
    //los monitores implican que los métodos siempre van a estar synchronized, si no, no sería un monitor.
    
    public String dato;

    public synchronized String getDato() {
        return dato;
    }

    public synchronized void newDato(String dato) {
        this.dato = dato;
    }
}
