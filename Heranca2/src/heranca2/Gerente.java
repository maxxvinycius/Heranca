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
public class Gerente extends Funcionario {
    private String departamento;
    
    public String getDepartamento(){
        return departamento;
    }
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
}
