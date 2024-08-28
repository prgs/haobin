package com.interview.haobin;

import com.interview.haobin.util.StringUtilsBank;

/**
 * Hello world!
 *
 */
public class MainDemoProject
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String input = "aabcccbbad";  // abcccbad aabcccbbbadmffffmk abcccbadffgggaaAAAA
        StringUtilsBank.removeConsecutiveString(input);

        System.out.println("\n");

        String input2 = "abcccbad";
        StringUtilsBank.replaceConsecutiveString(input2);
    }
}
