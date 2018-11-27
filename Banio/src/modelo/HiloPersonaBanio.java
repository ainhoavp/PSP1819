package modelo;

/**
 *
 * @author Ainhoa
 */
public class HiloPersonaBanio extends Thread {

    private Banio banio;
    private Persona persona;

    public HiloPersonaBanio(Banio banio, Persona persona) {
        this.banio = banio;
        this.persona = persona;
    }

    public Persona getPersona() {
        return persona;
    }

    @Override
    public void run() {
        banio.entrarBanio(this);
        banio.tiempo(this);
        banio.salirBanio(this);
    }

}
