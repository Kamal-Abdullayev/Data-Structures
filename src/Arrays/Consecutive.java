package Arrays;

public class Consecutive {

    // 485. Max Consecutive Ones
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        int[] nums2 = {1,0,1,1,0,1};

        System.out.println(findMaxConsecutiveOnes(nums2));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int count2 = 0;


        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                count++;
            }
            if (nums[i] == 0  || i == nums.length - 1) {
                if (count > count2) {
                    count2 = count;
                }
                count = 0;
            }

        }

        return count2;
    }
}
