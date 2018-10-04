package personal.nvhung.src.utilities;

import java.text.Normalizer;
import java.util.regex.Pattern;

public class UrlUtil {

    public static String convertTitleToUrl(String s) {

        String temp = Normalizer.normalize(s, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(temp).replaceAll("")
                .replace("đ", "d")
                .replace("Đ", "D")
                .replace(" ", "-");
    }
}
