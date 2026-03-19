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
public class Heranca6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProdutoEletronico pE = new ProdutoEletronico();
        pE.setNome("forno");
        System.out.println("nome: " + pE.getNome());
        pE.setPreco(500.00);
        System.out.println("preço: " + pE.getPreco());
        pE.setVoltagem(888);
        System.out.println("voltagem: " + pE.getVoltagem());
        System.out.println("--");
        ProdutoAlimenticio pA = new ProdutoAlimenticio();
        pA.setNome("maçã");
        System.out.println("nome: " + pA.getNome());
        pA.setPreco(2.50);
        System.out.println("preço: " + pA.getPreco());
        pA.setDataValidade("09 fevereiro 2026 - 20 fevereiro 2026");
        System.out.println("data de validade: " + pA.getDataValidade());
    }
    
}
