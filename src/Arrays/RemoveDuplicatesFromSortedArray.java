package Arrays;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    // 26. Remove Duplicates from Sorted Array
    public static void main(String[] args) {

        int[] nums = new int[]{1,1,2};
        int[] nums2 = new int[]{0,0,1,1,1,2,2,3,3,4};

        removeDuplicates(nums2);
    }

    public static int removeDuplicates(int[] nums) {
        int[] oldArr = nums;
        int k = 0;

        for (int i = 1; i < oldArr.length; i++) {
            if (oldArr[i] == oldArr[i-1]) {
                k++;
                continue;
            }
            nums[i-k] = oldArr[i];
        }

        System.out.println(Arrays.toString(nums));
        System.out.println("k: " + (nums.length - k));

        return nums.length - k;
    }

    public static int removeDuplicates2(int[] nums) {

        // Check for edge cases.
        if (nums == null) {
            return 0;
        }

        // Use the two pointer technique to remove the duplicates in-place.
        // The first element shouldn't be touched; it's already in its correct place.
        int writePointer = 1;
        // Go through each element in the Array.
        for (int readPointer = 1; readPointer < nums.length; readPointer++) {
            // If the current element we're reading is *different* to the previous
            // element...
            if (nums[readPointer] != nums[readPointer - 1]) {
                // Copy it into the next position at the front, tracked by writePointer.
                nums[writePointer] = nums[readPointer];
                // And we need to now increment writePointer, because the next element
                // should be written one space over.
                writePointer++;
            }
        }

        // This turns out to be the correct length value.
        return writePointer;
    }
}
