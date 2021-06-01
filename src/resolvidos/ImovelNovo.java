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
public class ImovelNovo extends Imovel{
    double valorAdicional;

    public ImovelNovo(double valorAdicional) {
        this.valorAdicional = valorAdicional;
        this.setPreco(this.getPreco()+this.valorAdicional);
    }
   public void mostraValorImovelNovo(){
       System.out.println("Preço final :"+getPreco());
   }
    
    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
    
}
