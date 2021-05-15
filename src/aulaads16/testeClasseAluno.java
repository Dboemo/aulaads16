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
public class testeClasseAluno {
    public static void main(String[] args) {
        Aluno aluno01= new Aluno();
        aluno01.setIdade(10);
        aluno01.setNome("Angelo");
        String[] mat = new String[2];
        mat[0]="Portugues";
        mat[1]="Matematica";
        aluno01.setMateriasFeitas(mat);
        for(int i=0;i<2;i++)
        System.out.println(aluno01.getMateriasFeitas()[i]);
        
        
    }
}
