import java.util.*;

public class twoSum {
    public static void main(String[] args) {
        int a[]={1,2,5,4,7,8,0};
        int n=a.length;
        int target=9;
        int flag=0;
        Map<Integer,Integer>m=new HashMap<>();
        for(int i=0;i<n;i++){
            int num=target-a[i];
            // for(int j=1;j<n;j++){
            //     for(int j=i+1;j<n;j++){
            //     if(a[i] +a[j]==target){
            //         int temp[]={i,j};
            //         System.out.println(a[i]+" "+ a[j]);
            //         System.out.println(Arrays.toString(temp));
            //     }
            // }
               if(m.containsKey(num)){
                System.out.print(m.get(num));
                System.out.println(i);
                System.out.println(num + " "+ a[i]);
                flag=1;
                break;
               }
               m.put(a[i],i);
        }
if(flag==0){
    System.out.println("PAir not found");
}
    }
}
