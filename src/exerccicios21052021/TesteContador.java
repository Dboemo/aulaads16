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
public class TesteContador {
    
    public static void main(String[] args) {
        Contador C1=new Contador();
        for (int i=0;i<10;i++){
            C1.incrementador();
            System.out.println("Valor : "+C1.getCont());
        }
    }
    
}
