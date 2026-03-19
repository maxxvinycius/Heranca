/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca7;

/**
 *
 * @author aluno.saolucas
 */
public class ContaPoupanca extends contaBancaria{
    private double taxaRendimento;
    
    public double getTaxaRendimento(){
        return taxaRendimento;
    }
    public void setTaxaRendimento(double taxaRendimento){
        this.taxaRendimento = taxaRendimento;
    }
}
