/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca9;

/**
 *
 * @author aluno.saolucas
 */
public class Heranca9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aviao aviao = new Aviao(180, 850.0, "LATAM");
        Onibus onibus = new Onibus(50, 80.0, 123);

        
        System.out.println("=== Avião ===");
        System.out.println("Capacidade: " + aviao.getCapacidade());
        System.out.println("Velocidade: " + aviao.getVelocidade());
        System.out.println("Companhia Aérea: " + aviao.getCompanhiaAerea());

        
        System.out.println("\n=== Ônibus ===");
        System.out.println("Capacidade: " + onibus.getCapacidade());
        System.out.println("Velocidade: " + onibus.getVelocidade());
        System.out.println("Número da Linha: " + onibus.getNumeroLinha());
    }
}
    
    

