package pl.pietrzam.kyu7.squareeverydigit;

import java.math.BigDecimal;
import java.math.BigInteger;

class SquareDigit {

    public int squareDigits(int n) {
        final int p = BigDecimal.valueOf(n).precision();
        final StringBuilder r = new StringBuilder();

        int scale = BigInteger.TEN
                              .pow(p - 1)
                              .intValue();

        for (int i = 0; i < p; i++) {
            final int v = n / scale;
            final int square = v * v;

            r.append(square);
            n -= v * scale;
            scale /= 10;
        }

        return Integer.parseInt(r.toString());
    }
}