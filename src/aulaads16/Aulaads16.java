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
public class Aulaads16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Pessoa  cliente = new Pessoa();
     cliente.nome="Daniel Boemo";
     cliente.altura=1.84;
     cliente.Idade=50;
     cliente.falar("ola pessoal");
     Pessoa cliente02 = new Pessoa();
     cliente02.nome="Lorena";
     cliente02.altura=1.10;
     cliente02.Idade=4;
     cliente02.falar("ola pessoal",true); 

    
        
    }
    
}
