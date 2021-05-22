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
public class testAlunodoif {
    public static void main(String[] args) {
        AlunoDoIf aluno01=new AlunoDoIf();
        aluno01.setNome("João");
        aluno01.setMatricula("202102058");
        aluno01.setCPF("00000000000");
        if(aluno01.verificaCPF(aluno01.getCPF()))
            System.out.println("ok");
        else 
            System.out.println("Erro de cpf");
        
    }
    
}
