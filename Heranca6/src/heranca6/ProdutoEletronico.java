/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca6;

/**
 *
 * @author aluno.saolucas
 */
public class ProdutoEletronico extends Produto{
    private int voltagem;
    
    public int getVoltagem(){
        return voltagem;
    }
    public void setVoltagem(int voltagem){
        this.voltagem = voltagem;
    }
}
