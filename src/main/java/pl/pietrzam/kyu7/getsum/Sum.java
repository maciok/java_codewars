package pl.pietrzam.kyu7.getsum;

public class Sum {
    public int GetSum(final int a, final int b) {
        return (a + b) * (Math.abs(a - b) + 1) / 2;
    }
}