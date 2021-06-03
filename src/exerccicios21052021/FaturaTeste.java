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
public class FaturaTeste {
    public static void main(String[] args) {
        fatura F01 = new fatura();
        F01.setNumero("FAT0001");
        F01.setDescrição("Compra de pneus");
        F01.setPrecoPorItem(350.00);
        F01.setQuantidadeCompradaDeUmItem(4);
        System.out.println("Total da fatura :"+F01.getTotalFatura());
        F01.setPrecoPorItem(-1.0);
        System.out.println("Total da fatura :"+F01.getTotalFatura());
        
    }
}
