/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca3;

/**
 *
 * @author aluno.saolucas
 */
public class Heranca3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("max");
        System.out.println("nome: " + cachorro.getNome());
        cachorro.setIdade(5);
        System.out.println("idade: " + cachorro.getIdade());
        cachorro.emitirSom();
        System.out.println("---");
        Gato gato = new Gato();
        gato.setNome("tom");
        System.out.println("nome: " + gato.getNome());
        gato.setIdade(9);
        System.out.println("idade: " + gato.getIdade());
        gato.emitirSom();
    }
    
}
