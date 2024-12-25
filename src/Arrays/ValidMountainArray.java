package Arrays;

public class ValidMountainArray {

    // 941. Valid Mountain Array
    public static void main(String[] args) {
        int[] arr1 = new int[] {1,1,1,1,2,1};
        int[] arr2 = new int[] {3, 5, 5};
        int[] arr3 = new int[] {0, 3, 2, 1};
        int[] arr4 = new int[] {2, 0, 2};
        int[] arr5 = new int[] {9,8,7,6,5,4,3,2,1,0};
        int[] arr6 = new int[] {0,1,2,3,4,5,6,7,8,9};
        int[] arr7 = new int[] {6,7,7,8,6};
        System.out.println(validMountainArray2(arr1));
        System.out.println(validMountainArray2(arr2));
        System.out.println(validMountainArray2(arr3));
        System.out.println(validMountainArray2(arr4));
        System.out.println(validMountainArray2(arr5));
        System.out.println(validMountainArray2(arr6));
        System.out.println(validMountainArray2(arr7));
    }

    public static boolean validMountainArray2(int[] arr) {
        boolean less = false;
        boolean more = false;
        if (arr.length < 3) return false;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == arr[i+1]) {
                return false;
            }

            if (arr[i] < arr[i+1]) {
                less = true;
            } else if (arr[i] > arr[i+1]) {
                for (int j = i; j < arr.length-1; j++) {
                    if (arr[j] < arr[j+1]) return false;
                    more = true;
                }
            }
        }
        return less & more;
    }
    public static boolean validMountainArray(int[] arr) {
        boolean isMountain = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[i+1]) {
                if (i == 0 || i+2 == arr.length) return false;
                continue;
            }
            if (arr[i] < arr[i+1]) {
                if (i+2 == arr.length) return false;
                isMountain = true;
            } else if (arr[i] > arr[i+1]) {
                if (i == 0) return false;
            }
        }
        return isMountain;
    }
}
