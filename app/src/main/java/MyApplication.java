package vn.net.vac.base;

import android.app.Application;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import c.d.a.b.d;
import c.d.a.b.e.b;
import c.d.a.b.j.g;
import com.activeandroid.ActiveAndroid;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.c;
import com.google.android.gms.ads.e;
import com.google.android.gms.ads.f;
import com.google.android.gms.ads.k;
import com.h2team.android.lichvannien.R;

public class MyApplication extends Application {
    private String a;
    k b;
    AdView c;
    e d;
    public int e = 0;
    public long f = 0;

    class a extends c {
        a() {
        }

        public void J() {
            MyApplication.this.g();
        }
    }

    private void d() {
        com.google.android.gms.ads.e.a aVar = new com.google.android.gms.ads.e.a();
        aVar.b("B3EEABB8EE11C2BE770B684D95219ECB");
        this.d = aVar.a();
    }

    private void e() {
        this.c = new AdView(this);
        this.c.setAdSize(f.m);
        this.c.setAdUnitId(getString(R.string.admob_code));
    }

    private void f() {
        this.b = new k(this);
        this.b.a(getString(R.string.fullscreen_admob_code));
        this.b.a(new a());
        g();
    }

    private void g() {
        if (!this.b.c() && !this.b.b()) {
            this.b.a(this.d);
        }
    }

    public String b() {
        return this.a;
    }

    public void c() {
        if (!vn.net.vac.base.c.k.a((Context) this).d()) {
            k kVar = this.b;
            if (kVar == null || !kVar.b()) {
                g();
            } else {
                this.b.d();
            }
        }
    }

    public void onCreate() {
        super.onCreate();
        ActiveAndroid.initialize((Context) this);
        d();
        e();
        f();
        a(getApplicationContext());
    }

    public AdView a() {
        return this.c;
    }

    public void a(String str) {
        this.a = str;
    }

    public void a(LinearLayout linearLayout) {
        if (!vn.net.vac.base.c.k.a((Context) this).d()) {
            this.c.a(this.d);
            if (this.c.getParent() != null) {
                ((ViewGroup) this.c.getParent()).removeView(this.c);
            }
            linearLayout.addView(this.c);
        }
    }

    public static void a(Context context) {
        b bVar = new b(context);
        bVar.b(3);
        bVar.b();
        bVar.a(new c.d.a.a.a.c.c());
        bVar.a(52428800);
        bVar.a(g.LIFO);
        d.b().a(bVar.a());
    }
}
