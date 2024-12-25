package Arrays;

public class CheckIfNAndItsDoubleExist {
    // 1346. Check If N and Its Double Exist
    public static void main(String[] args) {

//        int[] arr = new int[]{3,1,7,11};
//        int[] arr = new int[]{-2,0,10,-19,4,6,-8};
//        int[] arr = new int[]{7, 1, 14, 11};
//        int[] arr = new int[]{-20,8,-6,-14,0,-19,14,4};
        int[] arr = new int[]{2, 3, 3, 0, 0};
        System.out.println(checkIfExist(arr));

    }


    public static boolean checkIfExist(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) continue;
                if (arr[i] == arr[j] * 2) return true;
            }
        }

        return false;
    }
}
