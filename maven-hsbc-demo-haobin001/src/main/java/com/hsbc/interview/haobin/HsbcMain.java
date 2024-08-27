package com.hsbc.interview.haobin;

import com.hsbc.interview.util.StringUtilsHsbc;

/**
 * Hello world!
 *
 */
public class HsbcMain
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String input = "aabcccbbad";  // abcccbad aabcccbbbadmffffmk abcccbadffgggaaAAAA
        StringUtilsHsbc.removeConsecutiveString(input);

        System.out.println("\n");

        String input2 = "abcccbad";
        StringUtilsHsbc.replaceConsecutiveString(input2);
    }
}
