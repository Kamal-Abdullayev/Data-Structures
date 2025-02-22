package Latest.New;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PermutationOfSubstring {
    public static void main(String[] args) {
        System.out.println(isPermutationOfString("geeks", "eke"));
        System.out.println(isPermutationOfString("programming", "rain"));

    }

    public static boolean isPermutationOfString(String text, String pat) {
        boolean isPermutation = false;
        int lp = 0;
        char[] textChars = text.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> patMap = new HashMap<>();

        for (int i = 0; i < pat.length(); i++) {
            char tempChar = pat.charAt(i);
            patMap.put(tempChar, patMap.getOrDefault(tempChar, 0) + 1);
        }



        for (int rp = 0; rp < textChars.length; rp++) {
            char rightChar = textChars[rp];
            map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);

            if (rp >= pat.length() - 1) {
                if (map.equals(patMap)) {
                    isPermutation = true;
                }
                char leftChar = textChars[lp];
                map.remove(leftChar);
                lp++;
            }
        }


        return isPermutation;
    }
}
