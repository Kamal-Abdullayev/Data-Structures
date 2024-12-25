package Arrays;

import java.util.Arrays;

public class ThirdMaximumNumber {
    // 414. Third Maximum Number
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,2};
        int[] arr2 = new int[]{1,2};
        int[] arr3 = new int[]{2,2,3,1};
        int[] arr4 = new int[]{1,-2147483648,2};
        int[] arr5 = new int[]{1,2,-2147483648};
        System.out.println(thirdMax(arr));
        System.out.println(thirdMax(arr2));
        System.out.println(thirdMax(arr3));
        System.out.println(thirdMax(arr4));
        System.out.println(thirdMax(arr5));

    }

    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));

        for (int index = 0; index < nums.length / 2; ++index) {
            int temp = nums[index];
            nums[index] = nums[nums.length - 1 - index];
            nums[nums.length - 1 - index] = temp;
        }

        int elemCounted = 1;
        int prevElem = nums[0];

        for (int index = 1; index < nums.length; ++index) {
            if (nums[index] != prevElem) {
                elemCounted += 1;
                prevElem = nums[index];
            }

            if (elemCounted == 3) {
                return nums[index];
            }
        }

        return nums[0];
    }



}
