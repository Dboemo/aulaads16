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
public class testeOperario {
    public static void main(String[] args) {
        OperarioDaEmpresa oper01=new OperarioDaEmpresa();
        Pessoa dadosOper01=new Pessoa();
        dadosOper01.setNome("Dagoberto");
        dadosOper01.setCPF("666666666");
        oper01.setDadosPessoais(dadosOper01);
        
    }
}
