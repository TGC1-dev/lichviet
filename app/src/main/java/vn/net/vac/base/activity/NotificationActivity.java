package vn.net.vac.base.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import vn.net.vac.base.MyApplication;
import vn.net.vac.base.c.i;
import vn.net.vac.base.c.n;

public class NotificationActivity extends Activity {
    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String b = ((MyApplication) getApplication()).b();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("lastActivity: ");
        stringBuilder.append(b);
        i.a(stringBuilder.toString());
        if (n.b(b)) {
            startActivity(new Intent(this, SplashActivity.class));
        }
        finish();
    }
}
