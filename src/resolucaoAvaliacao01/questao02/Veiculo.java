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
public class Veiculo {

    private int Peso;
    private int VelocidadeMaxima;
    private Motor motor;
    private double Valor;

    public Veiculo() {
    }

    public Veiculo(int Peso, int VelocidadeMaxima, Motor motor, double Valor) {
        this.Peso = Peso;
        this.VelocidadeMaxima = VelocidadeMaxima;
        this.motor = motor;
        this.Valor = Valor;
    }

    public int getPeso() {
        return Peso;
    }

    public void setPeso(int Peso) {
        this.Peso = Peso;
    }

    public int getVelocidadeMaxima() {
        return VelocidadeMaxima;
    }

    public void setVelocidadeMaxima(int VelocidadeMaxima) {
        this.VelocidadeMaxima = VelocidadeMaxima;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    public void MostrarDados() {
        /*
            private int Peso;
    private int VelocidadeMaxima;
    private Motor motor ;
    private double Valor;
         */
        System.out.println(
                "\nPeso do veículo : " + getPeso()
                + "\nVelocidade Maxima do veículo : " + getVelocidadeMaxima()
                + "\nValor do veículo : R$ " + getValor()
                + "\nPotência do motor do veículo : " + getMotor().getPotenciaHP()
                + "\nNúmero de cilindros do motor do veículo : " + getMotor().getNumeroCilindros()
        );
    }
}
