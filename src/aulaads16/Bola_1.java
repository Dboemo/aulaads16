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
public class Bola_1 {
    String cor;
    int tamanho;
    boolean cheia;
    public void encher(){
    this.cheia=true;
    } 
    public void esvaziar(){
    this.cheia=false;
    } 
    public void pintar(String cor){
    this.cor=cor;
    }
    public void definirTamanho(int novoTamanho){
    this.tamanho=novoTamanho;
    }
    
}
