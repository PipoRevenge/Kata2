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
 * kata 2.3
 */
public class HistogramG {
    private final int[] data;

    

    public HistogramG(int[] data) {
        this.data = data;
    }
    
    
    public Map<Integer, Integer> getHistogram() {
        Map<Integer, Integer>histogram = new HashMap<Integer, Integer>();
        for(int numero:data){
            histogram.put(numero, histogram.containsKey(numero)? histogram.get(numero)+1:1);
           
        }
        return histogram;
    }
}
