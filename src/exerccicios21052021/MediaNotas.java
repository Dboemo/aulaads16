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
public class MediaNotas {
     public int Media(int N1, int N2) {
        return (N1 + N2) / 2;
    }
//erro mesmo sendo possível sobrecarga de métodos
     //não é possível ter métodos com o mesmo número de parametros de mesmo tipo
    //public double Media(int N1, int N2) {
    //    return (N1 + N2) / 2;
   // }
      public double Media(double N1, double N2) {
        return (N1 + N2) / 2;
    }    
     
}
