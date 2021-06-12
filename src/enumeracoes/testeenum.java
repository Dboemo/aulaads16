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
public class testeenum {

    public static void main(String[] args) {
        EstadoServidor estado = EstadoServidor.INATIVO;

        if (estado.equals(EstadoServidor.ATIVO)) {
            System.out.println("Está ativo");
        } else {
            System.out.println("Está inativo");
        }
    }
}
