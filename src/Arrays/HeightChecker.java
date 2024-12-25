package Arrays;

import java.util.Arrays;

public class HeightChecker {
    // 1051. Height Checker
    public static void main(String[] args) {
        int[] arr = new int[] {1,1,4,2,1,3};
        int[] arr2 = new int[] {5,1,2,3,4};
        int[] arr3 = new int[] {1,2,3,4,5};
        heightChecker(arr);
        heightChecker(arr2);
        heightChecker(arr3);
    }

    public static int heightChecker(int[] heights) {
        int[] newArr = heights.clone();
        int temp;
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            for (int j = i+1; j < heights.length; j++) {
                if (heights[i] > heights[j]) {
                    temp = heights[j];
                    heights[j] = heights[i];
                    heights[i] = temp;
                }
            }
        }

        for (int i = 0; i < heights.length; i++) {
            if (newArr[i] != heights[i]) {
                count++;
            }
        }

        System.out.println(Arrays.toString(newArr));
        System.out.println(Arrays.toString(heights));
        System.out.println(count);
        return count;
    }
}
