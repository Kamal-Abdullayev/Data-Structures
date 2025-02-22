package Latest;

public class Task {
    public static void main(String[] args) {
        System.out.println(sum(new int[] {10, 20, 30, 40, 50, 30, 20, 10, 5}, 4));
        System.out.println(sum(new int[] {100, 200, 300, 400}, 2));
        System.out.println(sum(new int[] {1,4,2,10,23,3,1,0,20}, 4));
        System.out.println(sum(new int[] {2,3}, 3));
    }

    public static int sum(int[] numArr, int k) {
        if (numArr == null || numArr.length < k) {
            return -1;
        }

        int sum = 0;
        int rightPointer = k-1;
        int tempSum = 0;

        for (int leftPointer = 0; leftPointer < numArr.length - k + 1; leftPointer++) {
            tempSum += numArr[leftPointer];

            if (leftPointer >= rightPointer) { //modify
                sum = Math.max(sum, tempSum);
                tempSum = 0;
                rightPointer++;
                leftPointer = rightPointer - k;
            }
        }
        return sum;
    }


}
