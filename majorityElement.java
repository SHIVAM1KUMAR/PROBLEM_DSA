public class majorityElement {
    public static void main(String[] args) {
        int []a={1,1,1,1,2,2,2};
        int maj=a.length/2;
        int n=a.length;
        for(int i=0;i<n;i++){
            int count = 0;
            for (int j = 0; j < n; j++) {
                if(a[j]==a[i]){
                    count++;
                }
            }
            if (count > maj) {
                System.out.println(a[i]);
                return; 
            }
        }
    }
}
