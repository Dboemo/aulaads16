/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaads16.abstratos;

/**
 *
 * @author boemo
 */
public class Gato extends Animal {

    public Gato() {
        this.setNome("mimi");
        this.setNumeroPatas(4);
    }

    @Override
    public void som() {
        System.out.println("O " + this.getNome() 
                + " que tem " + this.getNumeroPatas() + " patas, faz MIAU");
    }
    
}
