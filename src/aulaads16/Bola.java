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
public class Bola {
    private String cor;
    private int tamanho;
    private boolean cheia;
    
    void encher(){
    cheia=true;}
    void esvaziar(){
    cheia=false;
    }
    void pintar(String cordabola){
    cor=cordabola;
    }
    void definirTamanho(int tam){
    tamanho=tam;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void setCheia(boolean cheia) {
        this.cheia = cheia;
    }

    public String getCor() {
        return cor;
    }

    public int getTamanho() {
        return tamanho;
    }

    public boolean isCheia() {
        return cheia;
    }

    
    
}
