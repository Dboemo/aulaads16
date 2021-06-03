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
public class DataEscolar {
    int dia;
    int mes;
    int ano;

    public DataEscolar() {
    }
     public DataEscolar(int dia,int mes, int ano) {
         this.setDia(dia);
         this.setMes(mes);
         this.setAno(ano);
    }   

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if ((dia>1)&&(dia<31))        
        this.dia = dia;
        else
        this.dia=0;    
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
                if ((mes>=1)&&(mes<=12))        
        this.mes = mes;
        else
        this.mes=0;          
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
}
