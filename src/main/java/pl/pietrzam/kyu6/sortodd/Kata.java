package pl.pietrzam.kyu6.sortodd;

import java.util.stream.IntStream;

public class Kata {
    public static int[] sortArray(int[] array) {
        final int[] sortedOdds = IntStream.of(array)
                .filter(Kata::isOdd)
                .sorted()
                .toArray();

        for (int i = 0, j = 0; i < array.length; i++) {
            if (isOdd(array[i])) {
                array[i] = sortedOdds[j];
                j++;
            }
        }

        return array;
    }

    private static boolean isOdd(final int i) {
        return i % 2 != 0;
    }
}