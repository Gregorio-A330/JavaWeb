
package view;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author dreis
 */
public class Formulario {

    private JFrame form;
    private JLabel lblSexo;
    private JComboBox cboSexo;
    private int valorSelecionado = 0;


    public Formulario() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        // inicializa formulário JFrame
        form = new JFrame("JComboBox");
        // configura posição (x, y) e tamanho (width, height)
        form.setBounds(300, 250, 400, 200);
        // configura ação padrão ao fechar o formulário
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // elimina quaisquer pré-configurações de layout
        form.setLayout(null);
        // recupera área de conteúdo do formulário
        Container painel = form.getContentPane();
        
        // configura fonte-padrão
        Font fontePadrao = new Font("Arial", Font.PLAIN, 14);

        // instancia objeto JLabel
        lblSexo = new JLabel("Sexo:");
        // configura posição (x, y) e tamanho (width, height)
        lblSexo.setBounds(20, 30, 70, 25);
        // configura fonte (cor, tipo e tamanho)
        lblSexo.setForeground(Color.BLUE);
        lblSexo.setFont(fontePadrao);
        // adiciona label ao painel de conteúdo do form
        painel.add(lblSexo);

        cboSexo = new JComboBox();
        cboSexo.setBounds(100, 30, 200, 25);
        cboSexo.addItem("<< SELECIONE >>");
        cboSexo.addItem("Masculino");
        cboSexo.addItem("Feminino");
        cboSexo.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                // se a mudança de evento for de seleção (de um 
                // novo item), exibe o valor; se for de perda de 
                // seleção, não faz nada
                if (e.getStateChange() == ItemEvent.SELECTED){
                    // se o item selecionado for o primeiro, exibe mensagem de erro
                    if (cboSexo.getSelectedIndex() == 0){
                        JOptionPane.showMessageDialog(null, "Item inválido!");
                        cboSexo.setSelectedIndex(valorSelecionado);
                    }
                    else{
                        // se o item atual for diferente do anterior, exibe mensagem
                        if (valorSelecionado != cboSexo.getSelectedIndex()){
                            JOptionPane.showMessageDialog(null, 
                                cboSexo.getSelectedItem().toString());
                            // recupera o valor do índice do novo item
                            valorSelecionado = cboSexo.getSelectedIndex();
                        }
                    }
                }
            }
        });
        painel.add(cboSexo);

        // apresenta o formulário
        form.setVisible(true);
    }
    
    
}
