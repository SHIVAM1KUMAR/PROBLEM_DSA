public class Stringreverse {
    public static void main(String[] args) {
        String s1="abc";
        System.out.println(s1);
        int n=s1.length();
        String reverse="";
        char ch;
        for(int i=0;i<n;i++){
            ch=s1.charAt(i);
            reverse=ch+reverse;
        }
        System.out.println(reverse);
    }
    
}
