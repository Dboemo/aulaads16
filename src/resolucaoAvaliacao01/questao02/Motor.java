/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resolucaoAvaliacao01.questao02;

/**
 *
 * @author boemo
 */
public class Motor {

    private int NumeroCilindros;
    private int PotenciaHP;

    public Motor() {
        this.NumeroCilindros = 0;
        this.PotenciaHP = 0;
    }

    public Motor(int NumeroCilindros, int PotenciaHP) {
        this.NumeroCilindros = NumeroCilindros;
        this.PotenciaHP = PotenciaHP;
    }

    public int getNumeroCilindros() {
        return NumeroCilindros;
    }

    public void setNumeroCilindros(int NumeroCilindros) {
        this.NumeroCilindros = NumeroCilindros;
    }

    public int getPotenciaHP() {
        return PotenciaHP;
    }

    public void setPotenciaHP(int PotenciaHP) {
        this.PotenciaHP = PotenciaHP;
    }
 public void MostrarDados() {

        System.out.println(
                 "\nPotência do motor do veículo : R$ " + getPotenciaHP()
                +"\nNúmero de cilindros do motor do veículo : R$ " + getNumeroCilindros()
        );
    }
}
