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
public class Aluno {

    private String nome;
    private int idade;
    private  String[] materiasFeitas;

    public String[] getMateriasFeitas() {
        return materiasFeitas;
    }

    public void setMateriasFeitas(String[] materiasFeitas) {
        this.materiasFeitas = materiasFeitas;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
}
