/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumeracoes;

/**
 *
 * @author boemo
 */
public enum ContasBancarias {
    Pessoa_fisica(1),pessoa_juridica(2);
 
    public int Contas;
    ContasBancarias(int valor) {
        this.Contas = valor;
    }
}
