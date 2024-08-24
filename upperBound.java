public class upperBound {
    public static void main(String[] args) {
        int a[]={1,2,3,4,6};
        int up=4;
        for(int i=0;i<a.length;i++){
            if(a[i]>up){
                System.out.println(i);
            }
        }
    }
}
