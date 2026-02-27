package Assignment3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Prob3Test {
    Prob3 prob3 = new Prob3();
    @Test
    void isPalindromeTest1() {
        boolean op = prob3.IsPalindrome(121);
        boolean eop = true;
        assertEquals(eop, op);
    }

    @Test
    void isPalindromeTest2() {
        boolean op = prob3.IsPalindrome(1213);
        boolean eop = false;
        assertEquals(eop, op);
    }
}