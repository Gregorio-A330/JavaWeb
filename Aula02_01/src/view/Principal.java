
package view;

import negocio.Figura;
import negocio.Quadrado;

/**
 *
 * @author dreis
 */
public class Principal {

    public static void main(String[] args) {
        // *** UPCASTING ***
        // instancia objeto da classe-filha Quadrado
        Quadrado objQuadradoUp = new Quadrado();
        // atribui valor
        objQuadradoUp.setLado(5);
        // via atribuição direta (casting implícito ou 
        // upcasting), gera objeto da mãe
        Figura objFiguraUp = objQuadradoUp;
        // a partir de objeto da mãe, apresenta resultado
        System.out.println(
            String.format("[Upcasting] Área da figura: %.2fcm².", 
                    objFiguraUp.calcularArea()));
        
        // *** DOWNCASTING ***
        // gera instância da classe-mãe (a partir de objeto da filha)
        Figura objFiguraDown = new Quadrado();
        // via casting explícito (downcasting), gera instância da classe-filha
        Quadrado objQuadradoDown = (Quadrado)objFiguraDown;
        objQuadradoDown.setLado(10);
        // a partir de objeto da filha, apresenta resultado
        System.out.println(
            String.format("[Downcasting] Área do quadrado: %.2fcm².", 
                    objQuadradoDown.calcularArea()));
        
    }
    
}














