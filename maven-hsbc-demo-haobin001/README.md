

Dear Interviewer,

Hello, This project is a Java Maven project that supports JDK 11.

The **com.hsbc.interview.util.StringUtilsHsbc**.java  is my provided solution. The first step is implemented by `StringUtilsHsbc#removeConsecutiveString()`

​	

```java
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
```



and the second step is implemented by `com.hsbc.interview.util.StringUtilsHsbc#replaceConsecutiveString()`.

```java
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
```



The test Class is  com.hsbc.interview.haobin.StringUtilsHsbcTest

```java
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
```



You can also start the project using the following command. Once the project is up and running, it will automatically invoke the methods in the StringUtilsHsbc class to complete the tests.

```commonlisp
mvn clean compile package
java -jar .\target\maven-hsbc-demo-haobin001-1.0-SNAPSHOT.jar
```

