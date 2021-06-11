/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resolucaoAvaliacao01.questao03;

/**
 *
 * @author boemo
 */
public class login {

    private String usuario;
    private String senha;

    public login() {
    }

    public boolean verificaUsuario(String usuario) {
        if(!usuario.equals(null))
            return true;
        else
            return false;
    }

    public boolean verificaSenha(String senha) {
                if(!senha.equals(null))
            return true;
        else
            return false;
    }

    public boolean VerificaDadosDeLogin(String[][] listaUsuarios, String ValorUsuario, String ValorSenha) {
           Boolean teste = false;

        for (int i = 0; i < 5; i++) {
            
                if ((listaUsuarios[i][0].equals(ValorUsuario)) && (listaUsuarios[i][1].equals(ValorSenha))){ {
                    teste = true;
                    
                }
                
            }        }
        return teste;
    
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
