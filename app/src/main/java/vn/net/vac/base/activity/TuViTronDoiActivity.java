package vn.net.vac.base.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ImageButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Spinner;
import android.widget.TextView;
import com.h2team.android.lichvannien.R;
import java.util.ArrayList;
import java.util.List;
import vn.net.vac.base.c.g;
import vn.net.vac.base.dbmanager.model.TronDoi;
import vn.net.vac.base.dbmanager.model.TuVi2014;

public class TuViTronDoiActivity extends BaseActivity {
    private Spinner n;
    private Spinner o;
    private ImageButton p;
    private int q;
    private int r;
    private RadioGroup s;
    private vn.net.vac.base.view.e.a t;
    private vn.net.vac.base.view.e.a u;

    class a implements OnClickListener {
        a() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(TuViTronDoiActivity.this, TuViTronDoiBinhGiaiActivity.class);
            intent.putExtra("EXTRA_TRON_DOI_ID", TuViTronDoiActivity.this.q);
            intent.putExtra("EXTRA_TRON_DOI_GIOI_TINH", TuViTronDoiActivity.this.r);
            TuViTronDoiActivity.this.startActivity(intent);
        }
    }

    class b implements OnItemSelectedListener {
        b() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            TuViTronDoiActivity.this.t.a(i);
            TuViTronDoiActivity.this.c(((vn.net.vac.base.view.e.b) adapterView.getItemAtPosition(i)).a() + 1);
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    class c implements OnItemSelectedListener {
        c() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            TuViTronDoiActivity.this.u.a(i);
            TuViTronDoiActivity.this.q = ((vn.net.vac.base.view.e.b) adapterView.getItemAtPosition(i)).a();
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    class d implements OnCheckedChangeListener {
        d() {
        }

        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            switch (i) {
                case R.id.radioNam /*2131231016*/:
                    TuViTronDoiActivity.this.b(1);
                    return;
                case R.id.radioNu /*2131231017*/:
                    TuViTronDoiActivity.this.b(0);
                    return;
                default:
                    return;
            }
        }
    }

    private void q() {
        this.p.setOnClickListener(new a());
        this.n.setOnItemSelectedListener(new b());
        this.o.setOnItemSelectedListener(new c());
        this.s.setOnCheckedChangeListener(new d());
    }

    private void r() {
        t();
        c(1);
        b(1);
    }

    private void s() {
        g.a((Context) this, 10, (TextView) findViewById(R.id.lblChonTuoi));
        g.a((Context) this, 10, (TextView) findViewById(R.id.lblChonCanChi));
        g.a((Context) this, 10, (TextView) findViewById(R.id.lblChonGioiTinh));
        g.a((Context) this, 10, (TextView) findViewById(R.id.radioNam));
        g.a((Context) this, 10, (TextView) findViewById(R.id.radioNu));
        g.a((Context) this, 18, (TextView) findViewById(R.id.lblTitle));
    }

    private void t() {
        List<TuVi2014> f = vn.net.vac.base.b.a.f();
        ArrayList arrayList = new ArrayList();
        for (TuVi2014 tuVi2014 : f) {
            int i = (int) tuVi2014.a;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(tuVi2014.b.replace("Xem tử vi tuổi ", ""));
            stringBuilder.append("      ");
            arrayList.add(new vn.net.vac.base.view.e.b(i, stringBuilder.toString()));
        }
        this.t = new vn.net.vac.base.view.e.a(this, arrayList);
        this.n.setAdapter(this.t);
    }

    private void u() {
        a(R.drawable.btn_back_2, "TỬ VI TRỌN ĐỜI", 0);
        this.n = (Spinner) findViewById(R.id.spinnerChonTuoi);
        this.o = (Spinner) findViewById(R.id.spinnerChonCanChi);
        this.p = (ImageButton) findViewById(R.id.btnxemBinhGiai);
        this.s = (RadioGroup) findViewById(R.id.radioGroupGioiTinh);
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_tu_vi_tron_doi);
        u();
        r();
        q();
        s();
    }

    /* Access modifiers changed, original: protected */
    public void onDestroy() {
        super.onDestroy();
    }

    private void b(int i) {
        this.r = i;
    }

    private void c(int i) {
        List<TronDoi> b = vn.net.vac.base.b.a.b(i);
        ArrayList arrayList = new ArrayList();
        for (TronDoi tronDoi : b) {
            int i2 = (int) tronDoi.a;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(tronDoi.b);
            stringBuilder.append("      ");
            arrayList.add(new vn.net.vac.base.view.e.b(i2, stringBuilder.toString()));
        }
        this.u = new vn.net.vac.base.view.e.a(this, arrayList);
        this.o.setAdapter(this.u);
    }
}
