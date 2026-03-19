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
class Onibus extends Transporte {
    private int numeroLinha;

    public Onibus(int capacidade, double velocidade, int numeroLinha) {
        super(capacidade, velocidade);
        this.numeroLinha = numeroLinha;
    }

    public int getNumeroLinha() {
        return numeroLinha;
    }

    public void setNumeroLinha(int numeroLinha) {
        this.numeroLinha = numeroLinha;
    }
}
