package view;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import N0050481623013.Avaliacao;

/**
 *
 * @author Gabriel Couto
 */
public class Formulario {

    private int valorSelecionado = 0;
    private JFrame form;
    private JLabel lblNota1, lblNota2, lblNota3, lblQtdPresenca, lblTotalAulas, lblSituacao;
    private JTextField txtNota1, txtNota2, txtNota3, txtQtdPresenca, txtTotalAulas;
    private JButton btnCalcularSituacao;
    private JComboBox cboNotas;

    public Formulario() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {

        form = new JFrame("Calcular Média");
        form.setBounds(500, 200, 400, 350);
        form.setLayout(null);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container painel = form.getContentPane();

        cboNotas = new JComboBox();
        cboNotas.setBounds(20, 20, 180, 20);
        cboNotas.addItem("<SELECIONE>");
        cboNotas.addItem("2 Notas");
        cboNotas.addItem("3 Notas");
        cboNotas.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

                if (e.getStateChange() == ItemEvent.SELECTED) {

                    if (cboNotas.getSelectedIndex() == 0) {
                        JOptionPane.showMessageDialog(null, "Inválido");
                    }
                    if (cboNotas.getSelectedIndex() == 1) {
                        txtQtdPresenca.setEnabled(true);
                        txtTotalAulas.setEnabled(true);
                        txtNota1.setEnabled(true);
                        txtNota2.setEnabled(true);
                        txtNota3.setEnabled(false);
                    }
                    if (cboNotas.getSelectedIndex() == 2) {
                        txtQtdPresenca.setEnabled(true);
                        txtTotalAulas.setEnabled(true);
                        txtNota1.setEnabled(true);
                        txtNota2.setEnabled(true);
                        txtNota3.setEnabled(true);
                    }
                }
            }
        });

        painel.add(cboNotas);

        lblQtdPresenca = new JLabel("Presença:");
        lblQtdPresenca.setBounds(40, 60, 300, 20);
        painel.add(lblQtdPresenca);

        txtQtdPresenca = new JTextField();
        txtQtdPresenca.setBounds(110, 60, 180, 20);
        txtQtdPresenca.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                conferirValores(e);
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
        painel.add(txtQtdPresenca);

        lblTotalAulas = new JLabel("Total Aulas:");
        lblTotalAulas.setBounds(40, 95, 300, 20);
        painel.add(lblTotalAulas);

        txtTotalAulas = new JTextField();
        txtTotalAulas.setBounds(110, 95, 180, 20);
        txtTotalAulas.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                conferirValores(e);
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
        painel.add(txtTotalAulas);

        lblNota1 = new JLabel("Nota1:");
        lblNota1.setBounds(40, 130, 300, 20);
        painel.add(lblNota1);

        txtNota1 = new JTextField();
        txtNota1.setBounds(90, 130, 200, 20);
        txtNota1.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                conferirValores(e);
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
        painel.add(txtNota1);

        lblNota2 = new JLabel("Nota2:");
        lblNota2.setBounds(40, 165, 300, 20);
        painel.add(lblNota2);

        txtNota2 = new JTextField();
        txtNota2.setBounds(90, 165, 200, 20);
        txtNota2.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                conferirValores(e);
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
        painel.add(txtNota2);

        lblNota3 = new JLabel("Nota3:");
        lblNota3.setBounds(40, 200, 300, 20);
        painel.add(lblNota3);

        txtNota3 = new JTextField();
        txtNota3.setBounds(90, 200, 200, 20);
        txtNota3.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                conferirValores(e);
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
        painel.add(txtNota3);

        btnCalcularSituacao = new JButton("Calcular situação");
        btnCalcularSituacao.setBounds(110, 250, 150, 20);
        btnCalcularSituacao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float presenca = Float.parseFloat(txtQtdPresenca.getText());
                float aulas = Float.parseFloat(txtTotalAulas.getText());
                float n1 = Float.parseFloat(txtNota1.getText());
                float n2 = Float.parseFloat(txtNota2.getText());

                if (cboNotas.getSelectedIndex() == 1) {

                    if (txtQtdPresenca.getText().length() > 0
                            && txtTotalAulas.getText().length() > 0
                            && txtNota1.getText().length() > 0
                            && txtNota2.getText().length() > 0) {
                        Avaliacao objAval = new Avaliacao();
                        objAval.calcularMedia(n1, n2);
                        objAval.calcularPercentualPresenca(aulas, presenca);
                        System.out.println(objAval.getMediaFinal());
                        System.out.println(objAval.getPercentualPresenca());
                        if (objAval.getMediaFinal() >= 6 && objAval.getPercentualPresenca() >= 0.75) {
                            JOptionPane.showMessageDialog(null, "APROVADO!");
                        } else {
                            JOptionPane.showMessageDialog(null, "REPROVADO!");
                        }
                    }
                } else {
                    if (cboNotas.getSelectedIndex() == 2) {
                        txtNota3.setEnabled(true);
                        float n3 = Float.parseFloat(txtNota3.getText());
                        if (txtQtdPresenca.getText().length() > 0
                                && txtTotalAulas.getText().length() > 0
                                && txtNota1.getText().length() > 0
                                && txtNota2.getText().length() > 0
                                && txtNota3.getText().length() > 0) {
                            Avaliacao objAval = new Avaliacao();
                            objAval.calcularMedia(n1, n2, n3);
                            objAval.calcularPercentualPresenca(aulas, presenca);
                            System.out.println(objAval.getMediaFinal());
                            System.out.println(objAval.getPercentualPresenca());
                            if (objAval.getMediaFinal() >= 6 && objAval.getPercentualPresenca() >= 0.75) {
                                JOptionPane.showMessageDialog(null, "APROVADO!");
                            } else {
                                JOptionPane.showMessageDialog(null, "REPROVADO!");
                            }
                        }

                    }

                }

            }
        }
        );
        painel.add(btnCalcularSituacao);

        form.setVisible(true);
    }

    void conferirValores(KeyEvent e) {
        String valoresPermitidos = "0123456789.";
        if (!valoresPermitidos.contains(String.valueOf(e.getKeyChar()))) {
            e.consume();
        }
    }

}
