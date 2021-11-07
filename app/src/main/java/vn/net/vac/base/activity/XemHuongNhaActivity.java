package vn.net.vac.base.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
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

public class XemHuongNhaActivity extends BaseActivity {
    @Bind({2131231037})
    Spinner n;
    @Bind({2131231035})
    Spinner o;
    @Bind({2131231015})
    RadioGroup p;
    @Bind({2131230793})
    ImageView q;
    vn.net.vac.base.view.e.a r;
    int s;
    vn.net.vac.base.view.e.a t;
    int u;
    int v;

    class a implements OnItemSelectedListener {
        a() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            XemHuongNhaActivity.this.r.a(i);
            XemHuongNhaActivity.this.s = ((vn.net.vac.base.view.e.b) adapterView.getItemAtPosition(i)).a();
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    class b implements OnItemSelectedListener {
        b() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            XemHuongNhaActivity.this.t.a(i);
            XemHuongNhaActivity.this.u = ((vn.net.vac.base.view.e.b) adapterView.getItemAtPosition(i)).a();
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    class c implements OnCheckedChangeListener {
        c() {
        }

        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            switch (i) {
                case R.id.radioNam /*2131231016*/:
                    XemHuongNhaActivity.this.b(1);
                    return;
                case R.id.radioNu /*2131231017*/:
                    XemHuongNhaActivity.this.b(0);
                    return;
                default:
                    return;
            }
        }
    }

    private void b(int i) {
        this.v = i;
    }

    private void r() {
        this.n.setOnItemSelectedListener(new a());
        this.o.setOnItemSelectedListener(new b());
        this.p.setOnCheckedChangeListener(new c());
    }

    private void s() {
        v();
        u();
        b(1);
    }

    private void t() {
        g.a((Context) this, 10, (TextView) findViewById(R.id.lblTitle));
        g.a((Context) this, 10, (TextView) findViewById(R.id.lblChonTuoi));
        g.a((Context) this, 10, (TextView) findViewById(R.id.lblChonCanChi));
        g.a((Context) this, 10, (TextView) findViewById(R.id.lblChonGioiTinh));
        g.a((Context) this, 10, (TextView) findViewById(R.id.radioNam));
        g.a((Context) this, 10, (TextView) findViewById(R.id.radioNu));
    }

    private void u() {
        ArrayList arrayList = new ArrayList();
        String[] strArr = vn.net.vac.base.c.c.c;
        int length = strArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i2 + 1;
            arrayList.add(new vn.net.vac.base.view.e.b(i2, strArr[i]));
            i++;
            i2 = i3;
        }
        this.t = new vn.net.vac.base.view.e.a(this, arrayList);
        this.o.setAdapter(this.t);
        this.o.setSelection(2);
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
        a(R.drawable.btn_back, "XEM HƯỚNG NHÀ", R.drawable.info_icon);
    }

    /* Access modifiers changed, original: protected */
    public void k() {
        Intent intent = new Intent(this, WebviewGiaithichActivity.class);
        intent.putExtra("EXTRA_TAG", "TAG_XEMHUONGNHA");
        startActivity(intent);
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_xem_huongnha);
        ButterKnife.bind((Activity) this);
        s();
        w();
        r();
        t();
        j();
    }

    @OnClick({2131230793})
    public void q() {
        Intent intent = new Intent(this, WebviewResultActivity.class);
        intent.putExtra("EXTRA_TAG", "TAG_XEMHUONGNHA");
        intent.putExtra("TAG_XEMHUONGNHA_NAMSINH", this.s);
        intent.putExtra("TAG_XEMHUONGNHA_HUONGNHA", this.u + 1);
        intent.putExtra("TAG_XEMHUONGNHA_GIOITINH", this.v);
        startActivity(intent);
    }
}
