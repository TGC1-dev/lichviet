package vn.net.vac.base.c;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.os.Environment;
import android.view.View;
import java.io.File;
import java.io.FileOutputStream;

/* compiled from: ShareUtility */
public class m {
    private Activity a;

    public m(Activity activity) {
        this.a = activity;
    }

    private void b() {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(Environment.getExternalStorageDirectory().toString());
            stringBuilder.append("/tu_vi.jpg");
            String stringBuilder2 = stringBuilder.toString();
            View rootView = this.a.getWindow().getDecorView().getRootView();
            rootView.setDrawingCacheEnabled(true);
            Bitmap createBitmap = Bitmap.createBitmap(rootView.getDrawingCache());
            rootView.setDrawingCacheEnabled(false);
            File file = new File(stringBuilder2);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            createBitmap.compress(CompressFormat.JPEG, 50, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            a(file);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void a() {
        b();
    }

    private void a(File file) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("image/*");
        intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
        intent.putExtra("android.intent.extra.SUBJECT", "http://vac.net.vn/");
        String str = "";
        intent.putExtra("android.intent.extra.TEXT", str);
        int i = 0;
        for (ResolveInfo resolveInfo : this.a.getPackageManager().queryIntentActivities(intent, 0)) {
            if (resolveInfo.activityInfo.packageName.toLowerCase().startsWith("com.facebook.katana")) {
                intent.setPackage(resolveInfo.activityInfo.packageName);
                i = 1;
                break;
            }
        }
        if (i == 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("https://www.facebook.com/sharer/sharer.php?u=");
            stringBuilder.append(str);
            intent = new Intent("android.intent.action.VIEW", Uri.parse(stringBuilder.toString()));
        }
        this.a.startActivity(intent);
    }

    public void a(String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SENDTO");
        intent.setData(Uri.fromParts("mailto", str3, null));
        intent.putExtra("android.intent.extra.SUBJECT", str);
        intent.putExtra("android.intent.extra.TEXT", str2);
        this.a.startActivityForResult(intent, 0);
    }
}
