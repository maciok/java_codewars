package pl.pietrzam.kyu7.getsum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumTest {

    Sum s = new Sum();

    @Test
    public void Test() {
        assertEquals(-1, s.GetSum(0, -1));
        assertEquals(1, s.GetSum(0, 1));

        assertEquals(1, s.GetSum(1, 0)); // 1 + 0 = 1
        assertEquals(3, s.GetSum(1, 2)); // 1 + 2 = 3
        assertEquals(1, s.GetSum(0, 1)); // 0 + 1 = 1
        assertEquals(1, s.GetSum(1, 1)); // 1 Since both are same
        assertEquals(-1, s.GetSum(-1, 0)); // -1 + 0 = -1
        assertEquals(2, s.GetSum(-1, 2)); // -1 + 0 + 1 + 2 = 2   
    }

}
