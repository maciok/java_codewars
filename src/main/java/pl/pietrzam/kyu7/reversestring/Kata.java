package pl.pietrzam.kyu7.reversestring;

class Kata {
    public static String solution(final String str) {
        final char[] chars = str.toCharArray();

        final int length = chars.length;

        for (int i = 0, j = length - 1; i < length / 2; i++, j--) {
            char tmp = chars[i];
            chars[i] = chars[j];
            chars[j] = tmp;
        }

        new StringBuilder("").reverse();
        return new String(chars);
    }
}
