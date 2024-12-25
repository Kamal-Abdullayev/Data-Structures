package Arrays;

import java.util.Arrays;

public class DuplicateZeros {
    // 1089. Duplicate Zeros
    public static void main(String[] args) {
//        myWay(new int[] { 1, 0, 2, 3, 0, 4, 5, 0 });
        myWayModified(new int[] {1,0,2,3,0,4,5,0});

    }

    public static void myWayModified(int[] arr) {
        int n = 0;
        int[] oldaArr = arr;

        arr = new int[oldaArr.length];
        for (int i = 0; i < oldaArr.length-1; i++) {
            if (oldaArr[i] == 0) {
                arr[i+n] = oldaArr[i];
                n++;
            }
            if (i+n <= oldaArr.length-1) {
                arr[i+n] = oldaArr[i];
            }

        }

        System.out.println(Arrays.toString(arr));

    }

    public static void myWay(int[] arr) {
        int n = 0;


        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == 0) {
                newArr[i+n] = arr[i];
                n++;
            }
            if (i+n <= arr.length-1) {
                newArr[i+n] = arr[i];
            }

        }

        System.out.println(Arrays.toString(newArr));

    }

    public static void duplicateZeros(int[] arr) {
        int count = 0;

        for (int a : arr) {
            if (a == 0) {
                ++count;
            }
        }
        for (int i = arr.length - 1, j = arr.length + count - 1; i < j; --i, --j) {
            System.out.println(i + "\t" + j);
            if (j < arr.length)
                arr[j] = arr[i];
            if (arr[i] == 0)
                if (--j < arr.length)
                    arr[j] = arr[i];

        }



        System.out.println(Arrays.toString(arr));
    }

    

}
