package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindAllNumbersDisappeared {

        // 448. Find All Numbers Disappeared in an Array
    public static void main(String[] args) {
        int[] arr1 = new int[]{4,3,2,7,8,2,3,1};
        int[] arr2 = new int[]{1,1};
        int[] arr3 = new int[]{10,2,5,10,9,1,1,4,3,7};
        System.out.println(findDisappearedNumbers(arr1));
        System.out.println(findDisappearedNumbers(arr2));
        System.out.println(findDisappearedNumbers(arr3));

    }


    public static List<Integer> findDisappearedNumbers(int[] nums) {


        List <Integer> result = new ArrayList <Integer>();
        HashSet <Integer> mark = new HashSet <Integer>();
        for(int i : nums)
            mark.add(i);
        for(int i = 1 ; i <= nums.length ; i++)
            if(!mark.contains(i))
                result.add(i);
        return result;

    }
}
