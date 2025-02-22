package Latest;

import java.util.ArrayList;
import java.util.List;

public class MaxOfAllArrays {


    public static void main(String[] args) {
        System.out.println(maxOfAllArrays(new int[] {1,2,3,1,4,5}, 3));
    }


    public static List<Integer> maxOfAllArrays(int[] arr, int k) {
        // validation

        int lp = 0;
        int tempNum = 0;
        List<Integer> maxOfAllElements = new ArrayList<>();

        for (int rp = 0; rp <= arr.length; rp++) {
            if (rp >= lp + k) {
                rp = lp;
                lp ++;
                maxOfAllElements.add(tempNum);
                tempNum = 0;
            } else if(rp < arr.length){
                tempNum = Math.max(tempNum, arr[rp]);
            }

        }

        return maxOfAllElements;
    }
}
