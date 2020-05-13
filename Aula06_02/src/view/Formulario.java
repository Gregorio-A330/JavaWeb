
package view;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import negocio.Calculadora;

/**
 *
 * @author dreis
 */
public class Formulario {

    private JFrame form;
    private JLabel lblValor1, lblValor2, lblResultado;
    private JTextField txtValor1, txtValor2;
    private JButton btnSomar, btnSubtrair, btnMultiplicar, btnDividir;
    
    public Formulario() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        form = new JFrame("Calculadora");
        form.setBounds(400, 150, 450, 250);
        form.setLayout(null);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container painel = form.getContentPane();
        
        lblValor1 = new JLabel("Valor 1:");
        lblValor1.setBounds(40, 30, 50, 25);
        painel.add(lblValor1);
        
        txtValor1 = new JTextField();
        txtValor1.setBounds(100, 30, 70, 25);
        painel.add(txtValor1);
                
        lblValor2 = new JLabel("Valor 2:");
        lblValor2.setBounds(40, 70, 50, 25);
        painel.add(lblValor2);
        
        txtValor2 = new JTextField();
        txtValor2.setBounds(100, 70, 70, 25);
        painel.add(txtValor2);
        
        lblResultado = new JLabel("Resultado");
        lblResultado.setBounds(150, 130, 200, 35);
        lblResultado.setForeground(Color.BLUE);
        lblResultado.setFont(new Font("Arial", Font.BOLD, 16));
        painel.add(lblResultado);
                
        btnSomar = new JButton("+");
        btnSomar.setBounds(230, 25, 60, 30);
        btnSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (validarPreenchimento()){
                    float v1 = Float.parseFloat(txtValor1.getText());
                    float v2 = Float.parseFloat(txtValor2.getText());
                    Calculadora objCalc = new Calculadora();
                    float result = objCalc.somar(v1, v2);
                    lblResultado.setText(String.format("Resultado: %.2f", result));
                }
            }
        });
        painel.add(btnSomar);
        
        btnSubtrair = new JButton("-");
        btnSubtrair.setBounds(320, 25, 60, 30);
        btnSubtrair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (validarPreenchimento()){
                    float v1 = Float.parseFloat(txtValor1.getText());
                    float v2 = Float.parseFloat(txtValor2.getText());
                    Calculadora objCalc = new Calculadora();
                    float result = objCalc.subtrair(v1, v2);
                    lblResultado.setText(String.format("Resultado: %.2f", result));
                }
            }
        });
        painel.add(btnSubtrair);
        
        btnMultiplicar = new JButton("x");
        btnMultiplicar.setBounds(230, 70, 60, 30);
        btnMultiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (validarPreenchimento()){
                    float v1 = Float.parseFloat(txtValor1.getText());
                    float v2 = Float.parseFloat(txtValor2.getText());
                    Calculadora objCalc = new Calculadora();
                    float result = objCalc.multiplicar(v1, v2);
                    lblResultado.setText(String.format("Resultado: %.2f", result));
                }
            }
        });
        painel.add(btnMultiplicar);
        
        btnDividir = new JButton("/");
        btnDividir.setBounds(320, 70, 60, 30);
        btnDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (validarPreenchimento()){
                    float v1 = Float.parseFloat(txtValor1.getText());
                    float v2 = Float.parseFloat(txtValor2.getText());
                    Calculadora objCalc = new Calculadora();
                    float result = objCalc.dividir(v1, v2);
                    lblResultado.setText(String.format("Resultado: %.2f", result));
                }
            }
        });
        painel.add(btnDividir);
                
        form.setVisible(true);
    }
    
    private boolean validarPreenchimento(){
        return (txtValor1.getText().length() > 0 &&
                txtValor2.getText().length() > 0);
    }
}
