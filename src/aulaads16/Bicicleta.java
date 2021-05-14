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
public class Bicicleta {

    int velocidade = 0;
    int marcha = 1;

    void mudarMarcha1(int novoValor) {
        marcha = novoValor;
    }

    void aumentarVelocidade(int incremento) {
        velocidade = velocidade + incremento;
    }

    void aplicarFreios(int decremento) {
        velocidade = velocidade - decremento;
    }
}
