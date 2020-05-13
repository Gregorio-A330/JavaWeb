
package view;

import javax.swing.JOptionPane;
import negocio.Adicao;
import negocio.Calculo;
import negocio.Divisao;
import negocio.Multiplicacao;
import negocio.Subtracao;

/**
 *
 * @author dreis
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // apresenta menu de opções ao usuário
        int opcao = Integer.parseInt(
            JOptionPane.showInputDialog(
                "*** CALCULADORA ***\n\nEscolha a operação desejada:\n" +
                "1 - Somar\n2 - Subtrair\n3 - Multiplicar\n4 - Dividir"));
                
        float v1 = Float.parseFloat(JOptionPane.showInputDialog("Informe o primeiro valor:"));
        float v2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o segundo valor:"));
        
        // declara objeto da classe pai
        Calculo objCalculadora = null;
        
        // em função da opção desejada, instancia a filha correspondente
        switch(opcao){
            case 1: objCalculadora = new Adicao(); break;
            case 2: objCalculadora = new Subtracao(); break;
            case 3: objCalculadora = new Multiplicacao(); break;
            case 4: objCalculadora = new Divisao(); break;
        }
        // atribui valores
        objCalculadora.setValor1(v1);
        objCalculadora.setValor2(v2);
        // executa regra de negócio
        objCalculadora.calcular();
        // exibe o resultado
        JOptionPane.showMessageDialog(null,
                String.format("Resultado: %.2f", objCalculadora.getResultado()));
        
    }
    
}
