package com.interview.haobin;

import com.interview.haobin.util.StringUtilsBank;

/**
 * This is the startup  class of the project
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
