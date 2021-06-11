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
public class Caminhao extends Veiculo {

    private double QuantidadeDeToneladas;
    private int AlturaMaxima;
    private int Comprimento;

    public Caminhao() {
        this.AlturaMaxima = 0;
        this.Comprimento = 0;
        this.QuantidadeDeToneladas = 0;
        Motor m01 = new Motor();
        this.setMotor(m01);
    }

    public double getQuantidadeDeToneladas() {
        return QuantidadeDeToneladas;
    }

    public Caminhao(double QuantidadeDeToneladas, int AlturaMaxima, int Comprimento, int Peso, int VelocidadeMaxima, Motor motor, double Valor) {
        super(Peso, VelocidadeMaxima, motor, Valor);
        this.QuantidadeDeToneladas = QuantidadeDeToneladas;
        this.AlturaMaxima = AlturaMaxima;
        this.Comprimento = Comprimento;
    }

    public void setQuantidadeDeToneladas(double QuantidadeDeToneladas) {
        this.QuantidadeDeToneladas = QuantidadeDeToneladas;
    }

    public int getAlturaMaxima() {
        return AlturaMaxima;
    }

    public void setAlturaMaxima(int AlturaMaxima) {
        this.AlturaMaxima = AlturaMaxima;
    }

    public int getComprimento() {
        return Comprimento;
    }

    public void setComprimento(int Comprimento) {
        this.Comprimento = Comprimento;
    }

    public void MostrarDados() {
        System.out.println(
                "\nPeso do veículo : " + getPeso()
                + "\nVelocidade Maxima do veículo : " + getVelocidadeMaxima()
                + "\nQauntidade de toneladas suportadas: " + getQuantidadeDeToneladas()
                + "\nAltura máxima do veículo : " + getAlturaMaxima()
                + "\nComprimento máximo do veículo : " + getComprimento()
                + "\nValor do veículo : R$ " + getValor()
                + "\nPotência do motor do veículo : " + getMotor().getPotenciaHP()
                + "\nNúmero de cilindros do motor do veículo : " + getMotor().getNumeroCilindros()
        );
    }
}
