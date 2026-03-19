/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca2;

/**
 *
 * @author aluno.saolucas
 */
public class Heranca2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("max");
        System.out.println("nome:" + funcionario.getNome());
        funcionario.setSalario(20000.00);
        System.out.println("salario: " + funcionario.getSalario());
        Gerente gerente = new Gerente();
        gerente.setDepartamento("administrativo");
        System.out.println("departamento: " + gerente.getDepartamento());
    }
    
}
