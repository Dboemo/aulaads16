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
public class Pessoa {
    String nome;
    int Idade;
    Double altura;

    void falar (String texto){
        System.out.println(texto+"!!!");
    }
    void falar (String texto,boolean flag){
        if (flag==true)
    System.out.println(texto+"!!!"+Idade);
        else 
     System.out.println(texto+"!!!");       
    }
  
 
}
