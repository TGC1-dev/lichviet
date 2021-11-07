package vn.net.vac.base.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.h2team.android.lichvannien.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import vn.net.vac.base.MyApplication;
import vn.net.vac.base.c.g;
import vn.net.vac.base.c.h;
import vn.net.vac.base.c.k;
import vn.net.vac.base.dbmanager.model.NgayLe2016;
import vn.net.vac.base.dbmanager.model.Quotes;
import vn.net.vac.base.view.View1242_311;
import vn.net.vac.base.view.calendar.CalenderView;
import vn.net.vac.base.view.calendar.CalenderView.f;

public class LichVanNienLichThangActivity2 extends BaseActivity {
    @Bind({2131231072})
    TextView A;
    @Bind({2131231071})
    TextView B;
    @Bind({2131231074})
    TextView C;
    @Bind({2131231073})
    TextView D;
    @Bind({2131231070})
    TextView E;
    @Bind({2131231069})
    TextView F;
    @Bind({2131230907})
    ImageView G;
    @Bind({2131230820})
    CalenderView H;
    Calendar I = Calendar.getInstance();
    Calendar J;
    Integer K;
    @Bind({2131230779})
    ImageView n;
    @Bind({2131230780})
    ImageView o;
    @Bind({2131230777})
    ImageView p;
    @Bind({2131230795})
    ImageView q;
    @Bind({2131230781})
    ImageView r;
    @Bind({2131231084})
    TextView s;
    @Bind({2131231021})
    View1242_311 t;
    @Bind({2131231077})
    TextView u;
    @Bind({2131231079})
    TextView v;
    @Bind({2131231082})
    TextView w;
    @Bind({2131231078})
    TextView x;
    @Bind({2131231068})
    TextView y;
    @Bind({2131231067})
    TextView z;

    class b implements OnClickListener {
        b() {
        }

        public void onClick(View view) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            MyApplication myApplication = LichVanNienLichThangActivity2.this.m;
            if (elapsedRealtime - myApplication.f >= 1000) {
                myApplication.f = SystemClock.elapsedRealtime();
                LichVanNienLichThangActivity2.this.startActivity(new Intent(LichVanNienLichThangActivity2.this, LichVanNienLichNgayActivity2.class));
                LichVanNienLichThangActivity2.this.overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                LichVanNienLichThangActivity2.this.finish();
            }
        }
    }

    class c implements OnClickListener {
        c() {
        }

        public void onClick(View view) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            MyApplication myApplication = LichVanNienLichThangActivity2.this.m;
            if (elapsedRealtime - myApplication.f >= 1000) {
                myApplication.f = SystemClock.elapsedRealtime();
                LichVanNienLichThangActivity2.this.startActivity(new Intent(LichVanNienLichThangActivity2.this, LichVanNienDoiNgayActivity2.class));
                LichVanNienLichThangActivity2.this.finish();
            }
        }
    }

    class d implements OnClickListener {
        d() {
        }

        public void onClick(View view) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            MyApplication myApplication = LichVanNienLichThangActivity2.this.m;
            if (elapsedRealtime - myApplication.f >= 1000) {
                myApplication.f = SystemClock.elapsedRealtime();
                LichVanNienLichThangActivity2.this.startActivity(new Intent(LichVanNienLichThangActivity2.this, LichVanNienMoRongActivity2.class));
                LichVanNienLichThangActivity2.this.finish();
            }
        }
    }

    class a implements f {
        a() {
        }

        public void a(Date date) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            MyApplication myApplication = LichVanNienLichThangActivity2.this.m;
            if (elapsedRealtime - myApplication.f >= 1000) {
                myApplication.f = SystemClock.elapsedRealtime();
                LichVanNienLichThangActivity2.this.I.setTime(date);
                LichVanNienLichThangActivity2.this.q();
                LichVanNienLichThangActivity2.this.y();
                LichVanNienLichThangActivity2.this.z();
            }
        }
    }

    private void q() {
        SimpleDateFormat simpleDateFormat;
        if (this.I == null) {
            this.I = Calendar.getInstance();
        }
        this.z.setText(vn.net.vac.base.c.a.a.b(Calendar.getInstance().get(11), this.I.get(5), this.I.get(2) + 1, this.I.get(1)));
        if (k.a((Context) this).c()) {
            simpleDateFormat = new SimpleDateFormat("hh:mm a");
        } else {
            simpleDateFormat = new SimpleDateFormat("HH:mm");
        }
        this.y.setText(simpleDateFormat.format(new Date()));
        TextView textView = this.A;
        StringBuilder stringBuilder = new StringBuilder();
        String str = "";
        stringBuilder.append(str);
        stringBuilder.append(vn.net.vac.base.c.a.a.f(this.I.get(5), this.I.get(2) + 1, this.I.get(1)));
        textView.setText(stringBuilder.toString());
        this.B.setText(vn.net.vac.base.c.a.a.g(this.I.get(5), this.I.get(2) + 1, this.I.get(1)));
        textView = this.C;
        stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(vn.net.vac.base.c.a.a.i(this.I.get(5), this.I.get(2) + 1, this.I.get(1)));
        textView.setText(stringBuilder.toString());
        this.D.setText(vn.net.vac.base.c.a.a.j(this.I.get(5), this.I.get(2) + 1, this.I.get(1)));
        textView = this.E;
        stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(vn.net.vac.base.c.a.a.d(this.I.get(5), this.I.get(2) + 1, this.I.get(1)));
        textView.setText(stringBuilder.toString());
        this.F.setText(vn.net.vac.base.c.a.a.e(this.I.get(5), this.I.get(2) + 1, this.I.get(1)));
    }

    private void r() {
        s();
        v();
    }

    private void s() {
        this.J = new GregorianCalendar();
        this.K = Integer.valueOf(this.J.get(5));
        HashSet hashSet = new HashSet();
        hashSet.add(new Date());
        this.H.a(hashSet, this.K.intValue());
        this.H.setEventHandler(new a());
    }

    private void t() {
        q();
        y();
        z();
    }

    private void u() {
        g.a((Context) this, this.t, 17);
        g.a((Context) this, 16, this.u);
        g.a((Context) this, 16, this.v);
        g.a((Context) this, 16, this.w);
        g.a((Context) this, 16, this.x);
        g.a((Context) this, 18, this.y);
        g.a((Context) this, 18, this.A);
        g.a((Context) this, 18, this.C);
        g.a((Context) this, 18, this.E);
        g.a((Context) this, 17, this.s);
    }

    private void v() {
        this.n.setOnClickListener(new b());
        this.p.setOnClickListener(new c());
        this.r.setOnClickListener(new d());
    }

    private void w() {
        this.o.setAlpha(1.0f);
    }

    private void x() {
        Intent intent = new Intent(this, LichVanNienChiTietNgayActivity2.class);
        intent.putExtra("EXTRA_YEAR", this.I.get(1));
        intent.putExtra("EXTRA_MOTH", this.I.get(2) + 1);
        intent.putExtra("EXTRA_DAY", this.I.get(5));
        startActivity(intent);
    }

    private void y() {
        if (vn.net.vac.base.c.a.a.d(Calendar.getInstance().get(11), this.I.get(5), this.I.get(2) + 1, this.I.get(1))) {
            this.G.setVisibility(0);
        } else {
            this.G.setVisibility(4);
        }
    }

    private void z() {
        if (this.I == null) {
            this.I = Calendar.getInstance();
        }
        NgayLe2016 c = vn.net.vac.base.b.a.c(vn.net.vac.base.c.d.a(this.I.getTime(), "d-M-yyyy"));
        if (c != null) {
            try {
                this.s.setText(vn.net.vac.base.c.e.a.a(c.c, h.a(this).a()));
                return;
            } catch (Exception unused) {
                this.s.setText(c.c);
                return;
            }
        }
        Quotes j = vn.net.vac.base.b.a.j();
        try {
            if (j.b != null) {
                if (!j.b.trim().isEmpty()) {
                    this.s.setText(String.format("%s (%s)", new Object[]{vn.net.vac.base.c.e.a.a(j.a, h.a(this).a()), j.b}));
                    return;
                }
            }
            this.s.setText(vn.net.vac.base.c.e.a.a(j.a, h.a(this).a()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @OnClick({2131230773})
    public void clickDetailDay(View view) {
        x();
    }

    @OnClick({2131231021})
    public void clickDetailDay2(View view) {
        x();
    }

    @OnClick({2131230794})
    public void clickToday(View view) {
        CalenderView calenderView = this.H;
        calenderView.p = 0;
        calenderView.a();
        this.I = this.H.getCurrentDate();
        q();
        y();
        z();
    }

    public void onBackPressed() {
        n();
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_lich_van_nien_lich_thang2);
        ButterKnife.bind((Activity) this);
        w();
        t();
        r();
        u();
    }

    /* Access modifiers changed, original: protected */
    public void onResume() {
        super.onResume();
    }
}
