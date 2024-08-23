public class largestSubarray {
    public static void main(String[] args) {
        int []a={1,2,3,4,5};
        int n=a.length;
       //int  target=9;
      // int maxlength=Integer.MIN_VALUE;
       int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int sum =0;
            for(int j=i;j<n;j++){
                   sum=sum+a[j];
                //    if(sum==target){
                    
                //     maxlength=Math.max(maxlength,j-i+1);
                    
                //    }
                maxsum=Math.max(maxsum, sum);
            }
        }
        System.out.println(" max "+maxsum);

    }
}
