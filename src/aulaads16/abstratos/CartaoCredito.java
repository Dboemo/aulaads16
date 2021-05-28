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
public class CartaoCredito extends FormasDePagamento {
private String nome;
private int CVV;
private String numero;

    public CartaoCredito(String nome, int CVV, String numero) {
        this.nome = nome;
        this.CVV = CVV;
        this.numero = numero;
    }

    @Override
    public boolean VerificaPreenchimento() {
       //algoritmo 
       
        return false;
    }
    
    private String verificaBandeira(){
        String bandeira="";
    if (numero.equals("820098741")){
    bandeira = "Visa";
    }
    return bandeira;
    }
    
}
