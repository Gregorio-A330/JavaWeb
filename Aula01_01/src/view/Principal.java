
package view;

import negocio.Aluno;
import negocio.Professor;

/**
 *
 * @author dreis
 */
public class Principal {

    public static void main(String[] args) {
        // declara e instancia objeto da classe Aluno
        Aluno objAluno = new Aluno("Victor");
        // executa método da classe Aluno
        System.out.println(objAluno.saudar());

        // declara e instancia objeto da classe Professor
        Professor objProfessor = new Professor("Rubens Lara");
        // executa método da classe Professor
        System.out.println(objProfessor.saudar());
        
        Professor objProf = new Professor("Lara");
        // executa método "sobrecarregado" 
        System.out.println(objProf.saudar("Dr."));
    }
}
