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
class Aviao extends Transporte {
    private String companhiaAerea;

    public Aviao(int capacidade, double velocidade, String companhiaAerea) {
        super(capacidade, velocidade);
        this.companhiaAerea = companhiaAerea;
    }

    public String getCompanhiaAerea() {
        return companhiaAerea;
    }

    public void setCompanhiaAerea(String companhiaAerea) {
        this.companhiaAerea = companhiaAerea;
    }
}
