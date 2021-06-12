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
public class TestandoReferenciaNula {
    public static void main(String args[]) {
        try{
    Conta c = null;
    
    System.out.println("Saldo atual " +     c.getSaldo());
  }catch(Exception ex){
            System.out.println("Erro : "+ex.getMessage());
  }}
}
