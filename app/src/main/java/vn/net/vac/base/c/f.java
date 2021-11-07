package vn.net.vac.base.c;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: FileUtility */
public class f {
    private static f b;
    private Context a;

    public f(Context context) {
        this.a = context;
    }

    public static f a(Context context) {
        if (b == null) {
            b = new f(context);
        }
        return b;
    }

    public String a(String str) {
        try {
            InputStream open = this.a.getAssets().open(str);
            byte[] bArr = new byte[open.available()];
            open.read(bArr);
            open.close();
            return new String(bArr, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
