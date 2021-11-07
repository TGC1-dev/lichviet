package vn.net.vac.base.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.h2team.android.lichvannien.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import vn.net.vac.base.MyApplication;
import vn.net.vac.base.c.g;
import vn.net.vac.base.c.h;
import vn.net.vac.base.c.k;
import vn.net.vac.base.dbmanager.model.NgayLe2016;
import vn.net.vac.base.dbmanager.model.Quotes;
import vn.net.vac.base.view.View1242_311;

public class LichVanNienLichNgayActivity2 extends BaseActivity {
    @Bind({2131230979})
    LinearLayout A;
    @Bind({2131230904})
    ImageView B;
    @Bind({2131230905})
    ImageView C;
    @Bind({2131230900})
    ImageView D;
    @Bind({2131230898})
    ImageView E;
    @Bind({2131231068})
    TextView F;
    @Bind({2131231067})
    TextView G;
    @Bind({2131231072})
    TextView H;
    @Bind({2131231071})
    TextView I;
    @Bind({2131231074})
    TextView J;
    @Bind({2131231073})
    TextView K;
    @Bind({2131231070})
    TextView L;
    @Bind({2131231069})
    TextView M;
    @Bind({2131230907})
    ImageView N;
    @Bind({2131230902})
    LinearLayout O;
    Calendar P = Calendar.getInstance();
    protected float Q;
    protected float R;
    int S = 0;
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
    @Bind({2131230959})
    TextView s;
    @Bind({2131230958})
    TextView t;
    @Bind({2131231084})
    TextView u;
    @Bind({2131231021})
    View1242_311 v;
    @Bind({2131231077})
    TextView w;
    @Bind({2131231079})
    TextView x;
    @Bind({2131231082})
    TextView y;
    @Bind({2131231078})
    TextView z;

    class a implements OnClickListener {
        a() {
        }

        public void onClick(View view) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            MyApplication myApplication = LichVanNienLichNgayActivity2.this.m;
            if (elapsedRealtime - myApplication.f >= 1000) {
                myApplication.f = SystemClock.elapsedRealtime();
                LichVanNienLichNgayActivity2.this.startActivity(new Intent(LichVanNienLichNgayActivity2.this, LichVanNienLichThangActivity2.class));
                LichVanNienLichNgayActivity2.this.finish();
            }
        }
    }

    class b implements OnClickListener {
        b() {
        }

        public void onClick(View view) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            MyApplication myApplication = LichVanNienLichNgayActivity2.this.m;
            if (elapsedRealtime - myApplication.f >= 1000) {
                myApplication.f = SystemClock.elapsedRealtime();
                LichVanNienLichNgayActivity2.this.startActivity(new Intent(LichVanNienLichNgayActivity2.this, LichVanNienDoiNgayActivity2.class));
                LichVanNienLichNgayActivity2.this.finish();
            }
        }
    }

    class c implements OnClickListener {
        c() {
        }

        public void onClick(View view) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            MyApplication myApplication = LichVanNienLichNgayActivity2.this.m;
            if (elapsedRealtime - myApplication.f >= 1000) {
                myApplication.f = SystemClock.elapsedRealtime();
                LichVanNienLichNgayActivity2.this.startActivity(new Intent(LichVanNienLichNgayActivity2.this, LichVanNienMoRongActivity2.class));
                LichVanNienLichNgayActivity2.this.finish();
            }
        }
    }

    class d implements OnTouchListener {
        d() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction() & 255;
            if (action == 0) {
                LichVanNienLichNgayActivity2.this.Q = motionEvent.getX();
                LichVanNienLichNgayActivity2.this.R = motionEvent.getY();
            } else if (action == 1) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                LichVanNienLichNgayActivity2 lichVanNienLichNgayActivity2 = LichVanNienLichNgayActivity2.this;
                lichVanNienLichNgayActivity2.a(x, x - lichVanNienLichNgayActivity2.Q, y, y - lichVanNienLichNgayActivity2.R);
            } else if (action == 3) {
                return true;
            }
            try {
                Thread.sleep(16);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return true;
        }
    }

    private void A() {
        if (vn.net.vac.base.c.a.a.s(this.P.get(5), this.P.get(2) + 1, this.P.get(1)) == 1) {
            this.D.setImageResource(R.drawable.hoangdao_2);
        } else {
            this.D.setImageResource(R.drawable.hacdao_2);
        }
    }

    private void B() {
        NgayLe2016 c = vn.net.vac.base.b.a.c(vn.net.vac.base.c.d.a(this.P.getTime(), "d-M-yyyy"));
        if (c != null) {
            try {
                this.u.setText(vn.net.vac.base.c.e.a.a(c.c, h.a(this).a()));
                return;
            } catch (Exception unused) {
                this.u.setText(c.c);
                return;
            }
        }
        Quotes j = vn.net.vac.base.b.a.j();
        try {
            if (j.b != null) {
                if (!j.b.trim().isEmpty()) {
                    this.u.setText(String.format("%s (%s)", new Object[]{vn.net.vac.base.c.e.a.a(j.a, h.a(this).a()), j.b}));
                    return;
                }
            }
            this.u.setText(vn.net.vac.base.c.e.a.a(j.a, h.a(this).a()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void C() {
        this.t.setText(String.format("THÁNG %d NĂM %d", new Object[]{Integer.valueOf(this.P.get(2) + 1), Integer.valueOf(this.P.get(1))}));
    }

    private void D() {
        this.s.setText(vn.net.vac.base.c.a.a.k(this.P.get(5), this.P.get(2) + 1, this.P.get(1)));
    }

    private void q() {
        this.o.setOnClickListener(new a());
        this.p.setOnClickListener(new b());
        this.r.setOnClickListener(new c());
        this.A.setOnTouchListener(new d());
    }

    private void r() {
        x();
    }

    private void s() {
        g.a((Context) this, this.v, 17);
        g.a((Context) this, 16, this.w);
        g.a((Context) this, 16, this.x);
        g.a((Context) this, 16, this.y);
        g.a((Context) this, 16, this.z);
        g.a((Context) this, 18, this.F);
        g.a((Context) this, 18, this.H);
        g.a((Context) this, 18, this.J);
        g.a((Context) this, 18, this.L);
        g.a((Context) this, 16, this.t);
        g.a((Context) this, 18, this.s);
        g.a((Context) this, 17, this.u);
    }

    private void t() {
        this.n.setAlpha(1.0f);
    }

    private void u() {
        Intent intent = new Intent(this, LichVanNienChiTietNgayActivity2.class);
        intent.putExtra("EXTRA_YEAR", this.P.get(1));
        intent.putExtra("EXTRA_MOTH", this.P.get(2) + 1);
        intent.putExtra("EXTRA_DAY", this.P.get(5));
        startActivity(intent);
    }

    private void v() {
        SimpleDateFormat simpleDateFormat;
        int i = this.P.get(5);
        int i2 = this.P.get(2) + 1;
        int i3 = this.P.get(1);
        this.G.setText(vn.net.vac.base.c.a.a.b(Calendar.getInstance().get(11), i, i2, i3));
        if (k.a((Context) this).c()) {
            simpleDateFormat = new SimpleDateFormat("hh:mm a");
        } else {
            simpleDateFormat = new SimpleDateFormat("HH:mm");
        }
        this.F.setText(simpleDateFormat.format(new Date()));
        TextView textView = this.H;
        StringBuilder stringBuilder = new StringBuilder();
        String str = "";
        stringBuilder.append(str);
        stringBuilder.append(vn.net.vac.base.c.a.a.f(i, i2, i3));
        textView.setText(stringBuilder.toString());
        this.I.setText(vn.net.vac.base.c.a.a.g(i, i2, i3));
        textView = this.J;
        stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(vn.net.vac.base.c.a.a.i(i, i2, i3));
        textView.setText(stringBuilder.toString());
        this.K.setText(vn.net.vac.base.c.a.a.j(i, i2, i3));
        textView = this.L;
        stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(vn.net.vac.base.c.a.a.d(i, i2, i3));
        textView.setText(stringBuilder.toString());
        this.M.setText(vn.net.vac.base.c.a.a.e(i, i2, i3));
    }

    private void w() {
        int i = this.P.get(5);
        int i2 = this.P.get(2) + 1;
        int i3 = this.P.get(1);
        c.d.a.b.d.b().a(String.format("assets://congiap/_m_giap%s.png", new Object[]{Integer.valueOf(vn.net.vac.base.c.a.a.b(i, i2, i3)[0])}), this.E);
    }

    private void x() {
        D();
        z();
        C();
        A();
        w();
        B();
        v();
        y();
    }

    private void y() {
        if (vn.net.vac.base.c.a.a.d(Calendar.getInstance().get(11), this.P.get(5), this.P.get(2) + 1, this.P.get(1))) {
            this.N.setVisibility(0);
        } else {
            this.N.setVisibility(4);
        }
    }

    private void z() {
        int i = this.S;
        Animation loadAnimation = i == 2 ? AnimationUtils.loadAnimation(this, R.anim.left2right) : i == 1 ? AnimationUtils.loadAnimation(this, R.anim.right2left) : i == 4 ? AnimationUtils.loadAnimation(this, R.anim.bottom2top) : i == 8 ? AnimationUtils.loadAnimation(this, R.anim.top2bottom) : null;
        if (this.S != 0) {
            this.O.startAnimation(loadAnimation);
        }
        i = this.P.get(5);
        int i2 = this.P.get(2) + 1;
        int i3 = this.P.get(1);
        Object obj = (vn.net.vac.base.c.a.a.q(i, i2, i3) || vn.net.vac.base.c.a.a.p(i, i2, i3) || vn.net.vac.base.c.a.a.v(i, i2, i3) == 0) ? 1 : null;
        String str = obj != null ? "number1" : "number0";
        String str2 = "";
        String str3 = "assets://date/%s%s.png";
        c.d.a.b.d b;
        Object[] objArr;
        StringBuilder stringBuilder;
        if (10 > i) {
            this.B.setVisibility(8);
            b = c.d.a.b.d.b();
            objArr = new Object[2];
            objArr[0] = str;
            stringBuilder = new StringBuilder();
            stringBuilder.append(i);
            stringBuilder.append(str2);
            objArr[1] = stringBuilder.toString();
            b.a(String.format(str3, objArr), this.C);
            return;
        }
        int i4 = i / 10;
        i %= 10;
        this.B.setVisibility(0);
        c.d.a.b.d b2 = c.d.a.b.d.b();
        Object[] objArr2 = new Object[2];
        objArr2[0] = str;
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(i4);
        stringBuilder2.append(str2);
        objArr2[1] = stringBuilder2.toString();
        b2.a(String.format(str3, objArr2), this.B);
        b = c.d.a.b.d.b();
        objArr = new Object[2];
        objArr[0] = str;
        stringBuilder = new StringBuilder();
        stringBuilder.append(i);
        stringBuilder.append(str2);
        objArr[1] = stringBuilder.toString();
        b.a(String.format(str3, objArr), this.C);
    }

    @OnClick({2131230773})
    public void clickDetailDay(View view) {
        u();
    }

    @OnClick({2131231021})
    public void clickDetailDay2(View view) {
        u();
    }

    @OnClick({2131230794})
    public void clickToday(View view) {
        this.S = 0;
        this.P = Calendar.getInstance();
        x();
    }

    public void onBackPressed() {
        n();
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_lich_van_nien_lich_ngay3);
        ButterKnife.bind((Activity) this);
        t();
        r();
        q();
        s();
    }

    private boolean a(float f, float f2, float f3, float f4) {
        int i = 0;
        this.S = 0;
        int minimumFlingVelocity = ViewConfiguration.getMinimumFlingVelocity();
        f2 = Math.abs(f2);
        f4 = Math.abs(f4);
        float f5 = (float) minimumFlingVelocity;
        if (f2 > f5 || f4 > f5) {
            Object obj = f4 >= f2 ? 1 : null;
            if (obj != 1 ? f >= this.Q : f3 >= this.R) {
                i = 1;
            }
            if (obj == 1) {
                if (i != 0) {
                    this.P.add(2, 1);
                    this.S = 4;
                } else {
                    this.P.add(2, -1);
                    this.S = 8;
                }
            } else if (i != 0) {
                this.P.add(5, 1);
                this.S = 1;
            } else {
                this.P.add(5, -1);
                this.S = 2;
            }
            x();
        } else {
            u();
        }
        return true;
    }
}
