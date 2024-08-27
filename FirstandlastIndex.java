public class FirstandlastIndex {
    public static void main(String[] args) {
        int arr[]={1,5,7,8,8,9};
        int n=arr.length-1;
          
        for(int i=0;i<n;i++){
           
            if(arr[i]==8){
                arr[i]++;

                System.out.println(i);
            }
        }
       
        System.out.println("Shivam kumar");
       
    }
}
