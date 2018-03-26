package pl.pietrzam.kyu7.vowels;

import java.util.HashSet;
import java.util.Set;

class Vowels {

    private static Set<Integer> VOWELS = new HashSet<>(5);

    static {
        VOWELS.add((int) 'a');
        VOWELS.add((int) 'e');
        VOWELS.add((int) 'i');
        VOWELS.add((int) 'o');
        VOWELS.add((int) 'u');
    }

    public static int getCount(final String str) {
        return (int) str.chars()
                            .filter(i -> VOWELS.contains(i))
                            .count();
    }
}
