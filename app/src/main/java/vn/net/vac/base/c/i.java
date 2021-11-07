package vn.net.vac.base.c;

import android.util.Log;

/* compiled from: Logger */
public class i {
    public static void a(Object obj) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("test: ");
        stringBuilder.append(obj);
        Log.e("Hakaru", stringBuilder.toString());
    }
}
