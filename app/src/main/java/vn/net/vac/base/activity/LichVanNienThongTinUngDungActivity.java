package vn.net.vac.base.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.lib.widget.verticalmarqueetextview.VerticalMarqueeTextView;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Bind;
import butterknife.ButterKnife;
import com.h2team.android.lichvannien.R;
import vn.net.vac.base.c.g;

public class LichVanNienThongTinUngDungActivity extends BaseActivity {
    @Bind({2131230960})
    TextView n;
    @Bind({2131231120})
    TextView o;
    @Bind({2131230970})
    LinearLayout p;
    @Bind({2131231099})
    TextView q;
    @Bind({2131231102})
    VerticalMarqueeTextView r;
    @Bind({2131231117})
    TextView s;
    @Bind({2131231118})
    TextView t;
    @Bind({2131231105})
    TextView u;

    class a implements OnClickListener {
        a() {
        }

        public void onClick(View view) {
            LichVanNienThongTinUngDungActivity lichVanNienThongTinUngDungActivity = LichVanNienThongTinUngDungActivity.this;
            lichVanNienThongTinUngDungActivity.b(lichVanNienThongTinUngDungActivity.getString(R.string.url_home));
        }
    }

    private void b(String str) {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    private String q() {
        try {
            return getPackageManager().getPackageInfo(getPackageName(), 128).versionName;
        } catch (NameNotFoundException unused) {
            return "";
        }
    }

    private void r() {
        this.t.setOnClickListener(new a());
    }

    private void s() {
        this.s.setText(String.format("Phiên bản: %s", new Object[]{q()}));
        this.t.setText(Html.fromHtml("Website: <font color=#0000ff><i><u>vac.net.vn<u></i></font>"));
        this.u.setText(Html.fromHtml("Nhà phát triển: <b>VAC Co.</b>"));
    }

    private void t() {
        g.a((Context) this, this.p, 12);
        g.b(this, 11, this.q);
        g.a((Context) this, this.r, 12);
        g.b(this, 14, this.n);
        g.b(this, 11, this.o);
    }

    private void u() {
        a(R.drawable.btn_back, "THÔNG TIN ỨNG DỤNG", 0);
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_lich_van_nien_thongtin_ungdung);
        ButterKnife.bind((Activity) this);
        u();
        s();
        r();
        t();
    }
}
