package vn.net.vac.base.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.h2team.android.lichvannien.R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import vn.net.vac.base.c.g;
import vn.net.vac.base.dbmanager.model.Menh;

public class XemtuoiXaynhaActivity extends BaseActivity {
    @Bind({2131231037})
    Spinner n;
    @Bind({2131231036})
    Spinner o;
    @Bind({2131230793})
    ImageView p;
    vn.net.vac.base.view.e.a q;
    vn.net.vac.base.view.e.a r;
    int s;
    int t;

    class a implements OnItemSelectedListener {
        a() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            XemtuoiXaynhaActivity.this.r.a(i);
            XemtuoiXaynhaActivity.this.t = ((vn.net.vac.base.view.e.b) adapterView.getItemAtPosition(i)).a();
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    class b implements OnItemSelectedListener {
        b() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            XemtuoiXaynhaActivity.this.q.a(i);
            XemtuoiXaynhaActivity.this.s = ((vn.net.vac.base.view.e.b) adapterView.getItemAtPosition(i)).a();
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    private void s() {
        this.n.setOnItemSelectedListener(new a());
        this.o.setOnItemSelectedListener(new b());
    }

    private void t() {
        v();
        w();
    }

    private void u() {
        g.a((Context) this, 18, (TextView) findViewById(R.id.lblTitle));
        g.a((Context) this, 10, (TextView) findViewById(R.id.lblChonTuoi));
        g.a((Context) this, 10, (TextView) findViewById(R.id.lblChonCanChi));
    }

    private void v() {
        List<Menh> f = vn.net.vac.base.b.a.f(Calendar.getInstance().get(1));
        ArrayList arrayList = new ArrayList();
        for (Menh menh : f) {
            int i = (int) menh.a;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(menh.a);
            stringBuilder.append("");
            arrayList.add(new vn.net.vac.base.view.e.b(i, stringBuilder.toString()));
        }
        this.r = new vn.net.vac.base.view.e.a(this, arrayList);
        this.n.setAdapter(this.r);
        this.n.setSelection(59);
    }

    private void w() {
        List<Menh> e = vn.net.vac.base.b.a.e(2010);
        ArrayList arrayList = new ArrayList();
        for (Menh menh : e) {
            int i = (int) menh.a;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(menh.a);
            stringBuilder.append("");
            arrayList.add(new vn.net.vac.base.view.e.b(i, stringBuilder.toString()));
        }
        this.q = new vn.net.vac.base.view.e.a(this, arrayList);
        this.o.setAdapter(this.q);
        this.o.setSelection(Calendar.getInstance().get(1) - 2010);
    }

    private void x() {
        a(R.drawable.btn_back_2, "XEM TUỔI XÂY NHÀ", R.drawable.info_icon);
    }

    /* Access modifiers changed, original: protected */
    public void k() {
        Intent intent = new Intent(this, WebviewGiaithichActivity.class);
        intent.putExtra("EXTRA_TAG", "TAG_XEMTUOI_XAYNHA");
        startActivity(intent);
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_xemtuoi_xaynha);
        ButterKnife.bind((Activity) this);
        t();
        x();
        s();
        u();
        j();
    }

    @OnClick({2131230793})
    public void q() {
    }

    @OnClick({2131230793})
    public void r() {
        if (10 > (this.s - this.t) + 1) {
            a("Rất tiếc, ứng dụng chỉ hỗ trợ xem tuổi xây nhà cho gia chủ từ 10 tuổi trở lên. Xin cảm ơn!");
            return;
        }
        Intent intent = new Intent(this, WebviewResultActivity.class);
        intent.putExtra("EXTRA_TAG", "TAG_XEMTUOI_XAYNHA");
        intent.putExtra("TAG_XETUOI_NAMSINH", this.t);
        intent.putExtra("TAG_XEMTUOI_NAMDUKIEN", this.s);
        startActivity(intent);
    }
}
