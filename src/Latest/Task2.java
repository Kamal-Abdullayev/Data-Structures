package Latest;

public class Task2 {
    public static void main(String[] args) {
//        System.out.println(smallestSubArray(new int[] {10, 20, 30, 40, 50, 30, 20, 10, 5}, 4));
//        System.out.println(smallestSubArray(new int[] {100, 200, 300, 400}, 2));
//        System.out.println(smallestSubArray(new int[] {1,4,2,10,23,3,1,0,20}, 4));
//        System.out.println(smallestSubArray(new int[] {2,3}, 3));
        System.out.println(smallestSubArray(new int[] {1,3,45,6,0,19}, 51));
    }

    public static int smallestSubArray(int[] nums, int givenValue) {
        if (nums == null || nums.length == 0 || givenValue <= 0) {
            return -1;
        }

        int smallestSubArrayNumCount = 0;
        int smallestSubArrayNumSum = 0;
        int rightPointer = 0;
        int tempCount = 0;
        int tempSum = 0;

        for (int leftPointer = 0; leftPointer < nums.length; leftPointer++) {
            tempSum += nums[leftPointer];
            tempCount++;
            if (tempSum >= givenValue) {
                if (smallestSubArrayNumSum > tempSum) {
                    smallestSubArrayNumCount = tempCount;
                } else if (smallestSubArrayNumSum == tempSum) {
                    continue;
                } else {
                    smallestSubArrayNumCount = Math.max(tempCount, smallestSubArrayNumCount);
                }
                smallestSubArrayNumSum = tempSum;
                tempSum = 0;
                tempCount = 0;
                leftPointer = rightPointer;
                rightPointer++;
            }
        }
        System.out.println("tempSum = " + tempSum);
        return smallestSubArrayNumCount;
    }
}
