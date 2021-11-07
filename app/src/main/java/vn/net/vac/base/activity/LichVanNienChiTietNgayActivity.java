package vn.net.vac.base.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Bind;
import butterknife.ButterKnife;
import com.h2team.android.lichvannien.R;
import java.util.Calendar;
import vn.net.vac.base.c.a.a;
import vn.net.vac.base.c.g;
import vn.net.vac.base.c.h;
import vn.net.vac.base.dbmanager.model.ThapNhiTinhBatTu;

public class LichVanNienChiTietNgayActivity extends BaseActivity {
    int n;
    int o;
    int p;
    int q;
    @Bind({2131230960})
    TextView r;
    @Bind({2131231101})
    TextView s;
    @Bind({2131231100})
    TextView t;
    @Bind({2131231107})
    TextView u;
    @Bind({2131231106})
    TextView v;
    @Bind({2131230978})
    LinearLayout w;
    String[] x = new String[]{"Ngày Hắc Đạo", "Ngày Hoàng Đạo"};

    private void q() {
    }

    private void r() {
        String format;
        this.s.setText(String.format("%s, Ngày %d Tháng %d Năm %d", new Object[]{a.k(this.p, this.o, this.n), Integer.valueOf(this.p), Integer.valueOf(this.o), Integer.valueOf(this.n)}));
        if (-1 != a.s(this.p, this.o, this.n)) {
            format = String.format("Ngày %d Tháng %d Năm %d (%s)", new Object[]{Integer.valueOf(a.u(this.p, this.o, this.n)[0]), Integer.valueOf(a.u(this.p, this.o, this.n)[1]), Integer.valueOf(a.u(this.p, this.o, this.n)[2]), this.x[a.s(this.p, this.o, this.n)]});
        } else {
            format = String.format("Ngày %d Tháng %d Năm %d", new Object[]{Integer.valueOf(a.u(this.p, this.o, this.n)[0]), Integer.valueOf(a.u(this.p, this.o, this.n)[1]), Integer.valueOf(a.u(this.p, this.o, this.n)[2])});
        }
        String format2 = String.format("Giờ %s (%dh%d) - Ngày %s - Tháng %s - Năm %s", new Object[]{a.b(this.q, this.p, this.o, this.n), Integer.valueOf(this.q), Integer.valueOf(Calendar.getInstance().get(12)), a.g(this.p, this.o, this.n), a.j(this.p, this.o, this.n), a.e(this.p, this.o, this.n)});
        String c = a.c(this.p, this.o, this.n);
        this.t.setText(String.format("Ngày Âm Lịch: %s\nNgày Bát Tự: %s \nGiờ Hoàng Đạo: %s", new Object[]{format, format2, c}));
        ThapNhiTinhBatTu d = vn.net.vac.base.b.a.d(a.h(this.p, this.o, this.n).split("\\.")[0]);
        try {
            d.b = vn.net.vac.base.c.e.a.a(d.b, h.a(this).a());
        } catch (Exception e) {
            e.printStackTrace();
            d.b = "";
        }
        this.v.setText(String.format("%s\nTiết Khí: %s\nSao:%s\n%s", new Object[]{a.m(this.p, this.o, this.n), a.l(this.p, this.o, this.n), a.h(this.p, this.o, this.n).split(format2)[1], Html.fromHtml(d.b)}));
    }

    private void s() {
        g.a((Context) this, this.w, 12);
        g.a((Context) this, 14, this.r);
        g.a((Context) this, 11, this.s);
        g.a((Context) this, 11, this.u);
    }

    private void t() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.n = extras.getInt("EXTRA_YEAR");
            this.o = extras.getInt("EXTRA_MOTH");
            this.p = extras.getInt("EXTRA_DAY");
        }
        this.q = Calendar.getInstance().get(11);
    }

    private void u() {
        a(R.drawable.btn_back, "CHI TIẾT NGÀY", 0);
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_lich_van_nien_chi_tiet_ngay);
        ButterKnife.bind((Activity) this);
        t();
        u();
        r();
        q();
        s();
        j();
    }
}
