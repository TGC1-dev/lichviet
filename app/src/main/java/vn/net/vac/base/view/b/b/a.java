package vn.net.vac.base.view.b.b;

/* compiled from: StringMatcher */
public class a {
    private static final char[] a = new char[]{12593, 12594, 12596, 12599, 12600, 12601, 12609, 12610, 12611, 12613, 12614, 12615, 12616, 12617, 12618, 12619, 12620, 12621, 12622};

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0059 A:{SYNTHETIC, EDGE_INSN: B:28:0x0059->B:23:0x0059 ?: BREAK  } */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0059 A:{SYNTHETIC, EDGE_INSN: B:28:0x0059->B:23:0x0059 ?: BREAK  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(String str, String str2) {
        boolean z = false;
        if (!(str == null || str2 == null)) {
            if (str2.length() > str.length()) {
                return false;
            }
            int i = 0;
            int i2 = 0;
            do {
                if (!c(str.charAt(i)) || !b(str2.charAt(i2))) {
                    if (str2.charAt(i2) != str.charAt(i)) {
                        if (i2 > 0) {
                            break;
                        }
                        i++;
                        if (i >= str.length()) {
                            break;
                        }
                    }
                } else if (str2.charAt(i2) != a(str.charAt(i))) {
                    if (i2 > 0) {
                        break;
                    }
                    i++;
                    if (i >= str.length()) {
                    }
                }
                i++;
                i2++;
                if (i >= str.length()) {
                }
            } while (i2 < str2.length());
            if (i2 == str2.length()) {
                z = true;
            }
        }
        return z;
    }

    private static boolean b(char c) {
        for (char c2 : a) {
            if (c == c2) {
                return true;
            }
        }
        return false;
    }

    private static boolean c(char c) {
        return c >= 44032 && c <= 55203;
    }

    private static char a(char c) {
        if (c(c)) {
            return a[(c - 44032) / 588];
        }
        return c;
    }
}
