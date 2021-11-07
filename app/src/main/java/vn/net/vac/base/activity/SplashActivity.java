package vn.net.vac.base.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.h2team.android.lichvannien.R;
import vn.net.vac.base.c.j;
import vn.net.vac.base.c.k;
import vn.net.vac.base.c.n;

public class SplashActivity extends BaseActivity {

    class a implements Runnable {
        a() {
        }

        public void run() {
            Intent intent = new Intent(SplashActivity.this, LichVanNienLichNgayActivity2.class);
            intent.putExtra("FROM_ACTIVITY", "SplashActivity");
            SplashActivity.this.startActivity(intent);
            SplashActivity.this.finish();
        }
    }

    static {
        System.loadLibrary("native-lib");
    }

    private void q() {
    }

    private void r() {
        if (n.b(k.a((Context) this).b())) {
            k.a((Context) this).e(j.a(n.a(stringFromJNI())));
        }
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_splash);
        q();
        r();
        k.a(getBaseContext()).b(false);
        sendBroadcast(new Intent("vn.net.vac.android.lichvannien.intent.action.UPDATE_WIDGET"));
        new Handler().postDelayed(new a(), 2000);
    }

    public native String stringFromJNI();
}
