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
public class IngressoCamaroteInferior extends IngressoVIP {
    private String localizacao;
    public IngressoCamaroteInferior(double valorAdicionalVIP) {
        super(valorAdicionalVIP);
        
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    public void mostraLocalizacao(){
        System.out.println("Localização : "+getLocalizacao());
    }
    
    
}
