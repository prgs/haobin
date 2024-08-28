package com.interview.haobin;

import com.interview.haobin.util.StringUtilsBank;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * <pre>
 * Description:
 * Author: haobin
 * Date: 2024/8/28
 * </pre>
 */
public class StringUtilsBankTest {
    @Test
    public void testRemoveConsecutiveString() {
        String input = "aabcccbbad";  // abcccbad aabcccbbbadmffffmk abcccbadffgggaaAAAA
        String output = StringUtilsBank.removeConsecutiveString(input);
        assertEquals(output, "d");
    }

    @Test
    public void testReplaceConsecutiveString() {
        String input = "abcccbad";
        String output = StringUtilsBank.replaceConsecutiveString(input);
        assertEquals(output, "d");
    }
}
