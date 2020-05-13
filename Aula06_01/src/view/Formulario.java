
package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author dreis
 */
public class Formulario {
    
    private JFrame form;
    private JLabel lblNome;
    private JTextField txtNome;
    private JButton btnSaudar;

    public Formulario() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        // inicializa formulário JFrame
        form = new JFrame("Meu primeiro Swing");
        // configura posição (x, y) e tamanho (width, height)
        form.setBounds(300, 250, 400, 200);
        // configura ação padrão ao fechar o formulário
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // elimina quaisquer pré-configurações de layout
        form.setLayout(null);
        
        // configura fonte-padrão
        Font fontePadrao = new Font("Arial", Font.PLAIN, 14);

        // instancia objeto JLabel
        lblNome = new JLabel("Informe seu nome:");
        // configura posição (x, y) e tamanho (width, height)
        lblNome.setBounds(20, 30, 125, 25);
        // configura fonte (cor, tipo e tamanho)
        lblNome.setForeground(Color.BLUE);
        lblNome.setFont(fontePadrao);
        // adiciona label ao painel de conteúdo do form
        form.getContentPane().add(lblNome);
        
        // instancia objeto JTextField
        txtNome = new JTextField();
        // configura posição (x, y) e tamanho (width, height)
        txtNome.setBounds(150, 30, 200, 25);
        // adiciona caixa de texto ao painel de conteúdo do form
        form.getContentPane().add(txtNome);
        
        // instancia objeto JButton
        btnSaudar = new JButton("Dar boas-vindas!");
        // configura posição (x, y) e tamanho (width, height)
        btnSaudar.setBounds(100, 90, 200, 25);
        // configura fonte
        btnSaudar.setFont(fontePadrao);
        // configura ação do botão
        btnSaudar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, 
                    "Olá, " + txtNome.getText() + ", seja bem-vindo!");
            }
        });
        // adiciona botão ao painel de conteúdo do form
        form.getContentPane().add(btnSaudar);

        // apresenta o formulário
        form.setVisible(true);
    }
    
    
}
