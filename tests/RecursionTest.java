
/**
 * Unit tests for implementation of RecusionADT
 * 
 * @author Jacob Boyles
 * @version 1.0
 */

import static org.junit.Assert.*;
import org.junit.Test;

public class RecursionTest {

    /**
     * Factorial test
     */
    @Test
    public void factorialTest() {
        Recursion rec = new Recursion();
        Integer input = 10;
        Integer expected = 3628800;
        Integer actual = rec.fact(input);
        assertEquals(expected, actual);
    }

    /**
     * Factorial test 0
     */
    @Test
    public void factorialTestZero() {
        Recursion rec = new Recursion();
        Integer zero = 0;
        Integer one = 1;
        assertEquals(one, rec.fact(zero));
    }

    /**
     * Factorial test less than 0
     */
    @Test
    public void factorialLessThanZero() {
        Recursion rec = new Recursion();
        boolean throwsException = false;
        Integer negativeOne = -1;
        try {
            rec.fact(negativeOne);
        }
        catch (IllegalArgumentException e) {
            throwsException = true;
        }
        assertTrue(throwsException);
    }

    /**
     * Palindrome test more than two characters
     */
    @Test
    public void palindromeTestMoreThanTwo() {
        Recursion rec = new Recursion();
        String s = "racecar";
        boolean expected = true;
        boolean actual = rec.isPal(s);
        assertEquals(expected, actual);
    }

    /**
     * Palindrome test less than two characters
     */
    @Test
    public void palindromeTestLessThanTwo() {
        Recursion rec = new Recursion();
        String s = "a";
        boolean expected = true;
        boolean actual = rec.isPal(s);
        assertEquals(expected, actual);
    }

    /**
     * Palindrome test not a palindrome
     */
    @Test
    public void palindromeTestFail() {
        Recursion rec = new Recursion();
        String s = "fail";
        boolean expected = false;
        boolean actual = rec.isPal(s);
        assertEquals(expected, actual);
    }
}
