package pl.andrzejrawski.Utils;

public class StrUtils {

    public static String removeLastSeparator (String text, String separator) {
        return text.substring(0, text.lastIndexOf(separator));
    }

    public static String decode (String text) {
        text.replace("ZX11", "a");
        text.replace("ZX22", "e");
        text.replace("ZX33", "i");
        text.replace("ZX44", "o");
        text.replace("ZX55", "u");
        text.replace("ZX66", "y");
        text.replace("ZX77", "ó");
        text.replace("ZX88", " ");
        return text;
    }
}
