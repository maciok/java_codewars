package pl.pietrzam.kyu7.vowels;

import java.util.regex.Pattern;

class Vowels {

    private static final Pattern VOWELS_PATTERN = Pattern.compile("(?i)[^aeiou]");
    
    public static int getCount(final String str) {
        return VOWELS_PATTERN.matcher(str)
                             .replaceAll("")
                             .length();
    }
}
