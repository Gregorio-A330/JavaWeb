
package negocio;

/**
 *
 * @author dreis
 */
abstract class Veiculo {
    private String nome, fabricante;
    protected int velocidade;
    private int ano;
    
    private final int VELOCIDADE_MAXIMA = 220;
    private final int VELOCIDADE_MINIMA = 0;

    public String getNome() { return nome; }
    public String getFabricante() { return fabricante; }
    public int getAno() { return ano; }
    public int getVelocidade() { return velocidade; }

    public Veiculo(String nome, String fabricante, int ano, int velocidade) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.ano = ano;
        this.velocidade = velocidade;
        controlarVelocidade();
    }
    
    public void acelerar(){
        velocidade += 5;
        controlarVelocidade();
    }

    public void desacelerar(){
        velocidade -= 5;
        controlarVelocidade();
    }
    
    public void parar(){
        velocidade = 0;
    }
    
    public String retornarInfo(){
        return String.format("Veículo: %s; velocidade: %dkm/h", nome, velocidade);
    }
    
    protected void controlarVelocidade(){
        if (velocidade > VELOCIDADE_MAXIMA) 
            velocidade = VELOCIDADE_MAXIMA;    
        if (velocidade < VELOCIDADE_MINIMA) 
            velocidade = VELOCIDADE_MINIMA;    
    }
}
