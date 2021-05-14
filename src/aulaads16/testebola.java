/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaads16;

/**
 *
 * @author boemo
 */
public class testebola {

    public static void main(String[] args) {
        Bola bola01 = new Bola();
        //System.out.println(bola01.isCheia());
        bola01.encher();
        System.out.println(bola01.isCheia());
        bola01.pintar("azul");
        bola01.definirTamanho(10);

    }
}
