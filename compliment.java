import java.util.*;
public class compliment {
    public static void main(String[] args) {
        int []a=new int[5];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
         System.out.println(Arrays.toString(a));
         Arrays.sort(a);
         System.out.println(Arrays.toString(a));
    }
}
