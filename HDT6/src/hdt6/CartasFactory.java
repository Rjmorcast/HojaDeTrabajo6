/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Rodrigo
 */
public class CartasFactory {
    public static Map setTypeCartas(String tipo) {
        Map<String, String> Mapa;
        //HashMap
        if (tipo == "1"){
            Mapa = new HashMap<String, String>();
        } else if (tipo == "2"){
            //TreeMap
            Mapa = new TreeMap<String, String>();
        } else {
            //LinkedHashMap
            Mapa = new LinkedHashMap<String, String>();
        }
        return Mapa;
    }
}
