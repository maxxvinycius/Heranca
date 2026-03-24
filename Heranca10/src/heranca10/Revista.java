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
public class Revista extends ItemBiblioteca{
    private String edicao;
    
    public String getEdicao(){
        return edicao;
    }
    public void setEdicao(String edicao){
        this.edicao = edicao;
    }
}
