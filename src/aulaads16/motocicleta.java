package aulaads16;
public class motocicleta {
     String marca;
     String modelo;
     int velocidade = 0;
    
    public void acelerar(int valor){         
        setVelocidade(getVelocidade() + valor);     }
    
    public void frear(int valor){
        setVelocidade(getVelocidade() - valor);
    }
    
    public void parar(){
        setVelocidade(0);
    }
    
    public void verificarEstado(){
        if (getVelocidade() == 0){
            System.out.println("A moto está parada");
        }else{
            System.out.println("A moto não está parada");
        }
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the velocidade
     */
    public int getVelocidade() {
        return velocidade;
    }

    /**
     * @param velocidade the velocidade to set
     */
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
}