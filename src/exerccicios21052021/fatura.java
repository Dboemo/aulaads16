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
public class fatura {

    private String numero;
    private String descrição;
    private int quantidadeCompradaDeUmItem;
    private double precoPorItem;

    public fatura() {
    }

    public double getTotalFatura() {
        double retorno;
        double precoaux = this.precoPorItem;

        if (precoaux < 0) {
            precoaux = 0.0;
        }

        retorno = this.quantidadeCompradaDeUmItem * precoaux;
        if (retorno <= 0) {
            return 0;
        }else 
        return retorno;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public int getQuantidadeCompradaDeUmItem() {
        return quantidadeCompradaDeUmItem;
    }

    public void setQuantidadeCompradaDeUmItem(int quantidadeCompradaDeUmItem) {
        this.quantidadeCompradaDeUmItem = quantidadeCompradaDeUmItem;
    }

    public double getPrecoPorItem() {
        return precoPorItem;
    }

    public void setPrecoPorItem(double precoPorItem) {
        this.precoPorItem = precoPorItem;
    }

}
