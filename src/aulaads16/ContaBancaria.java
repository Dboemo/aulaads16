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
public class ContaBancaria {

    private int numero;
    private String nomeTitular;
    private double saldo;
    private double limite;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    private String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void escreNome() {
        System.out.println("Nome Correntista : " + getNomeTitular());
    }

    public void deposita(double valor) {
        saldo = saldo + valor;
        descontaTarifa();
    }

    public void saca(double valor) {
        saldo = saldo -  valor;
        descontaTarifa();
    }

    private void descontaTarifa() {
        saldo =saldo - 0.1;
    }
}
