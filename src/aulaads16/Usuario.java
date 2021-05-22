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
public class Usuario {
    private String nome;
    private String CPF;
    private String fone;
    private String RG;
public Usuario (){}

public Usuario(String nome, String CPF ){
this.nome=nome;
this.CPF =CPF;
}

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        
       
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        
        this.CPF = CPF;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }
    public boolean verificaCPF(String CPF){
    if (CPF.equals("00000000000"))
        return true;
        else
        return false;    
    }
}
