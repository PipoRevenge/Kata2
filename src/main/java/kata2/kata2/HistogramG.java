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
public class HistogramG<T>{
    private final T[] data;

    
    public HistogramG(T[] data) {
        this.data = data;
    }
    
    
    public Map<T, Integer> getHistogram() {
        Map<T, Integer>histogram = new HashMap<T, Integer>();
        for(int i = 0; i< data.length; i++ ){
            histogram.put(data[i], histogram.containsKey(data[i])? histogram.get(data[i])+1:1);
        }
        return  histogram;
    }
}
