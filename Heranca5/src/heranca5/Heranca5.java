/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca5;

/**
 *
 * @author aluno.saolucas
 */
public class Heranca5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("max");
        System.out.println("nome:"+aluno.getNome());
        aluno.setCpf("05557940008");
        System.out.println("cpf:"+aluno.getCpf());
        aluno.setMatricula("ma923993");
        System.out.println("matricula:"+aluno.getMatricula());
        System.out.println("---");
        Professor professor = new Professor();
        professor.setNome("girafales");
        System.out.println("nome:"+professor.getNome());
        professor.setCpf("57866488498");
        System.out.println("cpf:"+professor.getCpf());
        professor.setDisciplina("historia");
        System.out.println("disciplina:"+professor.getDisciplina());
    }
    
}
