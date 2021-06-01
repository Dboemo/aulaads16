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
public class OperarioDaEmpresa extends EmpregadoDaEmpresa {
    Pessoa DadosPessoais=new Pessoa();
    double ValorProducao;
    double comissao;
    @Override
    public void CalcularSalario(){
    this.setSalario(this.getSalario()+this.comissao);
    }

    public Pessoa getDadosPessoais() {
        return DadosPessoais;
    }

    public void setDadosPessoais(Pessoa DadosPessoais) {
        this.DadosPessoais = DadosPessoais;
    }
    
    
}
