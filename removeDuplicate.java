public class removeDuplicate {
    public static void main(String[] args) {
        int [] a={1,1,2,3,4,7};
        removeDup(a, 0);
        
       
    }

    public static void removeDup(int []a,int n){
        int j=0;
      for(int i=1;i<a.length;i++){
          if(a[j]!=a[i]){
            j++;
            a[j]=a[i];
          }
      }
      for(int k=0;k<j+1;k++){
        System.out.println(a[k]);
      }
    
}
}