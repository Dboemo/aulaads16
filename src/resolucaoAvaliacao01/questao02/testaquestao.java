/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resolucaoAvaliacao01.questao02;

/**
 *
 * @author boemo
 */
public class testaquestao {
    public static void main(String[] args) {
        Motor motorGol=new Motor(4,100);
        CarroPasseio carro01= new CarroPasseio("Prata","Gol",1500,220,motorGol,50000);
        carro01.MostrarDados();
        Caminhao mercedez = new Caminhao();
        mercedez.MostrarDados();
    }
}
