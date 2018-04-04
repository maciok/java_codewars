package pl.pietrzam.kyu7.complementarydna;

class DnaStrand {
    public static String makeComplement(final String dna) {
        final StringBuilder sb = new StringBuilder();

        for (char symbol : dna.toCharArray()) {
            if (symbol == 'A')
                sb.append('T');
            else if (symbol == 'T')
                sb.append('A');
            else if (symbol == 'C')
                sb.append('G');
            else if (symbol == 'G')
                sb.append('C');
            else
                throw new IllegalArgumentException("Unknown symbol " + symbol);
        }

        return sb.toString();
    }
}
