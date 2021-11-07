package vn.net.vac.base.c;

import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.regex.Pattern;

/* compiled from: StringUtility */
public class n {
    public static String a(String str) {
        return !b(str) ? str.replace("vac", "").replace("o", "0") : null;
    }

    public static boolean b(String str) {
        return str == null || "".equals(str);
    }

    public static String c(String str) {
        String str2 = "";
        return Pattern.compile("\\p{InCombiningDiacriticalMarks}+").matcher(Normalizer.normalize(str, Form.NFD)).replaceAll(str2).replaceAll("Đ", "D").replace("đ", str2);
    }
}
