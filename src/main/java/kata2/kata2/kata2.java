/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kata2.kata2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author aleja
 */


public class kata2{
    public static void main(String[] args){
        Map<String, Integer>histogram = new HashMap<String, Integer>();
        String[] data = {"Rosa", "Pepe", "María", "Pepe", "Pepe", "Rosa"};
       
        
        
        HistogramG histograma2 = new HistogramG(data);
        histogram =histograma2.getHistogram();
        
        
        for (String nombre: histogram.keySet()){
            System.out.println( nombre + "==>" + histogram.get(nombre));
        }
        
       
    }
    
}
