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
public class Livro {

    private String titulo;
    private int tdPaginas;
    private int paginasLidas;

    Livro() {
    }

    Livro(String nome, int qtdPaginas) {
        this.titulo = nome;
        this.tdPaginas = qtdPaginas;

    }

    public void verificarProgresso(){
    double porcentagem = paginasLidas * 100 / tdPaginas;
        System.out.println("Você já leu "+porcentagem+" por cento do livro");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTdPaginas() {
        return tdPaginas;
    }

    public void setTdPaginas(int tdPaginas) {
        this.tdPaginas = tdPaginas;
    }

    public int getPaginasLidas() {
        return paginasLidas;
    }

    public void setPaginasLidas(int paginasLidas) {
        this.paginasLidas = paginasLidas;
    }



}
