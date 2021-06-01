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
public class FuncionarioDaEmpresa {
    private String nomeDoFuncionario;
    private String matricula; 
    private double salario;
    private String dataDeAdmissao;
    private String CPF;
    
    public void receberAumentoSalarial(double valor ){
        setSalario(getSalario()+valor);
    }
     public double calcGanhoBrutoAnual(){
     return getSalario()*12;
     }    
     public double calculeIRPFRecolhido(){
     return (getSalario()*0.17)*12;
         
     }
     
     public double calcValorLiquidoMensal(){
     double salarioTemporario;
    salarioTemporario=getSalario();
//desconto 10% inss
             salarioTemporario=salarioTemporario*0.9;
     //teste
     if (salarioTemporario>3000){
         salarioTemporario=salarioTemporario*0.83;
     }
         
         return salarioTemporario;
     }
     public double calcValorLiquidoAnual(){
     return calcValorLiquidoMensal()*12;
      }
     
    public String getNomeDoFuncionario() {
        return nomeDoFuncionario;
    }

    public void setNomeDoFuncionario(String nomeDoFuncionario) {
        this.nomeDoFuncionario = nomeDoFuncionario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataDeAdmissao() {
        return dataDeAdmissao;
    }

    public void setDataDeAdmissao(String dataDeAdmissao) {
        this.dataDeAdmissao = dataDeAdmissao;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
   
}
