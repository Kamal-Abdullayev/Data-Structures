package Arrays;

public class ReverseInteger {

    public static void main(String[] args) {

        System.out.println(reverse(1234));
    }

    public static int reverse(int n) {

        int reversed = 0;
        int remainder = 0;

        // algorithm here
        while(n > 0) {
            remainder = n % 10;
            reversed = reversed * 10 + remainder ;
            n/=10;
        }

        return reversed;
    }
}
