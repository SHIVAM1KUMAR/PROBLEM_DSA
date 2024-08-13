 import java.util.*;
public class FrequencyCount {
    public static void main(String[] args) {
        int n=6;
        int[] arr = {1, 1, 2, 3, 4, 5};
        Map<Integer,Integer>m =new HashMap<>();//m indicates hashmap
        
        for(int i=0;i<n;i++){
            int freq = m.getOrDefault(arr[i], 0) + 1;
            m.put(arr[i], freq);
          
        }
        int highestFreq = Integer.MIN_VALUE;
        int lowestFreq = Integer.MAX_VALUE;
         // Update highest and lowest frequencies
         for (int freq : m.values()) {
            highestFreq = Math.max(highestFreq, freq);
            lowestFreq = Math.min(lowestFreq, freq);
        }
      for(Map.Entry<Integer,Integer>entry:m.entrySet()){
        System.out.println(entry.getKey()+ " " +entry.getValue());
      }
      System.out.println("Highest Frequency: " + highestFreq);
      System.out.println("Lowest Frequency: " + lowestFreq);
    }
}
