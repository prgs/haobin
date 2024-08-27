package com.hsbc.interview.haobin;

import com.hsbc.interview.util.StringUtilsHsbc;
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
public class StringUtilsHsbcTest {
    @Test
    public void testRemoveConsecutiveString() {
        String input = "aabcccbbad";  // abcccbad aabcccbbbadmffffmk abcccbadffgggaaAAAA
        String output = StringUtilsHsbc.removeConsecutiveString(input);
        assertEquals(output, "d");
    }

    @Test
    public void testReplaceConsecutiveString() {
        String input = "abcccbad";
        String output = StringUtilsHsbc.replaceConsecutiveString(input);
        assertEquals(output, "d");
    }
}
