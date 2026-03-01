package lesson5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void binarySearch() {
        int[] check = {1, 2, 3, 4, 5, 6, 7, 8};

        int op = Main.BinarySearch(check, 6, 0, check.length);
        int eop = 5;
        assertEquals(eop, op);
    }

}