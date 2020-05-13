
package negocio;

/**
 *
 * @author dreis
 */
public class Temperatura {
    private float grausCelsius;
    
    public float getGrausCelsius() { return grausCelsius; }
    
    public float getGrausFahrenheit() {
        return grausCelsius * 1.8f + 32f;
    }
    
    public Temperatura(float grausCelsius) {
        this.grausCelsius = grausCelsius;
    }
    
}
