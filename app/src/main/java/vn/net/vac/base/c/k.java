package vn.net.vac.base.c;

import android.content.Context;
import android.content.SharedPreferences.Editor;

/* compiled from: MySharedPreferences */
public class k {
    private static k b;
    private Context a;

    public k(Context context) {
        this.a = context;
    }

    public static k a(Context context) {
        if (b == null) {
            b = new k(context);
        }
        return b;
    }

    public void b(boolean z) {
        a("IS_FINISH_FIRST_THUOC_LO_BAN", z);
    }

    public int c(String str) {
        return b(str);
    }

    public boolean d() {
        return a("IS_PREMIUM");
    }

    public void e() {
        a("IS_PREMIUM", true);
    }

    public void f(String str) {
        a(str, c(str) + 1);
    }

    public String b() {
        return d("MY_ID");
    }

    public boolean c() {
        return a("IS_12H");
    }

    public String d(String str) {
        return this.a.getSharedPreferences("HAKARU_CROSS_PREFERENCES", 0).getString(str, "");
    }

    public void e(String str) {
        a("MY_ID", str);
    }

    public int b(String str) {
        return this.a.getSharedPreferences("HAKARU_CROSS_PREFERENCES", 0).getInt(str, 0);
    }

    public void c(boolean z) {
        a("IS_FROM_BACKGROUND", z);
    }

    public void a(boolean z) {
        a("IS_12H", z);
    }

    public void a(String... strArr) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(strArr[0]);
        String str = "/";
        stringBuilder.append(str);
        stringBuilder.append(strArr[1]);
        stringBuilder.append(str);
        stringBuilder.append(strArr[2]);
        a("BIRTH_DAY", stringBuilder.toString());
    }

    public String[] a() {
        String d = d("BIRTH_DAY");
        if (!n.b(d)) {
            return d.split("/");
        }
        return new String[]{"01", "00", "1990"};
    }

    public void a(String str, int i) {
        Editor edit = this.a.getSharedPreferences("HAKARU_CROSS_PREFERENCES", 0).edit();
        edit.putInt(str, i);
        edit.commit();
    }

    public void a(String str, String str2) {
        Editor edit = this.a.getSharedPreferences("HAKARU_CROSS_PREFERENCES", 0).edit();
        edit.putString(str, str2);
        edit.commit();
    }

    public void a(String str, boolean z) {
        Editor edit = this.a.getSharedPreferences("HAKARU_CROSS_PREFERENCES", 0).edit();
        edit.putBoolean(str, z);
        edit.commit();
    }

    public boolean a(String str) {
        return this.a.getSharedPreferences("HAKARU_CROSS_PREFERENCES", 0).getBoolean(str, false);
    }
}
