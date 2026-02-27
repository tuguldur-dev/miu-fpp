package Assignment3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Prob4Test {
    Prob4 prob4 = new Prob4();

    @Test
    void findMax() {
        int[] array = {5, -3, 6, 1, 9, 4};
        int op = prob4.findMax(array, 0);
        int eop = 9;
        assertEquals(eop, op);
    }
}