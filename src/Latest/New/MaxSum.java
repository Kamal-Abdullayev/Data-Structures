package Latest.New;

public class MaxSum {
    public static void main(String[] args) {
        System.out.println(maxSum(new int[] {10, 20, 30, 40, 50, 30, 20, 10, 5}, 4));
        System.out.println(maxSum(new int[] {100, 200, 300, 400}, 2));
        System.out.println(maxSum(new int[] {1,4,2,10,23,3,1,0,20}, 4));
        System.out.println(maxSum(new int[] {2,3}, 3));
    }


    public static int maxSum(int[] arr, int k) {
        int maxValue = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            if (i >= k-1) {
                maxValue = Math.max(maxValue, currentSum);
                currentSum -= arr[i - (k - 1)];
            }
        }
        return maxValue;
    }

}
