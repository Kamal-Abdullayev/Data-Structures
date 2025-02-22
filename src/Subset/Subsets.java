package Subset;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        System.out.println(findSubsets(new int[] {1,2,3}));
        System.out.println(findSubsets(new int[] {0}));

    }

    public static List<List<Integer>> findSubsets(int[] nums) {
        List<List<Integer>> response = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        int lp = 0;

        subsets(response, tempList, nums, lp);

        return response;
    }

    public static void subsets(List<List<Integer>> resultSet, List<Integer> tempList, int[] nums, int lp) {
        resultSet.add(new ArrayList<>(tempList));
        for (int rp = lp; rp < nums.length; rp++) {
            tempList.add(nums[rp]);
            subsets(resultSet, tempList, nums, rp + 1);
            tempList.removeLast();

        }
    }
}
