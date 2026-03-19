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
public class contaBancaria {
    private String numeroConta;
    private double saldo;
    
    public String getNumeroConta(){
        return numeroConta;
        
    }
    public void setNumeroConta(String numeroConta){
        this.numeroConta = numeroConta;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
}
