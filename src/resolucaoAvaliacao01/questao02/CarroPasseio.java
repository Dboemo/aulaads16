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
public class CarroPasseio extends Veiculo {

    private String Cor;
    private String Modelo;

    public CarroPasseio() {
    }

    public CarroPasseio(String Cor, String Modelo, int Peso, int VelocidadeMaxima, Motor motor, double Valor) {
        super(Peso, VelocidadeMaxima, motor, Valor);
        this.Cor = Cor;
        this.Modelo = Modelo;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String Cor) {
        this.Cor = Cor;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public void MostrarDados() {

        System.out.println(
                "\nPeso do veículo : " + getPeso()
                + "\nVelocidade Maxima do veículo : " + getVelocidadeMaxima()
                + "\nCor do veículo : " + getCor()
                + "\nModelo do veículo : " + getModelo()
                + "\nValor do veículo : R$ " + getValor()
                + "\nPotência do motor do veículo : " + getMotor().getPotenciaHP()
                + "\nNúmero de cilindros do motor do veículo : " + getMotor().getNumeroCilindros()
        );
    }

}
