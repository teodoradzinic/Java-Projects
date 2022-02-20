import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class SumOfTwoTest {
    @Test
    void subtractSetAValuesFromV() {
        var sum = new SumOfTwo();
        HashSet<Integer> a = new HashSet<>();
        HashSet<Integer> b = new HashSet<>();

        a.add(1);
        a.add(2);
        a.add(3);

        b.add(10);
        b.add(20);
        b.add(30);
        b.add(40);

        assertTrue(sum.sumOfTwo(a, b, 42) == true);

    }

    @Test
    void subtractSecondSetAValuesFromV() {
        var sum = new SumOfTwo();
        HashSet<Integer> a = new HashSet<>();
        HashSet<Integer> b = new HashSet<>();

        a.add(0);
        a.add(0);
        a.add(-5);
        a.add(30212);

        b.add(-10);
        b.add(40);
        b.add(-3);
        b.add(9);

        assertTrue(sum.sumOfTwo(a, b, -8) == true);

    }
}