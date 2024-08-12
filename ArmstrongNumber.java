import java.util.*;
public class ArmstrongNumber {
    public static void main(String[] args) {
        int num =371;
        int originalnum,rem,result=0;
        originalnum=num;
        while(originalnum!=0){
            rem=originalnum%10;
            result=(int) (result + Math.pow(rem,3));
            originalnum=originalnum/10;

        }
        if(result==num){
            System.out.println("ArmStrong Number");
        }
        else
        System.out.println("Not ArmStrong number");
    }
}
