package ex01_arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayOfIntsEvenTest {

    @Test
    void sumOfEven_happyflow() {
        ArrayOfInts arrayOfInts = new ArrayOfInts();
        int sumOfEven = arrayOfInts.sumOfEven(new int[] {1,2,3,4});

        assertEquals(6,sumOfEven);
    }

    @Test
    void sumOfEven_null() {
        ArrayOfInts arrayOfInts = new ArrayOfInts();
        int sumOfEven = arrayOfInts.sumOfEven(null);

        assertEquals(0,sumOfEven);
    }

    @Test
    void sumOfEven_empty() {
        ArrayOfInts arrayOfInts = new ArrayOfInts();
        int sumOfEven = arrayOfInts.sumOfEven(new int[] {});

        assertEquals(0,sumOfEven);
    }

    @Test
    void sumOfEven_OnlyOdd() {
        ArrayOfInts arrayOfInts = new ArrayOfInts();
        int sumOfEven = arrayOfInts.sumOfEven(new int[] {5,7,9});

        assertEquals(0,sumOfEven);
    }
}