package Latest.New;

public class SmallestSubArraySumSlightlyHigher {
    public static void main(String[] args) {
        System.out.println(smallestSubWithSum(new int[] {1, 4, 45, 6, 0, 19}, 51));
//        System.out.println(smallestSubWithSum(new int[] {1, 10, 5, 2, 7}, 100));
        System.out.println(smallestSubWithSum(new int[] {1, 10, 5, 2, 7}, 5));
    }


    static int smallestSubWithSum(int[] arr, int k) {
        int count = Integer.MAX_VALUE;
        int minSum = Integer.MAX_VALUE;
        int currentSum = 0;
        int lp = 0;

        for (int rp = 0; rp < arr.length; rp++) {
            currentSum += arr[rp];

            while (currentSum >= k) {
                count = Math.min(count, rp - lp +1);
                minSum = Math.min(minSum, currentSum);
                currentSum -= arr[lp];
                lp++;
            }
        }

        System.out.println(minSum);
        return count;
    }


//    static int smallestSubWithSum(int[] arr, int k) {
//        int count = Integer.MAX_VALUE;
//        int currentSum = 0;
//        int lp = 0;
//
//        for (int rp = 0; rp < arr.length; rp++) {
//            currentSum += arr[rp];
//
//            while (currentSum >= k) {
//                count = Math.min(count, rp - lp +1);
//                currentSum -= arr[lp];
//                lp++;
//            }
//        }
//
//        return count;
//    }
















//    static int smallestSubWithSum(int[] arr, int k) {
//        int lp = 0, rp = 0;
//        int sum = 0;
//        int count = Integer.MAX_VALUE;
//
//        while (rp < arr.length) {
//            while (rp < arr.length && sum <= k) {
//                sum += arr[rp++];
//            }
//
//            if (rp == arr.length && sum <= k) break;
//
//            while (lp < rp && sum - arr[lp] > k) {
//                sum -= arr[lp++];
//            }
//
//            count = Math.min(count, rp - lp);
//
//            sum -= arr[lp];
//            lp++;
//        }
//
//        if (count == Integer.MAX_VALUE) return 0;
//        return count;
//    }




}
