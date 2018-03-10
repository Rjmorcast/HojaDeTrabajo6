/*
 * Universidad del Valle de Guatemala
 * Josue David Lopez 17081
 * Rodrigo Morales 17027
 * 
 */


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.Scanner;
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

        System.out.println("Escoja una implementacion de MAP");
        System.out.println("1. HashMap \n2. TreeMap \n3. LinkedHashMap ");
        System.out.println("Si no elige una de las opciones, automaticamente se elijira LinkedHashMap");
        Scanner leer = new Scanner(System.in);
        String opcion = leer.next();
        Cartas cartas = new Cartas(opcion);
        boolean acceso = false;
        
        while(acceso == false){
            //System.out.println();
            System.out.println("¿Que desea saber o hacer con su Baraja de cartas? Escriba el numero de la opcion");
            System.out.println("1. Agregar una carta a la colección. \n" +
                "2. Mostrar el tipo de una carta específica.\n" +
                "3. Mostrar el nombre, tipo y cantidad de cada carta en su colección.\n" +
                "4. Mostrar el nombre, tipo y cantidad de cada carta en su colección, ordenadas por tipo.\n" +
                "5. Mostrar el nombre y tipo de todas las cartas existentes.\n" +
                "6. Mostrar el nombre y tipo de todas las cartas existentes, ordenadas por tipo.\n" +
                "7. Salir de la aplicacion");
            opcion = leer.next();
            String tipo;
            String key;
            switch (opcion) {
                case "1":   System.out.println("ingrese el nombre de la carta");
                            key = leer.next();
                            System.out.println("ingrese tipo de la carta");
                            tipo = leer.next();
                            cartas.addCarta(key, tipo);
                            System.out.println("su carta a sido agregada exitosamente");
                            break;
                            
                case "2":   System.out.println("ingrese el nombre de la carta que desea buscar");
                            key = leer.next();
                            System.out.println(cartas.getTipo(key));
                            break;
                            
                case "3":   for (int i = 0; i < cartas.getAllCards_Nombre_Tipo_Cantidad().size(); i++) {
                                System.out.println(cartas.getAllCards_Nombre_Tipo_Cantidad().get(i));
                            }
                            break;
                            
                case "4":   for (int i = 0; i < cartas.getAllCards_Nombre_Tipo_Cantidad_Ordenada().size(); i++) {
                                System.out.println(cartas.getAllCards_Nombre_Tipo_Cantidad_Ordenada().get(i));
                            }
                            break;
                case "5":   for (int i = 0; i < cartas.getAllCards_Nombre_Tipo().size(); i++) {
                                System.out.println(cartas.getAllCards_Nombre_Tipo().get(i));
                            }
                            break;
                case "6":   for (int i = 0; i < cartas.getAllCards_Nombre_Tipo_Ordenada().size(); i++) {
                                System.out.println(cartas.getAllCards_Nombre_Tipo_Ordenada().get(i));
                            }
                            break;
                case "7":   acceso = true;
                            break;
                default:    System.out.print("Opcion no valida. Debe elegir solo uno de las opciones mostradas anteriormente.");
                            break;
        }
        }
        leer.close();
    }
}
