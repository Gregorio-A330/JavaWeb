
package negocio;

/**
 *
 * @author dreis
 */
public class CamaraTermica {
    
    private Temperatura temperaturaMinima;
    private Temperatura temperaturaMaxima;

    public Temperatura getTemperaturaMinima() { return temperaturaMinima; }
    public Temperatura getTemperaturaMaxima() { return temperaturaMaxima; }
    
    public CamaraTermica(float tempMinima, float tempMaxima) {
        temperaturaMinima = new Temperatura(tempMinima);
        temperaturaMaxima = new Temperatura(tempMaxima);
    }
    
    
}
