/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaads16;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author boemo
 */
public class advinha {
 public static void main(String[] args) {
 int numero, contador, palpite; 
 Scanner ler = new Scanner(System.in); 
 Random rand = new Random(); 
 numero = rand.nextInt(100); 
 contador = 0; 
 palpite = -1; 
 while (palpite != numero) {
 System.out.print("Digite o palpite: "); 
 palpite = ler.nextInt(); 
 contador++; if (palpite > numero) {
 System.out.println("Digite um numero MENOR!");
 } 
 else { if (palpite < numero) { 
 System.out.println("Digite um numero MAIOR!"); 
 } else { 
 System.out.println("PARABENS!"); 
 System.out.println("Voce acertou com " + contador + " tentativas"); 
} 
} 
} 
ler.close(); }
}
