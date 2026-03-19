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
public class Heranca7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        contaCorrente cC = new contaCorrente();
        cC.setSaldo(1000.00);
        System.out.println("saldo:"+cC.getSaldo());
        cC.setNumeroConta("102-0");
        System.out.println("numero da conta:"+cC.getNumeroConta());
        cC.setLimite(10000.00);
        System.out.println("limite:"+cC.getLimite());
        System.out.println("---");
        ContaPoupanca cP = new ContaPoupanca();
        cP.setSaldo(9000000.00);
        System.out.println("saldo:"+cP.getSaldo());
        cP.setTaxaRendimento(1000000.00);
        System.out.println("taxa de rendimento:"+cP.getTaxaRendimento());
        cP.setNumeroConta("002-8");
        System.out.println("numero da conta:"+cP.getNumeroConta());
    }
    
}
