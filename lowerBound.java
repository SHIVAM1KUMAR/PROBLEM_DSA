import java.util.Arrays;

public class lowerBound {
    public static void main(String[] args) {
        int a[]={1,2,3,4,6};
        int lb=5;
        for(int i =0;i<a.length;i++){
            if(a[i]>=lb){//lower bound=vThe lower bound algorithm finds the first or the smallest index in a sorted array where the value at that index is greater than or equal to a given key i.e. lb
                System.out.println("lb found at ind "+i);
            }
            
        }
       
    }
}
