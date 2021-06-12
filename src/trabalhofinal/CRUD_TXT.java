/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhofinal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author boemo
 * CREAT
 * READ
 * UPDATE
 * DELETE
 */


public class CRUD_TXT {

    public static void main(String[] args) {
        Scanner ValorDeEntrada = new Scanner(System.in);
        String alternativa, Confirma = "s";

        while (Confirma.equalsIgnoreCase("s")) {
            System.out.println("\t\t Sistema de cadastro de funcionários\n\n");

            System.out.println("1 ===> INSERIR NOVO FUNCIONARIO ");
            System.out.println("2 ===> LISTAR TODOS OS FUNCIONÁRIOS ");
            System.out.println("3 ===> EXCLUIR UM FUNCIONÁRIO ");
            System.out.println("4 ===> PROCURAR UM FUNCIONÁRIO ");
            System.out.println("5 ===> ATUALIZAR DADOS DE UM FUNCIONARIO ");

            System.out.print("\n\n");
            System.out.println("SELECIONE UMA OPÇÃO: ");
            alternativa = ValorDeEntrada.nextLine();

            if (alternativa.equals("1")) {
                metodoInsere();
            } else if (alternativa.equals("2")) {
                metodoListarTodos();
            } else if (alternativa.equals("3")) {
                metodoExcluiporCod();
            } else if (alternativa.equals("4")) {
                metodoProcuraPorCod();
            } else if (alternativa.equals("5")) {
                metodoAlteraPorCod();
            }

            System.out.println("DESEJA CONTINUAR? S/N");
            Confirma = ValorDeEntrada.nextLine();

        }

    }

    public static void metodoInsere() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("base_de_dados.txt", true));
            Scanner ValorDeEntrada = new Scanner(System.in);

            String codigo, nome, idade, endereco;

            System.out.print("DIGITE CÓDIGO DO FUNCIONÁRIO____: ");
            codigo = ValorDeEntrada.nextLine();
            System.out.print("DIGITE O NOME DO FUNCIONÁRIO____: ");
            nome = ValorDeEntrada.nextLine();
            System.out.print("DIGITE A IDADE DO FUNCIONÁRIO___: ");
            idade = ValorDeEntrada.nextLine();
            System.out.print("DIGITE O ENDEREÇO DO FUNCIONÁRIO: ");
            endereco = ValorDeEntrada.nextLine();

            bw.write(codigo + "," + nome + "," + idade + "," + endereco);
            bw.flush();
            bw.newLine();
            bw.close();
        } catch (IOException ex) {
            System.out.println("Erro metodoInsere() " + ex.getMessage());
        }
    }

    public static void metodoListarTodos() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("base_de_dados.txt"));
            String linhaGravada;
            System.out.println(" ------------------------------------------------------------- ");
            System.out.println(" 	                    LISTAGEM DOS FUNCIONARIOS");
            System.out.println(" ------------------------------------------------------------- ");

            while ((linhaGravada = br.readLine()) != null) {

                StringTokenizer st = new StringTokenizer(linhaGravada, ",");

                System.out.println("Código : " + st.nextToken() + "\nNome : " + st.nextToken() + "\nIdade : " + st.nextToken() + "\nEndereço : " + st.nextToken() + "\n");
                System.out.println(" ------------------------------------------------------------- ");
            }
            br.close();
        } catch (IOException ex) {
            System.out.println("Erro metodoListarTodos() " + ex.getMessage());
        }
    }

    public static void metodoExcluiporCod() {
        Scanner ValorDeEntrada = new Scanner(System.in);
        String codigo, linhaGravada;
        try {
            File tempBD = new File("base_de_dados_temp.txt");
            File BD = new File("base_de_dados.txt");

            BufferedReader br = new BufferedReader(new FileReader(BD));
            BufferedWriter bw = new BufferedWriter(new FileWriter(tempBD));

            System.out.println("\t\t EXCLUSÃO DOS DADOS DO FUNCIONÁRIO \n");

            System.out.println("DIGITE O CÓDIGO DO FUNCIONÁRIO : ");
            codigo = ValorDeEntrada.nextLine();

            while ((linhaGravada = br.readLine()) != null) {

                if (linhaGravada.contains(codigo)) {
                    continue;
                }

                bw.write(linhaGravada);
                bw.flush();
                bw.newLine();

            }

            br.close();
            bw.close();

            BD.delete();

            tempBD.renameTo(BD);
        } catch (IOException ex) {
            System.out.println("Erro metodoExcluiporCod() " + ex.getMessage());
        }

    }

    public static void metodoProcuraPorCod() {
        String codigo, linhaGravada;
        Scanner ValorDeEntrada = new Scanner(System.in);
        try {
            BufferedReader br = new BufferedReader(new FileReader("base_de_dados.txt"));

            System.out.println("\t\t PROCURAR UM FUNCIONÁRIO\n");

            System.out.println("DIGITE O CÓDIGO DO FUNCIONÁRIO : ");
            codigo = ValorDeEntrada.nextLine();

            System.out.println(" ------------------------------------------------------------- ");
            System.out.println(" 	                    LISTAGEM DOS DADOS DO  FUNCIONÁRIO");
            System.out.println(" ------------------------------------------------------------- ");

            while ((linhaGravada = br.readLine()) != null) {

                StringTokenizer st = new StringTokenizer(linhaGravada, ",");
                if (linhaGravada.contains(codigo)) {
                    System.out.println("Código : " + st.nextToken() + "\nNome : " + st.nextToken() + "\nIdade : " + st.nextToken() + "\nEndereço : " + st.nextToken() + "\n");
                    System.out.println(" ------------------------------------------------------------- ");
                }

            }
            br.close();
        } catch (IOException ex) {
            System.out.println("Erro metodoProcuraPorCod() " + ex.getMessage());
        }

    }

    public static void metodoAlteraPorCod() {
        String novoNome, novaIdade, novoEndereco, linhaGravada, codigo, linhagravada2;
        try {
            File bd = new File("base_de_dados.txt");
            File tempbd = new File("base_de_dados_temp.txt");

            BufferedReader br = new BufferedReader(new FileReader(bd));
            BufferedWriter bw = new BufferedWriter(new FileWriter(tempbd));

            Scanner ValorDeEntrada = new Scanner(System.in);

            System.out.println("\t\t ATUALIZAR OS DADOS DO FUNCIONÁRIO\n\n");
            /**
             * *
             */
            System.out.println("DIGITE O CÓDIGO DO FUNCIONÁRIO : ");
            codigo = ValorDeEntrada.nextLine();
            System.out.println(" ------------------------------------------------------------- ");
            System.out.println(" 	                    LISTAGEM DOS DADOS DO  FUNCIONÁRIO");
            System.out.println(" ------------------------------------------------------------- ");
            while ((linhaGravada = br.readLine()) != null) {

                StringTokenizer st = new StringTokenizer(linhaGravada, ",");
                if (linhaGravada.contains(codigo)) {
                    System.out.println("Código : " + st.nextToken() + "\nNome : " + st.nextToken() + "\nIdade : " + st.nextToken() + "\nEndereço : " + st.nextToken() + "\n");
                    System.out.println(" ------------------------------------------------------------- ");
                }

            }
            br.close();

            System.out.println("DIGITE O NOVO NOME     : ");
            novoNome = ValorDeEntrada.nextLine();
            System.out.println("DIGITE A NOVA IDADE    : ");
            novaIdade = ValorDeEntrada.nextLine();
            System.out.println("DIGITE O NOVO ENDEREÇO : ");
            novoEndereco = ValorDeEntrada.nextLine();

            BufferedReader br2 = new BufferedReader(new FileReader(bd));

            while ((linhagravada2 = br2.readLine()) != null) {
                if (linhagravada2.contains(codigo)) {
                    bw.write(codigo + "," + novoNome + "," + novaIdade + "," + novoEndereco);
                } else {

                    bw.write(linhagravada2);
                }
                bw.flush();
                bw.newLine();
            }

            bw.close();
            br2.close();
            bd.delete();
            boolean successo = tempbd.renameTo(bd);
            if (successo) {
                System.out.println("Alterado com sucesso!");
            } else {
                System.out.println("Problema ao tentar alterar!");
            }
        } catch (IOException ex) {
            System.out.println("Erro metodoProcuraPorCod() " + ex.getMessage());
        }

    }
}
