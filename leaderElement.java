import java.util.Arrays;

public class leaderElement {
    public static void main(String[] args) {
        int []a={1,2,5,3,4};
        int n=a.length;
        for(int i=0;i<n-1;i++){
            if(a[i]>a[i+1]){
              System.out.println("Leader element found:"+a[i]);
            }
           
        }
       // System.out.println("Leader element found: " + a[n - 1]);
    }
}
