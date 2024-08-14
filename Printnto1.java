public class Printnto1 {
    public static void main(String[] args) {
        int n=10;
        num(n);
    }
    public static void num(int n){
        if(n>0){
            System.out.println(n);
            num(n-1);
            return;
        }
       
    }
}
// // num(1,n);
// for(int i=n;i>=1;i--){
            
//     System.out.println(i);
// }