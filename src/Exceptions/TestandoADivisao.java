/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

import java.io.IOException;

/**
 *
 * @author boemo
 */
public class TestandoADivisao {
      public static void main(String args[]) {
    int i = 5571;
    try{
    i = i / 0;
    System.out.println("O resultado  " + i);
    }catch(Exception ex){
        System.out.println("Erro :"+ex.getMessage());
    
    }finally{
          System.out.println("segue o baile");}
  }
}
