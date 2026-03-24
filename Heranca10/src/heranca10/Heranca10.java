/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca10;

/**
 *
 * @author maxvi
 */
public class Heranca10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Livro l = new Livro();
        l.setAutor("max");
        System.out.println("autor:"+l.getAutor());
        l.setTitulo("one piece");
        System.out.println("titulo:"+l.getTitulo());
        l.setAnoPublicacao(2026);
        System.out.println("ano da publicaçao:"+l.getAnoPublicacao());
        System.out.println("--");
        Revista r = new Revista();
        r.setTitulo("barba negra");
        System.out.println("titulo:"+r.getTitulo());
        r.setEdicao(" barba negra e a Pedra Filosofal - 1ª Edição "+r.getEdicao());
        r.setAnoPublicacao(2009);
        System.out.println("ano da publicaçao"+r.getAnoPublicacao());
    }
    
}
