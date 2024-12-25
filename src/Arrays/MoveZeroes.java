package Arrays;

import java.util.Arrays;

public class MoveZeroes {

    // 283. Move Zeroes
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0,3,12};
        int[] nums2 = new int[]{0,0,0,0,0};
        int[] nums3 = new int[]{1,0}; //
        int[] nums4 = new int[]{0};
        int[] nums5 = new int[]{1};
        int[] nums6 = new int[]{1,0,0,1}; //
        int[] nums7 = new int[]{1,2,0,0}; //
        int[] nums8 = new int[]{1,0,1,0,0}; //
        int[] nums9 = new int[]{0,0,1,2};


        pushZerosToEnd(nums);
        pushZerosToEnd(nums2);
        pushZerosToEnd(nums3);
        pushZerosToEnd(nums4);
        pushZerosToEnd(nums5);
        pushZerosToEnd(nums6);
        pushZerosToEnd(nums7);
        pushZerosToEnd(nums8);
        pushZerosToEnd(nums9);

    }

    static void pushZerosToEnd(int[] arr)
    {
        int count = 0;

        for (int i = 0; i < arr.length; i++)
            if (arr[i] != 0)
                arr[count++] = arr[i];

        while (count < arr.length)
            arr[count++] = 0;

        System.out.println(Arrays.toString(arr));
    }

    public static void moveZeroes(int[] nums) {
        int n = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (i == 0 && nums[i] == 0) {
                n++;
            }
            if (nums[i+n] == 0) {
                n++;
            }
            if (n>0 && nums[i+n] != 0) {
                nums[i] = nums[i+n];
                nums[i+n] = 0;
            }

            if (i+n >= nums.length-1) break;
        }
        System.out.println(Arrays.toString(nums));
    }


}
