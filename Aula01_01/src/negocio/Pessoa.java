
package negocio;

/**
 *
 * @author dreis
 */
abstract class Pessoa {
    protected String nome;
    private String email;

    public String getNome() { return nome; }
//    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String saudar(){
        return String.format("Olá, %s, seja bem-vindo!", nome);
    }
}
