
package negocio;

/**
 *
 * @author dreis
 */
public class Carro extends Veiculo{
    
    private int quantidadePortas;

    public int getQuantidadePortas() { return quantidadePortas; }
    
    public Carro(String nome, String fabricante, int ano, int velocidade, int quantidadePortas) {
        super(nome, fabricante, ano, velocidade);
        this.quantidadePortas = quantidadePortas;
    }

    @Override
    public void acelerar() {
        velocidade += 10;
        controlarVelocidade();
    }
    
}
