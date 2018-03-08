/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt6;

/**
 *
 * @author JUMPSTONIK
 */
public class Cartas {
    String key;
    String tipo;
    
    public Cartas(String IKey, String ITipo){
        this.key = IKey;
        this.tipo = ITipo;
    }

    public Cartas() {
    }
    
    public String getKey() {
        return key;
    }

    public String getTipo() {
        return tipo;
    }
    
}
