/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.tss.potenza;

/**
 *
 * @author Fatimatou Diallo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Potenza p = new Potenza(5);
        
        p.setBase(7);
        
        System.out.println(p);
    }
    
}
