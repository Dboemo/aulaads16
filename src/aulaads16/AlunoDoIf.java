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
public class AlunoDoIf extends Usuario{
    public AlunoDoIf(){
    }
    public AlunoDoIf(String matricula) {
        this.matricula = matricula;
    }

    public AlunoDoIf(String matricula, String nome, String CPF) {
        super(nome, CPF);
        this.matricula = matricula;
    }
  
    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
}
