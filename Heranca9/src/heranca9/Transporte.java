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
public class Transporte {
    private int capacidade;
    private double velocidade;

    
    public Transporte(int capacidade, double velocidade) {
        this.capacidade = capacidade;
        this.velocidade = velocidade;
    }

    
    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
}
}