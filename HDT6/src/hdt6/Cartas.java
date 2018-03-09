/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt6;

import static com.sun.org.apache.xalan.internal.lib.ExsltDynamic.map;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import static jdk.nashorn.internal.objects.NativeArray.map;

/**
 *
 * @author JUMPSTONIK
 */
public class Cartas {
    
    public Map<String, String> Baraja;
    
    //Constructor
    public Cartas(int tipo) {
        //Usa el factory
        Baraja = CartasFactory.setTypeCartas(tipo);
        getCards();
    }
 
    public void getCards(){
        //Jumpi aquí va el método de lectura del archivo;
    }
    //Agregar una carta a la colección del usuario.
    public void addCarta(String key, String value){
        if (!Baraja.containsKey(key)){
            Baraja.put(key, value);
        } else {
            System.err.println("Ya existe una carta con ese Nombre");
        }
    }
    //Mostrar el tipo de una carta específica.
    public String getTipo(String key){
        if (Baraja.containsKey(key)){
            return Baraja.get(key);
        } else {
            System.err.println("No existe una carta con ese nombre");
            return null;
        }
    }
    //Mostrar el nombre, tipo y cantidad de cada carta que el usuario tiene en su colección.
    public ArrayList<String> getAllCards_Nombre_Tipo_Cantidad(){
        ArrayList<String> todasLasCartas = new ArrayList<String>();
        Baraja.forEach((k,v)->todasLasCartas.add("Nombre: "+k+" Tipo: "+v+" Cantidad: 1"));
        return todasLasCartas;
    }
    //Mostrar el nombre y tipo de todas las cartas existentes.
    public ArrayList<String> getAllCards_Nombre_Tipo(){
        ArrayList<String> todasLasCartas = new ArrayList<String>();
        Baraja.forEach((k,v)->todasLasCartas.add("Nombre: "+k+" Tipo: "+v));
        return todasLasCartas;
    }
    //Mostrar el nombre y tipo de todas las cartas existentes, ordenadas por tipo.
     public ArrayList<String> getAllCards_Nombre_Tipo_Ordenada(){
        ArrayList<Carta> todasLasCartas = new ArrayList<Carta>();
        Baraja.forEach((k,v)->todasLasCartas.add(new Carta(k,v)));
        return Ordenar(todasLasCartas);
    }
    //Mostrar el nombre, tipo y cantidad de cada carta que el usuario tiene en su colección, ordenadas por tipo.
     public ArrayList<String> getAllCards_Nombre_Tipo_Cantidad_Ordenada(){
        ArrayList<Carta> todasLasCartas = new ArrayList<Carta>();
        Baraja.forEach((k,v)->todasLasCartas.add(new Carta(k,v)));
        return OrdenarConCantidad(todasLasCartas);
    } 

    //Ordena las cartas
    public ArrayList<String> Ordenar(ArrayList<Carta> Lista){
        Carta c = new Carta("","");
        ArrayList<String> result = new ArrayList<String>();
        for (int x=0;x<Lista.size();x++){
            c = Lista.get(x);
            if ("Hechizo".equals(c.Tipo)){
                result.add("Nombre: "+c.Nombre+" Tipo: "+c.Tipo);
            }
        }
        for (int x=0;x<Lista.size();x++){
            c = Lista.get(x);
            if ("Monstruo".equals(c.Tipo)){
                result.add("Nombre: "+c.Nombre+" Tipo: "+c.Tipo);
            }
        }
        for (int x=0;x<Lista.size();x++){
            c = Lista.get(x);
            if ("Trampa".equals(c.Tipo)){
                result.add("Nombre: "+c.Nombre+" Tipo: "+c.Tipo);
            }
        }
        
        return result;
    }
    
    //Ordena las cartas con cantidad
    public ArrayList<String> OrdenarConCantidad(ArrayList<Carta> Lista){
        Carta c = new Carta("","");
        ArrayList<String> result = new ArrayList<String>();
        for (int x=0;x<Lista.size();x++){
            c = Lista.get(x);
            if ("Hechizo".equals(c.Tipo)){
                result.add("Nombre: "+c.Nombre+" Tipo: "+c.Tipo+" Cantidad: 1");
            }
        }
        for (int x=0;x<Lista.size();x++){
            c = Lista.get(x);
            if ("Monstruo".equals(c.Tipo)){
                result.add("Nombre: "+c.Nombre+" Tipo: "+c.Tipo +" Cantidad: 1");
            }
        }
        for (int x=0;x<Lista.size();x++){
            c = Lista.get(x);
            if ("Trampa".equals(c.Tipo)){
                result.add("Nombre: "+c.Nombre+" Tipo: "+c.Tipo +" Cantidad: 1");
            }
        }
        
        return result;
    }
}

