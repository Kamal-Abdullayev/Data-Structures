package Arrays;

public class EvenNumber {
    // 1295. Find Numbers with Even Number of Digits
    public static void main(String[] args) {

        int[] nums = {437,315,322,431,686,264,442};
        System.out.println(findNumbers(nums));

    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        int isEven = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 10) {
                continue;
            }
            while (nums[i] > 0) {
                isEven++;
                nums[i]/= 10;
            }
            if (isEven != 0 && isEven % 2 == 0) {
                count++;
            }
            isEven = 0;
        }



        return count;
    }



}
