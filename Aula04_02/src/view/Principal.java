
package view;

import negocio.Horario;

/**
 *
 * @author dreis
 */
public class Principal {

    public static void main(String[] args) {
        Horario objHorario = new Horario(21, 57);
        System.out.println("Agora são: " + objHorario.informarHorario());
        
        objHorario.incrementar();
        System.out.println("Agora são: " + objHorario.informarHorario());
        
        objHorario.incrementar();
        System.out.println("Agora são: " + objHorario.informarHorario());
        
        objHorario.incrementar();
        System.out.println("Agora são: " + objHorario.informarHorario());
        
        objHorario.incrementar();
        System.out.println("Agora são: " + objHorario.informarHorario());
    }
    
}
