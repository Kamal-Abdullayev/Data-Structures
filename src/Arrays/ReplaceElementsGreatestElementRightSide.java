package Arrays;

import java.util.Arrays;

public class ReplaceElementsGreatestElementRightSide {

    // 1299. Replace Elements with Greatest Element on Right Side
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        nextGreatest (arr);
        System.out.println("The modified array:" + Arrays.toString(arr));


    }
    static int[] nextGreatest(int[] arr) {
        int arrLength = arr.length;
        int maxRight =  arr[arrLength-1];
        arr[arrLength-1] = -1;

        for (int i = arrLength-2; i >= 0; i--)
        {
            int temp = arr[i];
            arr[i] = maxRight;
            if(maxRight < temp)
                maxRight = temp;
        }

        return arr;
    }
}
