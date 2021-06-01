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
public class ImovelVelho extends Imovel{
private double valordesconto;   
    public ImovelVelho(double valordesconto) {
        this.valordesconto = valordesconto;
        this.setPreco(this.getPreco()-this.valordesconto);
    }
   public void mostraValorImovelVelho(){
       System.out.println("Preço final :"+getPreco());
   }
    public double getValordesconto() {
        return valordesconto;
    }

    public void setValordesconto(double valordesconto) {
        this.valordesconto = valordesconto;
    }
    
    
    
}
