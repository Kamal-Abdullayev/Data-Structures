package Latest.New;

import java.util.HashMap;
import java.util.Map;

public class SmallestSubArrayContainsText {
    public static void main(String[] args) {
        System.out.println(smallestSubArray("aabcbcdbca", 3));
        System.out.println(smallestSubArray("aaahhibc", 3));
    }

    public static int smallestSubArray(String text, int k) {
        int maxLength = 0;
        int lp = 0;
        Map<Character, Integer> map = new HashMap<>();

        char[] textLetters = text.toCharArray();
        for (int rp = 0; rp < textLetters.length; rp++) {
            char rightChar = textLetters[rp];
            map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);

            while (map.size() > k) {
                char leftChar = textLetters[lp];
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                lp++;
            }
            maxLength = Math.max(maxLength, rp - lp + 1);
        }

        return maxLength;
    }
}
