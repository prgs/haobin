package com.interview.haobin.util;

/**
 * <pre>
 * A tool that facilitates various manipulation of strings
 * Author: haobin
 * Date: 2024/8/28
 * </pre>
 */
public class StringUtilsBank {
    public static void main(String[] args) {
        String input = "aabcccbbad";  // abcccbad aabcccbbbadmffffmk abcccbadffgggaaAAAA
        String output = removeConsecutiveString(input);

        System.out.println("-------------------\n");
        String input2 = "abcccbad";
        String output2 = replaceConsecutiveString(input2);
    }

    /** <pre>
     *  a given string that only contains alphabet characters a-z, if 3 or more consecutive
     *  characters are identical, remove them from the string. Repeat this process until
     *  there is no more than 3 identical characters sitting besides each other.
     *  Example:
     *  Input: aabcccbbad
     *  Output:
     *  -> aabbbad
     *  -> aaad
     *  -> d
     * </pre>
     * @author haobin
     * @date 2024/8/28
     * @param s:   a given string that only contains alphabet characters a-z
     * @return return a string which has no more than 3 identical characters sitting besides each other
     **/
    public static String removeConsecutiveString(String s) {
        // store the final string
        StringBuilder sb = new StringBuilder(s);

        // indicates whether to proceed to the next step
        boolean hasReduction = true;

        while (hasReduction) {
            hasReduction = false;
            for (int i = 0; i < sb.length() - 2; i++) {
                // Check if there are 3 or more consecutive identical characters
                if (sb.charAt(i) == sb.charAt(i + 1) && sb.charAt(i + 1) == sb.charAt(i + 2)) {
                    int j = i + 2;
                    while (j < sb.length() && sb.charAt(j) == sb.charAt(i)) {
                        j++;
                    }
                    // Remove the sequence
                    sb.delete(i, j);
                    hasReduction = true;
                    System.out.println("->  " + sb.toString());
                    break;
                }
            }
        }
        return sb.toString();
    }

    /** <pre>
     *   For a given string that only contains alphabet characters a-z, if 3 or more consecutive
     * characters are identical,  replace them with a  single character that comes before it alphabetically.
     * Repeat this process until there is no more than 3 identical characters sitting besides each other.
     * </pre>
      * @author haobin
      * @date 2024/8/28 1:36
      * @param s:    a given string that only contains alphabet characters a-z
      * @return    return a string which has no more than 3 identical characters sitting besides each other
      **/
    public static String replaceConsecutiveString(String s) {
        // store the final string
        StringBuilder sb = new StringBuilder(s);
        // indicates whether to proceed to the next step
        boolean hasContinueFlag = true;

        while (hasContinueFlag) {
            hasContinueFlag = false;
            for (int i = 0; i < sb.length() - 2; i++) {
                // Check if there are 3 or more consecutive identical characters
                if (sb.charAt(i) == sb.charAt(i + 1) && sb.charAt(i + 1) == sb.charAt(i + 2)) {
                    int j = i + 2;
                    while (j < sb.length() && sb.charAt(j) == sb.charAt(i)) {
                        j++;
                    }

                    char ch = sb.charAt(i);
                    // if the characters is 'a', remove 'a', else.  replace it by the previous character
                    if (String.valueOf(ch).equals("a")) {
                        sb.delete(i, j);
                    }
                    else {
                        sb.replace(i,j, String.valueOf(getPreviousCharacter(ch)) );
                    }

                    hasContinueFlag = true;
                    System.out.println("->  " + sb.toString());
                    break;
                }
            }
        }
        return sb.toString();
    }

    /** <pre>
     *   get the previous character, If it is character a or A, it is returned as is
     * </pre>
     * @author haobin
     * @date 2024/8/28 1:47
     * @param c:     character
     * @return :  retrun  get the previous character
     **/
    public static char getPreviousCharacter(char c) {
        // If the character is 'a' or 'A', return it as is
        if (c == 'a' || c == 'A') {
            return c;
        }

        // Otherwise, return the previous character
        return (char)(c - 1);
    }
}
