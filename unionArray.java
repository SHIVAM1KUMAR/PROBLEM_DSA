import java.util.*;
public class unionArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]={1,2,7,8,9};
        Map<Integer,Integer> m=new HashMap<>();

        for(int i=0;i<a.length;i++){//first arr
            m.put(a[i], m.getOrDefault(a[i], 0) + 1);
        }
for(int j=0;j<b.length;j++){//second arr
    m.put(b[j],m.getOrDefault(b[j],0)+1);
}

for (int value: m.keySet()) {
System.out.println(value + " occur "+m.get(value));

    }
}
}
