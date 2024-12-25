package Arrays;

import java.util.Arrays;

public class RemoveElement {

    // 27. Remove Element
    public static void main(String[] args) {
//        int[] arr = new int[] {3,2,2,3};
//        int val = 3;
//        removeElement(arr, val);

        int[] arr2= new int[] {0,1,2,2,3,0,4,2};
        int val2 = 2;
        removeElement(arr2, val2);

    }

    public static int removeElement(int[] nums, int val) {
        int[] oldArr = nums;
        int k = 0;

        for (int i = 0; i < oldArr.length; i++) {
            if (oldArr[i] == val) {
                k++;
                continue;
            }

            nums[i-k] = oldArr[i];


        }

        System.out.println(Arrays.toString(nums));
        System.out.println("k: " + (nums.length - k));
        return nums.length - k;
    }


}
