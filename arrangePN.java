import java.util.Arrays;
import java.util.Vector;

public class arrangePN {
    public static void main(String[] args) {
        int a[]={-1,1,2,-3,5};
        int n=a.length;
        Vector<Integer> pos = new Vector<>();
        Vector<Integer> neg = new Vector<>();
        for(int i=0;i<n;i++){
            if(a[i]<0){
                neg.add(a[i]);

            }else
           pos.add(a[i]);
        }
        int i=0;
        int j=0;
        Vector<Integer> temp = new Vector<>();
        while(i<pos.size() && j<neg.size()){
              temp.add(pos.get(i));
              temp.add(neg.get(j));
              i++;j++;
        }
        while(i<pos.size() ){
            temp.add(pos.get(i));
            i++;
        }
        while(j<neg.size() ){
            temp.add(neg.get(j));
            j++;
        }
        for (int k = 0; k < temp.size(); k++) {
            System.out.print(temp.get(k) + " ");
        }
        // for (int i = 0; i < neg.size(); i++) {
        //     System.out.print(neg.get(i) + " ");
        // }
    }
}
