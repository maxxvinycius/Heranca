/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca4;

/**
 *
 * @author aluno.saolucas
 */
public class Heranca4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setModelo("civic");
        System.out.println("modelo: " + carro.getModelo());
        carro.setMarca("honda");
        System.out.println("marca: " + carro.getMarca());
        carro.setAno(2010);
        System.out.println("ano: " + carro.getAno());
        carro.setNumeroPortas(4);
        System.out.println("numero de portas: " + carro.getNumeroPortas());
        System.out.println("---");
        Moto moto = new Moto();
        moto.setModelo("cb500");
        System.out.println("modelo: " + moto.getModelo());
        moto.setMarca("honda");
        System.out.println("marca: " + moto.getMarca());
        moto.setAno(2008);
        System.out.println("ano: " + moto.getAno());
        moto.setCilindrada(8);
        System.out.println("cilindros: " + moto.getCilindrada());
    }
    
}
