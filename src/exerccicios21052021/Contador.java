/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerccicios21052021;

/**
 *
 * @author boemo
 */
public class Contador {

    private int cont;

    public Contador() {
        this.cont = 0;
    }

    public Contador(int cont) {
        this.cont = cont;
    }

    public void zera() {
        this.cont = 0;
    }

    public int getCont() {
        return cont;
    }
    //este método não é pedido 
    //mas para ter a classe completa ele é necessário

    public void incrementador() {
        this.cont++;
    }

}
