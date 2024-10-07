/*
* You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1.
* If a string is longer than the other, append the additional letters onto the end of the merged string.
Return the merged string.
* */

package leetCode_studyCourse;

public class MergeStringAlternatively {
    public static void main(String[] args) {
        System.out.println(new MergeStringAlternatively().mergeAlternately("abcxzc","defplmkonj"));
    }
    public String mergeAlternately(String word1, String word2) {
        char[] charOfWord1 = word1.toCharArray();
        char[] charOfWord2 = word2.toCharArray();
        String output = "";

        int len = Math.max(word1.length(), word2.length());
        for (int i=0 ; i<len ; i++) {
            String char1 = i<charOfWord1.length ? charOfWord1[i]+"" : "";
            String char2 = i<charOfWord2.length ? charOfWord2[i]+"" : "";
            output += char1 + char2;
        }
        return output;
    }
}
