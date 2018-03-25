package pl.pietrzam.kyu6.extractfilename;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class FileNameExtractor {

    private static final Pattern FILE_NAME_PATTERN = Pattern.compile("^\\d*_(.*?).\\w*$");

    public static String extractFileName(String dirtyFileName) {
        Matcher matcher = FILE_NAME_PATTERN.matcher(dirtyFileName);

        if (matcher.find()) {
            return matcher.group(1);
        }

        throw new RuntimeException("Could not find file name");
    }
}
