package Latest;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstring {

    public static void main(String[] args) {
        System.out.println(longestSubstring("geeksforgeeks"));
        System.out.println(longestSubstring("aaa"));
        System.out.println(longestSubstring("abcdefabcbb"));
    }

    public static int longestSubstring(String text) {
        if (text.isEmpty()) {
            return 0;
        }

        char[] chars = text.toCharArray();
        int lp = 0;
        int count = 0;
        int tempCount = 0;
        List<Character> charList = new ArrayList<>();

        for (int rp = 0; rp < chars.length; rp++) {
            if (!charList.contains(chars[rp])) {
                charList.add(chars[rp]);
                tempCount++;
            } else {
                count = Math.max(count, tempCount);
                rp = lp;
                lp++;
                tempCount = 0;
                charList = new ArrayList<>();
            }
        }

        return count;
    }
}
