package Arrays;

import java.util.Arrays;

public class SquaresOfSortedArray {
   // 977. Squares of a Sorted Array
    public static void main(String[] args) {

        int[] nums = {-7,-3,2,3,11};

        System.out.println(Arrays.toString(sortedSquares((nums))));
    }


    public static int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i] * nums[i];
        }

        Arrays.sort(arr);
        return arr;
    }
}
