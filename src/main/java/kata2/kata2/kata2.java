/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kata2.kata2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author aleja
 */


public class kata2 {
    public static void main(String[] args){
        Map<Integer, Integer>histogram = new HashMap<Integer, Integer>();
        int[] data = {1,2,2, 4,5,7,7,7,2,4,5,10,9, 1,0};
       
        
        for(int numero:data){
            if(histogram.keySet().contains(numero)){
                histogram.put(numero, histogram.get(numero)+1);
                
            }else{
                histogram.put(numero, 1);
            }
        }
        
        
        for (int numero:data) {
            System.out.println( numero + "==>" + histogram.get(numero));
        }
        
       
    }
    
}
