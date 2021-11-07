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
import net.simonvt.datepicker.DatePicker;
import net.simonvt.datepicker.DatePicker.OnDateChangedListener;
import vn.net.vac.base.MyApplication;
import vn.net.vac.base.c.g;
import vn.net.vac.base.c.k;
import vn.net.vac.base.view.CustomDatePicker;
import vn.net.vac.base.view.View1242_311;

public class LichVanNienDoiNgayActivity2 extends BaseActivity {
    @Bind({2131231071})
    TextView A;
    @Bind({2131231074})
    TextView B;
    @Bind({2131231073})
    TextView C;
    @Bind({2131231070})
    TextView D;
    @Bind({2131231069})
    TextView E;
    @Bind({2131230841})
    CustomDatePicker F;
    @Bind({2131231058})
    TextView G;
    @Bind({2131230911})
    ImageView H;
    @Bind({2131230910})
    ImageView I;
    @Bind({2131230864})
    ImageView J;
    @Bind({2131230907})
    ImageView K;
    @Bind({2131230961})
    TextView L;
    Calendar M = Calendar.getInstance();
    Calendar N = Calendar.getInstance();
    private boolean O = true;
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
    @Bind({2131231021})
    View1242_311 s;
    @Bind({2131231077})
    TextView t;
    @Bind({2131231079})
    TextView u;
    @Bind({2131231082})
    TextView v;
    @Bind({2131231078})
    TextView w;
    @Bind({2131231068})
    TextView x;
    @Bind({2131231067})
    TextView y;
    @Bind({2131231072})
    TextView z;

    class b implements OnClickListener {

        class a implements OnDateChangedListener {
            a() {
            }

            public void onDateChanged(DatePicker datePicker, int i, int i2, int i3) {
                LichVanNienDoiNgayActivity2 lichVanNienDoiNgayActivity2 = LichVanNienDoiNgayActivity2.this;
                lichVanNienDoiNgayActivity2.N.set(lichVanNienDoiNgayActivity2.F.getYear(), LichVanNienDoiNgayActivity2.this.F.getMonth(), LichVanNienDoiNgayActivity2.this.F.getDayOfMonth());
                int[] u = vn.net.vac.base.c.a.a.u(LichVanNienDoiNgayActivity2.this.N.get(5), LichVanNienDoiNgayActivity2.this.N.get(2) + 1, LichVanNienDoiNgayActivity2.this.N.get(1));
                LichVanNienDoiNgayActivity2.this.G.setText(String.format("%s, Ngày %d/%d/%d Âm Lịch", new Object[]{vn.net.vac.base.c.a.a.k(r7.N.get(5), LichVanNienDoiNgayActivity2.this.N.get(2) + 1, LichVanNienDoiNgayActivity2.this.N.get(1)), Integer.valueOf(u[0]), Integer.valueOf(u[1]), Integer.valueOf(u[2])}));
                LichVanNienDoiNgayActivity2.this.q();
            }
        }

        class b implements OnDateChangedListener {
            b() {
            }

            public void onDateChanged(DatePicker datePicker, int i, int i2, int i3) {
                int[] e = vn.net.vac.base.c.a.a.e(LichVanNienDoiNgayActivity2.this.F.getDayOfMonth(), LichVanNienDoiNgayActivity2.this.F.getMonth() + 1, LichVanNienDoiNgayActivity2.this.F.getYear(), 0);
                LichVanNienDoiNgayActivity2.this.N.set(e[2], e[1] - 1, e[0]);
                LichVanNienDoiNgayActivity2.this.G.setText(String.format("%s, Ngày %d/%d/%d Dương Lịch", new Object[]{vn.net.vac.base.c.a.a.k(r7.N.get(5), LichVanNienDoiNgayActivity2.this.N.get(2) + 1, LichVanNienDoiNgayActivity2.this.N.get(1)), Integer.valueOf(e[0]), Integer.valueOf(e[1]), Integer.valueOf(e[2])}));
                LichVanNienDoiNgayActivity2.this.q();
            }
        }

        b() {
        }

        public void onClick(View view) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            MyApplication myApplication = LichVanNienDoiNgayActivity2.this.m;
            if (elapsedRealtime - myApplication.f >= 1000) {
                myApplication.f = SystemClock.elapsedRealtime();
                LichVanNienDoiNgayActivity2 lichVanNienDoiNgayActivity2 = LichVanNienDoiNgayActivity2.this;
                lichVanNienDoiNgayActivity2.O = lichVanNienDoiNgayActivity2.O ^ 1;
                int[] e;
                if (LichVanNienDoiNgayActivity2.this.O) {
                    LichVanNienDoiNgayActivity2.this.I.setImageResource(R.drawable.doingay_duonglich);
                    LichVanNienDoiNgayActivity2.this.H.setImageResource(R.drawable.doingay_amlich);
                    e = vn.net.vac.base.c.a.a.e(LichVanNienDoiNgayActivity2.this.F.getDayOfMonth(), LichVanNienDoiNgayActivity2.this.F.getMonth() + 1, LichVanNienDoiNgayActivity2.this.F.getYear(), 0);
                    LichVanNienDoiNgayActivity2.this.F.init(0, 0, 0, new a());
                    LichVanNienDoiNgayActivity2.this.F.updateDate(e[2], e[1] - 1, e[0]);
                } else {
                    LichVanNienDoiNgayActivity2.this.H.setImageResource(R.drawable.doingay_duonglich);
                    LichVanNienDoiNgayActivity2.this.I.setImageResource(R.drawable.doingay_amlich);
                    e = vn.net.vac.base.c.a.a.u(LichVanNienDoiNgayActivity2.this.F.getDayOfMonth(), LichVanNienDoiNgayActivity2.this.F.getMonth() + 1, LichVanNienDoiNgayActivity2.this.F.getYear());
                    LichVanNienDoiNgayActivity2.this.F.init(0, 0, 0, new b());
                    LichVanNienDoiNgayActivity2.this.F.updateDate(e[2], e[1] - 1, e[0]);
                }
            }
        }
    }

    class c implements OnClickListener {
        c() {
        }

        public void onClick(View view) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            MyApplication myApplication = LichVanNienDoiNgayActivity2.this.m;
            if (elapsedRealtime - myApplication.f >= 1000) {
                myApplication.f = SystemClock.elapsedRealtime();
                LichVanNienDoiNgayActivity2.this.w();
            }
        }
    }

    class d implements OnClickListener {
        d() {
        }

        public void onClick(View view) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            MyApplication myApplication = LichVanNienDoiNgayActivity2.this.m;
            if (elapsedRealtime - myApplication.f >= 1000) {
                myApplication.f = SystemClock.elapsedRealtime();
                LichVanNienDoiNgayActivity2.this.startActivity(new Intent(LichVanNienDoiNgayActivity2.this, LichVanNienLichNgayActivity2.class));
                LichVanNienDoiNgayActivity2.this.overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                LichVanNienDoiNgayActivity2.this.finish();
            }
        }
    }

    class e implements OnClickListener {
        e() {
        }

        public void onClick(View view) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            MyApplication myApplication = LichVanNienDoiNgayActivity2.this.m;
            if (elapsedRealtime - myApplication.f >= 1000) {
                myApplication.f = SystemClock.elapsedRealtime();
                LichVanNienDoiNgayActivity2.this.startActivity(new Intent(LichVanNienDoiNgayActivity2.this, LichVanNienLichThangActivity2.class));
                LichVanNienDoiNgayActivity2.this.overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                LichVanNienDoiNgayActivity2.this.finish();
            }
        }
    }

    class f implements OnClickListener {
        f() {
        }

        public void onClick(View view) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            MyApplication myApplication = LichVanNienDoiNgayActivity2.this.m;
            if (elapsedRealtime - myApplication.f >= 1000) {
                myApplication.f = SystemClock.elapsedRealtime();
                LichVanNienDoiNgayActivity2.this.startActivity(new Intent(LichVanNienDoiNgayActivity2.this, LichVanNienMoRongActivity2.class));
                LichVanNienDoiNgayActivity2.this.finish();
            }
        }
    }

    class a implements OnDateChangedListener {
        a() {
        }

        public void onDateChanged(DatePicker datePicker, int i, int i2, int i3) {
            LichVanNienDoiNgayActivity2 lichVanNienDoiNgayActivity2 = LichVanNienDoiNgayActivity2.this;
            lichVanNienDoiNgayActivity2.N.set(lichVanNienDoiNgayActivity2.F.getYear(), LichVanNienDoiNgayActivity2.this.F.getMonth(), LichVanNienDoiNgayActivity2.this.F.getDayOfMonth());
            int[] u = vn.net.vac.base.c.a.a.u(LichVanNienDoiNgayActivity2.this.N.get(5), LichVanNienDoiNgayActivity2.this.N.get(2) + 1, LichVanNienDoiNgayActivity2.this.N.get(1));
            LichVanNienDoiNgayActivity2.this.G.setText(String.format("%s, Ngày %d/%d/%d Âm Lịch", new Object[]{vn.net.vac.base.c.a.a.k(r7.N.get(5), LichVanNienDoiNgayActivity2.this.N.get(2) + 1, LichVanNienDoiNgayActivity2.this.N.get(1)), Integer.valueOf(u[0]), Integer.valueOf(u[1]), Integer.valueOf(u[2])}));
            LichVanNienDoiNgayActivity2.this.q();
        }
    }

    private void q() {
        SimpleDateFormat simpleDateFormat;
        this.M = Calendar.getInstance();
        this.y.setText(vn.net.vac.base.c.a.a.b(Calendar.getInstance().get(11), this.N.get(5), this.N.get(2) + 1, this.N.get(1)));
        this.M = Calendar.getInstance();
        if (k.a((Context) this).c()) {
            simpleDateFormat = new SimpleDateFormat("hh:mm a");
        } else {
            simpleDateFormat = new SimpleDateFormat("HH:mm");
        }
        this.x.setText(simpleDateFormat.format(new Date()));
        TextView textView = this.z;
        StringBuilder stringBuilder = new StringBuilder();
        String str = "";
        stringBuilder.append(str);
        stringBuilder.append(vn.net.vac.base.c.a.a.f(this.N.get(5), this.N.get(2) + 1, this.N.get(1)));
        textView.setText(stringBuilder.toString());
        this.A.setText(vn.net.vac.base.c.a.a.g(this.N.get(5), this.N.get(2) + 1, this.N.get(1)));
        textView = this.B;
        stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(vn.net.vac.base.c.a.a.i(this.N.get(5), this.N.get(2) + 1, this.N.get(1)));
        textView.setText(stringBuilder.toString());
        this.C.setText(vn.net.vac.base.c.a.a.j(this.N.get(5), this.N.get(2) + 1, this.N.get(1)));
        textView = this.D;
        stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(vn.net.vac.base.c.a.a.d(this.N.get(5), this.N.get(2) + 1, this.N.get(1)));
        textView.setText(stringBuilder.toString());
        this.E.setText(vn.net.vac.base.c.a.a.e(this.N.get(5), this.N.get(2) + 1, this.N.get(1)));
        x();
    }

    private void r() {
        this.J.setOnClickListener(new b());
        this.s.setOnClickListener(new c());
        u();
    }

    private void s() {
    }

    private void t() {
        g.a((Context) this, this.s, 17);
        g.a((Context) this, 16, this.t);
        g.a((Context) this, 16, this.u);
        g.a((Context) this, 16, this.v);
        g.a((Context) this, 16, this.w);
        g.a((Context) this, 18, this.x);
        g.a((Context) this, 18, this.z);
        g.a((Context) this, 18, this.B);
        g.a((Context) this, 18, this.D);
        g.a((Context) this, 18, this.G);
        g.a((Context) this, 16, this.L);
    }

    private void u() {
        this.n.setOnClickListener(new d());
        this.o.setOnClickListener(new e());
        this.r.setOnClickListener(new f());
    }

    private void v() {
        this.p.setAlpha(1.0f);
        this.F.setCalendarViewShown(false);
        this.F.init(0, 0, 0, new a());
        this.F.updateDate(this.M.get(1), this.M.get(2), this.M.get(5));
        this.I.setImageResource(R.drawable.doingay_duonglich);
        this.H.setImageResource(R.drawable.doingay_amlich);
    }

    private void w() {
        Intent intent = new Intent(this, LichVanNienChiTietNgayActivity2.class);
        intent.putExtra("EXTRA_YEAR", this.N.get(1));
        intent.putExtra("EXTRA_MOTH", this.N.get(2) + 1);
        intent.putExtra("EXTRA_DAY", this.N.get(5));
        startActivity(intent);
    }

    private void x() {
        if (vn.net.vac.base.c.a.a.d(Calendar.getInstance().get(11), this.N.get(5), this.N.get(2) + 1, this.N.get(1))) {
            this.K.setVisibility(0);
        } else {
            this.K.setVisibility(4);
        }
    }

    @OnClick({2131230775})
    public void doDanhgia(View view) {
        m();
    }

    @OnClick({2131230778})
    public void doGopy(View view) {
        o();
    }

    public void onBackPressed() {
        n();
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_lich_van_nien_doi_ngay2);
        ButterKnife.bind((Activity) this);
        v();
        s();
        r();
        t();
    }

    /* Access modifiers changed, original: protected */
    public void onResume() {
        super.onResume();
    }
}
