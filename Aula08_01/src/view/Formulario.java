/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author dreis
 */
public class Formulario {
    private JFrame form;
    private JLabel lblBebidasPreferidas;
    private JCheckBox chkAgua, chkSuco, chkCerveja, chkCachaca;
    String bebidasSelecionadas = "As bebidas selecionadas são: ";
    private JButton btnApresentarBebidas;
    
    public Formulario() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        // inicializa formulário JFrame
        form = new JFrame("JCheckBox");
        // configura posição (x, y) e tamanho (width, height)
        form.setBounds(440, 250, 400, 200);
        // configura ação padrão ao fechar o formulário
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // elimina quaisquer pré-configurações de layout
        form.setLayout(null);
        // recupera área de conteúdo do formulário
        Container painel = form.getContentPane();
        
        // configura fonte-padrão
        Font fontePadrao = new Font("Arial", Font.PLAIN, 14);

        // instancia objeto JLabel
        lblBebidasPreferidas = new JLabel("Selecione suas bebidas prediletas:");
        // configura posição (x, y) e tamanho (width, height)
        lblBebidasPreferidas.setBounds(20, 20, 260, 25);
        // configura fonte (cor, tipo e tamanho)
        lblBebidasPreferidas.setForeground(Color.BLUE);
        lblBebidasPreferidas.setFont(fontePadrao);
        // adiciona label ao painel de conteúdo do form
        painel.add(lblBebidasPreferidas);
        
        chkAgua = new JCheckBox("Água");
        chkAgua.setBounds(30, 55, 70, 20);
//        chkAgua.addItemListener(new ItemListener() {
//            @Override
//            public void itemStateChanged(ItemEvent e) {
//                if (e.getStateChange() == ItemEvent.SELECTED){
//                    if (chkAgua.isSelected())
//                        bebidasSelecionadas += "\nÁgua";
//                    JOptionPane.showMessageDialog(null, bebidasSelecionadas);
//                }
//            }
//        });
        painel.add(chkAgua);
        
        chkSuco = new JCheckBox("Suco");
        chkSuco.setBounds(110, 55, 70, 20);
        painel.add(chkSuco);
        
        chkCerveja = new JCheckBox("Cerveja");
        chkCerveja.setBounds(190, 55, 70, 20);
        painel.add(chkCerveja);
        
        chkCachaca = new JCheckBox("Cachaça");
        chkCachaca.setBounds(270, 55, 80, 20);
        painel.add(chkCachaca);
        
        btnApresentarBebidas = new JButton("Apresentar bebidas selecionadas");
        btnApresentarBebidas.setBounds(70, 100, 230, 25);
        btnApresentarBebidas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bebidasSelecionadas = "Bebidas selecionadas:";
                if (chkAgua.isSelected())
                    bebidasSelecionadas += "\nÁgua";
                if (chkSuco.isSelected())
                    bebidasSelecionadas += "\nSuco";
                if (chkCerveja.isSelected())
                    bebidasSelecionadas += "\nCerveja";
                if (chkCachaca.isSelected())
                    bebidasSelecionadas += "\nCachaça";
                JOptionPane.showMessageDialog(null, bebidasSelecionadas);
            }
        });
        painel.add(btnApresentarBebidas);
        
        
        // apresenta o formulário
        form.setVisible(true);
        
    }
    
}
