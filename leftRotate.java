public class leftRotate {
    

    //left rotate by one
    public static void main(String[] args) {
        int []a={1,2,3,4};
        int temp=a[0];
        for(int i=0;i<3;i++){
            a[i]=a[i+1];
           
           
        }
        a[3]=temp;
        for(int i = 0; i < 4; i++)
        System.out.print(a[i]+ " ");
       
    }
}
