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
public class Potenza {
    
    private int base;

    public Potenza(int base) {
        this.base = base;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int pow() {
        int risultato = base * base;
     
        return risultato;
    }

    @Override
    public String toString() {
        return "Potenza{" + pow() + '}';
    }  
}
