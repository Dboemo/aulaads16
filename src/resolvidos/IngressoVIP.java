/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resolvidos;

/**
 *
 * @author boemo
 */
public class IngressoVIP extends IngressoGeral {
    double valorAdiciconal;

    public IngressoVIP(double valor) {
        this.valorAdiciconal=valor;
        this.valor+=this.valorAdiciconal;
    }
    
    public double retornaValorIngressoVIP( ) {
       return this.valor+this.valorAdiciconal;
    }
    
}
