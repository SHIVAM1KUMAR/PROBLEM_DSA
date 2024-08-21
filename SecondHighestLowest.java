public class SecondHighestLowest {
    public static void main(String[] args) {
        int[] nums = {12, 35, 11, 10, 34, 13};

        if (nums.length < 2) {
            System.out.println("Array should have at least two elements.");
            return;
        }

        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        int secondLowest = Integer.MAX_VALUE;

        // First pass to find the highest and lowest elements
        for (int num : nums) {
            if (num > highest) {
                highest = num;
            }
            if (num < lowest) {
                lowest = num;
            }
        }

        // Second pass to find the second highest and second lowest elements
        for (int num : nums) {
            if (num > secondHighest && num < highest) {
                secondHighest = num;
            }
            if (num < secondLowest && num > lowest) {
                secondLowest = num;
            }
        }

        System.out.println("Second Highest: " + secondHighest);
        System.out.println("Second Lowest: " + secondLowest);
    }
}
