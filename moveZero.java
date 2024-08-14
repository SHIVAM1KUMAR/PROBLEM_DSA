public class moveZero {
    public static void main(String[] args) {
        int []a={1,0,2,0,3};
         int j=0;
         for (int k=0;k<a.length;k++){
            if(a[k]==0){
                j = k;
                break;
            }
         }

        for(int i=j+1;i<a.length;i++){
           if(a[i]!=0){
            int temp = a[j];
            a[j] = a[i];
            a[i] = temp;
            j++;
           }
        }
        for(int i = 0; i < a.length;i++) {
            System.out.println(a[i]);
        }

        
    }
}
