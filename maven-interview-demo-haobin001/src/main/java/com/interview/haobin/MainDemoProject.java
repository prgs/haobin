package com.interview.haobin;

import com.interview.haobin.util.StringUtilsBank;

/**
 * <pre>
 *  This is the startup  class of the project
 * Author: haobin
 * Date: 2024/8/28
 * </pre>
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
