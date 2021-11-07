package vn.net.vac.base.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.fragment.app.h;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager.j;
import butterknife.Bind;
import butterknife.ButterKnife;
import com.h2team.android.lichvannien.R;
import vn.net.vac.base.c.g;
import vn.net.vac.base.view.viewpagerindicator.CirclePageIndicator;

public class GiaithichQuangcaoActivity extends BaseActivity {
    private ViewPager n;
    private CirclePageIndicator o;
    @Bind({2131230771})
    Button p;
    @Bind({2131230774})
    View q;

    class b implements OnClickListener {
        b() {
        }

        @SuppressLint({"InlinedApi"})
        public void onClick(View view) {
            GiaithichQuangcaoActivity.this.onBackPressed();
        }
    }

    class c implements OnClickListener {
        c() {
        }

        @SuppressLint({"InlinedApi"})
        public void onClick(View view) {
            GiaithichQuangcaoActivity.this.onBackPressed();
        }
    }

    class a implements j {
        a() {
        }

        public void a(int i) {
        }

        public void a(int i, float f, int i2) {
        }

        public void b(int i) {
            if (i == 2) {
                GiaithichQuangcaoActivity.this.p.setVisibility(0);
            } else {
                GiaithichQuangcaoActivity.this.p.setVisibility(4);
            }
        }
    }

    private class d extends h {
        String[] f;
        String[] g;

        public d(GiaithichQuangcaoActivity giaithichQuangcaoActivity, e eVar) {
            super(eVar);
            this.f = giaithichQuangcaoActivity.getResources().getStringArray(R.array.giaithich_quangcao_title_vn);
            this.g = giaithichQuangcaoActivity.getResources().getStringArray(R.array.giaithich_quangcao_cotent_vn);
        }

        public int a() {
            return 3;
        }

        public Fragment c(int i) {
            if (i == 0) {
                return vn.net.vac.base.view.fragment.a.a((int) R.drawable.mobile510_ads_thumb0, this.f[i], this.g[i]);
            }
            if (i != 1) {
                return i != 2 ? null : vn.net.vac.base.view.fragment.a.a((int) R.drawable.mobile510_ads_thumb2, this.f[i], this.g[i]);
            } else {
                return vn.net.vac.base.view.fragment.a.a((int) R.drawable.mobile510_ads_thumb1, this.f[i], this.g[i]);
            }
        }
    }

    private void q() {
        this.o.setViewPager(this.n);
        this.o.setOnPageChangeListener(new a());
        this.p.setOnClickListener(new b());
        this.q.setOnClickListener(new c());
    }

    private void r() {
        g.a((Context) this, 12, this.p);
    }

    private void s() {
        this.n = (ViewPager) findViewById(R.id.pager);
        this.o = (CirclePageIndicator) findViewById(R.id.indicator);
        this.n.setAdapter(new d(this, c()));
        this.p.setText("Tôi đã hiểu");
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_giaithich_quangcao);
        ButterKnife.bind((Activity) this);
        s();
        q();
        r();
    }
}
