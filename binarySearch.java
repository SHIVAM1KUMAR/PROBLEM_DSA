public class binarySearch {
    public static void main(String[] args) {
        int a[]={1,2,3,41,5};
        int target =41;
        int l=0;
        int r=a.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;

            if(a[mid]==target){
                System.out.println("our target is found at index"+ mid +" "+target);
                break;
            }else if(a[mid]<target){
                l=mid+1;
            }else
            r=mid-1;
        }
    }
}
