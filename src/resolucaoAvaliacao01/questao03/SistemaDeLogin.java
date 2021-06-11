/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resolucaoAvaliacao01.questao03;

import java.util.Scanner;

/**
 *
 * @author boemo
 */
public class SistemaDeLogin {

    public static void main(String[] args) {
        String[][] guardaValores = new String[5][2];
        guardaValores[0][0] = "ana";
        guardaValores[0][1] = "123";
        guardaValores[1][0] = "joao";
        guardaValores[1][1] = "1234";
        guardaValores[2][0] = "alfredo";
        guardaValores[2][1] = "12345";
        guardaValores[3][0] = "marcia";
        guardaValores[3][1] = "123456";
        guardaValores[4][0] = "daniel";
        guardaValores[4][1] = "1234567";
        String usuario;
        String senha;
        Scanner input = new Scanner(System.in);
        login log = new login();

        System.out.println("Login : ");
        usuario = input.next();

        System.out.println("Senha : ");
        senha = input.next();

        if (log.verificaSenha(senha) && log.verificaUsuario(usuario)) {
            if (log.VerificaDadosDeLogin(guardaValores, usuario, senha)) {
                System.out.println("Usuário logado com sucesso!");

            } else {
                System.out.println("Problemas ao tentar logar no sistema!");
            }
        }
    }

}
