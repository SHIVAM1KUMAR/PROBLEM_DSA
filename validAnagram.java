import java.util.Arrays;

public class validAnagram {
    public static void main(String[] args) {
        String s1="listen";
        String s2="silent";
        if(s1.length()!=s2.length()){
            System.out.println("Not valid anagram");
            return;
        }
        char[] charArray = s1.toCharArray();
        Arrays.sort(charArray);
        char[] charArray2 = s2.toCharArray();
        Arrays.sort(charArray2);
       String sortedStr1 = new String(charArray);
        // System.out.println("Sorted string: " + sortedStr1);

         String sortedStr2 = new String(charArray2);

        // System.out.println("Sorted string: " + sortedStr2);
        //System.out.println("Sorted string: " + sortedStr);


        if(sortedStr1.equals(sortedStr2)){
            System.out.println("anagram");
        }else{
            System.out.println("not an anagram");
        }
    }
}
