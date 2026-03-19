/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca8;

/**
 *
 * @author aluno.saolucas
 */
public class Heranca8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Celular c = new Celular();
        c.setModelo("A10");
        System.out.println("modelo:"+c.getModelo());
        c.setMarca("samsung");
        System.out.println("marca:"+c.getMarca());
        c.setMemoria(4);
        System.out.println("memoria:"+c.getMemoria());
        System.out.println("---");
        Notebook n = new Notebook();
        n.setMarca("lenovo");
        System.out.println("marca:"+n.getMarca());
        n.setModelo("ideapad");
        System.out.println("modelo:"+n.getModelo());
        n.setProcessador("i7 - 12 geraçao");
        System.out.println("processador:"+n.getProcessador());
    }
    
}
