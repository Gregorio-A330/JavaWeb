
package negocio;

/**
 *
 * @author dreis
 */
public class Horario {

    private Hora hora;
    private Minuto minuto;

    public Hora getHora(){ return hora; }
    public void setHora(int valor){ hora.setUnidade(valor); }
    
    public Minuto getMinuto(){ return minuto; }
    public void setMinuto(int valor){ minuto.setUnidade(valor); }
    
    public Horario(int hr, int min) {
        // TODO: implementar o controle de horas e minutos no "construtor"
        this.hora = new Hora();
        this.hora.setUnidade(hr);

        this.minuto = new Minuto();
        this.minuto.setUnidade(min);
    }
    
    public void incrementar(){
        minuto.incrementar();
        // TODO: melhorar o controle do "incrementar()"
        if (minuto.getUnidade() > 59){
            minuto.setUnidade(0);
            hora.incrementar();
        }
    }
    
    public void decrementar(){
        minuto.decrementar();
        // TODO: melhorar o controle do "decrementar()"
        if (minuto.getUnidade() < 0){
            minuto.setUnidade(59);
            hora.decrementar();
        }
    }
    
    // TODO: implementar "adicionarMinutos(int minutos)"
    public void adicionarMinutos(int minutos){
    
    }
    
    // TODO: implementar "removerMinutos(int minutos)"
    public void removerMinutos(int minutos){
    
    }
    
    public String informarHorario(){
        // recupera unidades de hora e minuto e as converte para String
        String horaTemp = String.valueOf(hora.getUnidade());
        String minutoTemp = String.valueOf(minuto.getUnidade());
        // verifica se hora e minuto estão com 2 caracteres; se não 
        // estiverem, concatena um "0" na frente
        horaTemp = (horaTemp.length() == 2) ? horaTemp : "0".concat(horaTemp);
        minutoTemp = (minutoTemp.length() == 2) ? minutoTemp : "0".concat(minutoTemp);
        // retorna o horário formatado
        return horaTemp + "h" + minutoTemp;
    }
}
