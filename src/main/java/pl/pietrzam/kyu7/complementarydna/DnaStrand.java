package pl.pietrzam.kyu7.complementarydna;

class DnaStrand {
    public static String makeComplement(final String dna) {
        final StringBuilder sb = new StringBuilder();

        for (char symbol : dna.toCharArray()) {
            switch (symbol) {
                case 'A':
                    sb.append('T'); break;
                case 'T':
                    sb.append('A'); break;
                case 'C':
                    sb.append('G'); break;
                case 'G':
                    sb.append('C'); break;
                default:
                    throw new IllegalArgumentException("Unknown symbol " + symbol);
            }
        }

        return sb.toString();
    }
}
