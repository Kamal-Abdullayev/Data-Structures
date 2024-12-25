package Arrays;

import java.util.Arrays;

public class MergeSortedArray {

    // 88. Merge Sorted Array
    public static void main(String[] args) {
        int[] nums1 = new int[] {1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[] {2, 5, 6};
        merge(nums1, 3, nums2, 3);

//        int[] nums1 = new int[] {1};
//        int[] nums2 = new int[] {0};
//        merge(nums1, 1, nums2, 0);



    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] oldNum1 = nums1;

        for(int i = 0, j = m; i < m+n; i++, j++) {
            if(i < m)
                nums1[i] = oldNum1[i];

            if(j < m + n)
                nums1[j] = nums2[i];
        }

        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}
