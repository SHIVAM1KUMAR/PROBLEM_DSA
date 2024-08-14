public class arraySort {
    public static void main(String[] args) {
        int []a={1,2,3,4};
        for(int i=1;i<a.length;i++){
            if(a[i-1]<=a[i] ){
                continue;
            } 
            else
            System.out.println("Not sorted");
            break;
        }
        System.out.println("Sorted");
    }
}
