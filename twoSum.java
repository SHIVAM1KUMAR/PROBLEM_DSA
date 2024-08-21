import java.util.Arrays;

public class twoSum {
    public static void main(String[] args) {
        int a[]={1,2,5,4,7,8,0};
        int n=a.length;
        int target=9;
        for(int i=0;i<n;i++){
            // for(int j=1;j<n;j++){
                for(int j=i+1;j<n;j++){
                if(a[i] +a[j]==target){
                    int temp[]={i,j};
                    System.out.println(a[i]+" "+ a[j]);
                    System.out.println(Arrays.toString(temp));
                }
            }
        }
    }
}
