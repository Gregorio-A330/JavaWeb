
package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author dreis
 */
public class Formulario {
    private JFrame form;
    private JLabel lblNome;
    private JTextField txtNome;
    private JButton btnEnviarSaudacao;
    private Font fontePadrao;
    
    public Formulario() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        // instancia objeto da classe JFrame
        form = new JFrame("Meu primeiro Swing");
        // configura posição (x, y) e tamanho (largura e altura)
        form.setBounds(300, 250, 400, 200);
        // elimina pré-configurações de layout
        form.setLayout(null);
        // configura operação padrão ao fechar o formulário
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // configura fonte padrão dos objetos do formulário
        fontePadrao = new Font("Arial", Font.PLAIN , 16);
        
        // instancia objeto JLabel
        lblNome = new JLabel("Informe seu nome:");
        // configura posição (x, y) e tamanho (largura e altura)
        lblNome.setBounds(20, 30, 130, 20);
        // configura fonte da label
        lblNome.setForeground(Color.BLUE);
        lblNome.setFont(fontePadrao);
        // adiciona lblNome ao painel de conteúdo do form
        form.getContentPane().add(lblNome);
        
        // instancia objeto JTextField
        txtNome = new JTextField();
        // configura posição (x, y) e tamanho (largura e altura)
        txtNome.setBounds(155, 27, 200, 25);
        // configura fonte da caixa de texto
        txtNome.setFont(fontePadrao);
        // adiciona txtNome ao painel de conteúdo do form
        form.getContentPane().add(txtNome);
        
        // instancia objeto JButton
        btnEnviarSaudacao = new JButton("Saudar!");
        // configura posição (x, y) e tamanho (largura e altura)
        btnEnviarSaudacao.setBounds(100, 80, 200, 25);
        // configura fonte da caixa de texto
        btnEnviarSaudacao.setFont(fontePadrao);
        // configura interface ActionListener para manipular ação do botão, 
        // utilizando a criação dinâmica do comportamento do método da 
        // interface e o conceito de objeto anônimo
        btnEnviarSaudacao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Olá, " + txtNome.getText() + 
                        ", seja bem-vindo(a)!");
            }
        });
        // adiciona botão ao painel de conteúdo do form
        form.getContentPane().add(btnEnviarSaudacao);
        
        
        
        // apresenta o form
        form.setVisible(true);
    }
}

