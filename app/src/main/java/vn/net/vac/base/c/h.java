package vn.net.vac.base.c;

import android.content.Context;

/* compiled from: KeyUtility */
public class h {
    private static h b;
    private Context a;

    public h(Context context) {
        this.a = context;
    }

    public static h a(Context context) {
        if (b == null) {
            b = new h(context);
        }
        return b;
    }

    public String a() {
        return k.a(this.a).b();
    }
}
