package Arrays;

import java.util.Arrays;

/*
Anagram problem exercise

Your task is to construct an algorithm to check whether two words (or phrases) are anagrams or not!
"An anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once"
 */
public class Anagram {
    public static void main(String[] args) {

        char[] s1 = "restful".toCharArray();
        char[] s2 = "flutser".toCharArray();

        System.out.println(solve(s1, s2));

    }

    public static boolean solve(char[] s1, char[] s2) {

        // you get the s1 and s2 strings (char sequences) and you have to return true
        // (if they are anagram) or false otherwise

        if(s1.length != s2.length) {
            return false;
        }

        Arrays.sort(s1);
        Arrays.sort(s2);
        for(int i = 0; i < s1.length; i++) {
            if(s1[i] != s2[i]) {
                return false;
            }
        }

        return true;
    }

}
