public class maxConsecutive {
    
    
        public static void main(String[] args) {
            int[] nums = {1, 1, 0, 1, 1, 1};
            int maxCount = 0;
            int currentCount = 0;
    
            for (int i=0;i<nums.length;i++) {
                if (nums[i]== 1) {
                    currentCount++;
                    if (currentCount > maxCount) {
                        maxCount = currentCount;
                    }
                } else {
                    currentCount = 0;
                }
            }
    
            System.out.println("Maximum consecutive ones: " + maxCount); 
        }
    }
    

