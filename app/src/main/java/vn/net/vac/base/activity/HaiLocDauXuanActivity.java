package vn.net.vac.base.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.h2team.android.lichvannien.R;
import java.util.Random;
import vn.net.vac.base.c.g;
import vn.net.vac.base.c.h;
import vn.net.vac.base.c.m;
import vn.net.vac.base.dbmanager.model.QueQuanAm;

public class HaiLocDauXuanActivity extends BaseActivity {
    private RelativeLayout n;
    private LinearLayout o;
    private QueQuanAm p;
    private ImageView q;
    private ImageView r;
    private ImageView s;
    private TextView t;
    private TextView u;
    private ImageView v;
    private ImageView w;

    class a implements OnClickListener {
        a() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(HaiLocDauXuanActivity.this, HaiLocDauXuanBinhGiaiActivity.class);
            intent.putExtra("EXTRA_QUE_QUAN_AM", HaiLocDauXuanActivity.this.p);
            HaiLocDauXuanActivity.this.startActivity(intent);
        }
    }

    class b implements OnClickListener {
        b() {
        }

        public void onClick(View view) {
            HaiLocDauXuanActivity.this.n.setVisibility(0);
            HaiLocDauXuanActivity.this.o.setVisibility(8);
        }
    }

    class c implements OnClickListener {
        c() {
        }

        public void onClick(View view) {
            HaiLocDauXuanActivity.this.n.setVisibility(8);
            HaiLocDauXuanActivity.this.o.setVisibility(0);
            HaiLocDauXuanActivity.this.t();
            Animation loadAnimation = AnimationUtils.loadAnimation(HaiLocDauXuanActivity.this, R.anim.animation_hai_loc);
            loadAnimation.setDuration(500);
            HaiLocDauXuanActivity.this.o.setAnimation(loadAnimation);
            HaiLocDauXuanActivity.this.o.animate();
            loadAnimation.start();
        }
    }

    class d implements OnClickListener {
        d() {
        }

        public void onClick(View view) {
            new m(HaiLocDauXuanActivity.this).a();
        }
    }

    private void q() {
        this.q.setOnClickListener(new a());
        this.r.setOnClickListener(new b());
        this.v.setOnClickListener(new c());
        this.w.setOnClickListener(new d());
    }

    private void r() {
        s();
    }

    private void s() {
    }

    private void t() {
        this.p = vn.net.vac.base.b.a.i();
        try {
            this.t.setText(vn.net.vac.base.c.e.a.a(this.p.b, h.a(this).a()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.u.setText(this.p.a);
        Resources resources = getResources();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("tien");
        stringBuilder.append(b(0, 4));
        this.s.setImageResource(resources.getIdentifier(stringBuilder.toString(), "drawable", getPackageName()));
    }

    private void u() {
        g.a((Context) this, 10, (TextView) findViewById(R.id.txtTienLiXi));
        g.a((Context) this, 11, (TextView) findViewById(R.id.txtTenQue));
        g.a((Context) this, 12, (TextView) findViewById(R.id.txtQue));
    }

    private void v() {
        a((int) R.drawable.btn_back, (int) R.drawable.title_hailoc);
        ((ImageView) findViewById(R.id.imageTitle)).setPadding(0, 25, 0, 25);
        this.n = (RelativeLayout) findViewById(R.id.frame01);
        this.o = (LinearLayout) findViewById(R.id.frame02);
        this.q = (ImageView) findViewById(R.id.btnBinhGiaiChiTiet);
        this.r = (ImageView) findViewById(R.id.btnClose);
        this.s = (ImageView) findViewById(R.id.imgTienLiXi);
        this.t = (TextView) findViewById(R.id.txtQue);
        this.u = (TextView) findViewById(R.id.txtTenQue);
        this.v = (ImageView) findViewById(R.id.imageCayDao);
        this.w = (ImageView) findViewById(R.id.imageShareFacebook);
        this.n.setVisibility(0);
        this.o.setVisibility(8);
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_hai_loc_dau_xuan);
        v();
        r();
        q();
        u();
    }

    /* Access modifiers changed, original: protected */
    public void onDestroy() {
        super.onDestroy();
    }

    /* Access modifiers changed, original: protected */
    public void onPause() {
        super.onPause();
    }

    /* Access modifiers changed, original: protected */
    public void onResume() {
        super.onResume();
    }

    public int b(int i, int i2) {
        return new Random().nextInt((i2 - i) + 1) + i;
    }
}
