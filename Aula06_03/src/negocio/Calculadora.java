
package negocio;

/**
 *
 * @author dreis
 */
public class Calculadora implements ICalculo{

    @Override
    public float somar(float valor1, float valor2) {
        return valor1 + valor2;
    }

    @Override
    public float subtrair(float valor1, float valor2) {
        return valor1 - valor2;
    }

    @Override
    public float multiplicar(float valor1, float valor2) {
        return valor1 * valor2;
    }

    @Override
    public float dividir(float valor1, float valor2) {
        return valor1 / valor2;
    }
    
}
