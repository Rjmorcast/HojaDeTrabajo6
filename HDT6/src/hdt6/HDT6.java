/*
 * Universidad del Valle de Guatemala
 * Josue David Lopez 17081
 * Rodrigo Morales 17027
 * 
 */
package hdt6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
/**
 *
 * @author Josue David Lopez(JUMPSTONIK)
 * @author Rodrigo Morales
 */
public class HDT6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ruta del archivo a usar
        File file = new File("C:\\Users\\JUMPSTONIK\\Documents\\NetBeansProjects\\HojaDeTrabajo6\\HDT6\\src\\hdt6\\cards_desc.txt");
        //lista de las lineas extraidas del documento
        ArrayList<String> listaLineas = new ArrayList<String>();
        //lista con los objetos de tipo Cartas
        ArrayList<Cartas> ListaCartas = new ArrayList<Cartas>();
    
    //aqui se hace el intento por obtener el archivo con sus informaicon    
    try {
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
 
        String linea;
        //aqui esta extrayendos linea por linea del txt
        while((linea = br.readLine()) != null)
            listaLineas.add(linea);
 
        fr.close();
    }//esto en caso halla algun error con el archivo
    catch(Exception e) {
        System.out.println("Excepcion leyendo fichero : " + e);
    }
    //este for solo es de prueba para separar el key, del tipo
    for (int i = 0; i < listaLineas.size(); i++) {
        String[] keyAndType = listaLineas.get(i).split(">");
        ListaCartas.add(new Cartas(keyAndType[0],keyAndType[1]));   
    }
    // esto solo se encarga de mostrar si realmente a separado cada parte del mismo 
    for (int i = 0; i < listaLineas.size(); i++) {
        System.out.println("Key: " + ListaCartas.get(i).getKey() + " y " + "Tipo: " + ListaCartas.get(i).getTipo());
    }
    
    
    }
}
