package Arrays;

import java.util.Arrays;

public class SortArrayByParity {

    // 905. Sort Array By Parity
    public static void main(String[] args) {

        int[] arr = new int[]{3,1,5,6,2,4};
        int[] arr2 = new int[]{1,3,5,4,7,9};
        int[] arr3 = new int[]{0};
        int[] arr4 = new int[]{2,4};
        int[] arr5 = new int[]{2,3,4,5,6,8,1};
        int[] arr6 = new int[]{2,1,5,6,2,4};

        sortArrayByParity(arr);
        sortArrayByParity(arr2);
        sortArrayByParity(arr3);
        sortArrayByParity(arr4);
        sortArrayByParity(arr5);
        sortArrayByParity(arr6);

    }

    public static int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int temp;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                temp = nums[left];
                nums[left] = nums[i];
                nums[i] = temp;
                left++;
            }

        }
        System.out.println(Arrays.toString(nums));
        return nums;
    }


}
