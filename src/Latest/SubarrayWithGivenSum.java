package Latest;

import java.util.ArrayList;
import java.util.List;

public class SubarrayWithGivenSum {


    public static void main(String[] args) {
        System.out.println(subarraySum(new int[] {15,2,4,8,9,5,10,23}, 23));
        System.out.println(subarraySum(new int[] {1,10,4,0,3,5}, 7));
        System.out.println(subarraySum(new int[] {1,4}, 0));
    }


    public static List<Integer> subarraySum(int[] nums, int target) {
        ArrayList<Integer> indexes = new ArrayList<>();

        if (nums == null || nums.length == 0 || target <= 0) {
            indexes.add(-1);
            return indexes;
        }

        int sum = 0;
        int lp = 0;

        for (int rp = 0; rp < nums.length; rp++) {
            sum += nums[rp];
            if (sum == target && indexes.isEmpty()) {
                indexes.add(lp);
                indexes.add(rp);
                sum = 0;
                rp = lp;
                lp ++;
            } else if (sum > target) {
                rp = lp;
                lp ++;
                sum = 0;
            }
        }

        return indexes;
    }
}
