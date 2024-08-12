public class Factorial {
   

    public static void main(String[] args) {
        int n=5;
        System.out.println(n);
        System.out.println(Factorial(n));
    }
    public static int Factorial(int n){
        if(n==0){
            return 1;
        }
       int  fn=n*Factorial(n-1);
       return fn;
    }
}
