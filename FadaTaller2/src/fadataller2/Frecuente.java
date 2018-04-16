/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fadataller2;

/**
 *
 * @author Nathalia
 */

public class Frecuente {
    private int numero;
    private int frecuencia =0;
    
    public void setFrecuencia(int f){
        frecuencia=f;
    }
    
    public void setNumero(int n){
        numero=n;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public int getFrecuencia(){
        return frecuencia;
    }
    
    
}
