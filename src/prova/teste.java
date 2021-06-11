/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova;

/**
 *
 * @author boemo
 */
public class teste {
    public static void main(String[] args) {
        Funcionario pessoa01 = new Funcionario();
       // pessoa01.mostra();
        Gerente ger01 = new Gerente();
        ger01.nome="Fulano";
        ger01.CPF="6956595959";
        ger01.Cargo="Gerente de vendas";
        ger01.mostra();
        
    }
}
