
package view;

import negocio.Carro;
import negocio.Moto;

/**
 *
 * @author dreis
 */
public class Principal {

    public static void main(String[] args) {
        Carro objC1 = new Carro("Gol", "Volkswagen", 2001, 205, 2);
        System.out.println(objC1.retornarInfo());
        
        objC1.acelerar();
        System.out.println(objC1.retornarInfo());
        
        objC1.acelerar();
        System.out.println(objC1.retornarInfo());
        
        objC1.acelerar();
        System.out.println(objC1.retornarInfo());
        
        objC1.acelerar();
        System.out.println(objC1.retornarInfo());


        Moto objM1 = new Moto("Ninja", "Kawasaki", 2009, 205);
        System.out.println(String.format("%s; apoio acionado: %b.", 
                    objM1.retornarInfo(), objM1.isApoioAcionado()));
        
        objM1.acelerar();
        System.out.println(String.format("%s; apoio acionado: %b.", 
                    objM1.retornarInfo(), objM1.isApoioAcionado()));
        
        objM1.acelerar();
        System.out.println(String.format("%s; apoio acionado: %b.", 
                    objM1.retornarInfo(), objM1.isApoioAcionado()));
        
        objM1.acelerar();
        System.out.println(String.format("%s; apoio acionado: %b.", 
                    objM1.retornarInfo(), objM1.isApoioAcionado()));
        
        objM1.acelerar();
        System.out.println(String.format("%s; apoio acionado: %b.", 
                    objM1.retornarInfo(), objM1.isApoioAcionado()));
    }
    
}
