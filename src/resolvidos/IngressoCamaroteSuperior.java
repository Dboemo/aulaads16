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
public class IngressoCamaroteSuperior extends IngressoVIP {
    double valorAdCamaroteSup;
    public IngressoCamaroteSuperior(double valor,double valoradCamaroteSup){
        super(valor);
        this.valor+=valoradCamaroteSup;
    }
    
    
}
