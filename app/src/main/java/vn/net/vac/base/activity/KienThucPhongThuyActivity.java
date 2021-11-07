package vn.net.vac.base.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.h2team.android.lichvannien.R;
import java.util.List;
import vn.net.vac.base.c.g;
import vn.net.vac.base.dbmanager.model.PhongThuy;

public class KienThucPhongThuyActivity extends BaseActivity {
    private List<PhongThuy> n;
    private ListView o;
    private vn.net.vac.base.view.a.c p;
    private LinearLayout q;
    private LinearLayout r;
    private Button s;
    private Button t;
    private Button u;
    private Button v;

    class a implements OnClickListener {
        a() {
        }

        public void onClick(View view) {
            KienThucPhongThuyActivity.this.q.setBackgroundResource(R.drawable.pt1_tab1);
            KienThucPhongThuyActivity.this.b(1);
        }
    }

    class b implements OnClickListener {
        b() {
        }

        public void onClick(View view) {
            KienThucPhongThuyActivity.this.q.setBackgroundResource(R.drawable.pt1_tab2);
            KienThucPhongThuyActivity.this.b(2);
        }
    }

    class c implements OnClickListener {
        c() {
        }

        public void onClick(View view) {
            KienThucPhongThuyActivity.this.q.setBackgroundResource(R.drawable.pt1_tab3);
            KienThucPhongThuyActivity.this.b(3);
        }
    }

    class d implements OnClickListener {
        d() {
        }

        public void onClick(View view) {
            KienThucPhongThuyActivity.this.q.setBackgroundResource(R.drawable.pt1_tab4);
            KienThucPhongThuyActivity.this.b(4);
        }
    }

    class e implements OnItemClickListener {
        e() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            Intent intent = new Intent(KienThucPhongThuyActivity.this, KienThucPhongThuyDetailActivity.class);
            intent.putExtra("EXTRA_PHONG_THUY", (PhongThuy) KienThucPhongThuyActivity.this.n.get(i));
            KienThucPhongThuyActivity.this.startActivity(intent);
        }
    }

    private void q() {
        this.s.setOnClickListener(new a());
        this.t.setOnClickListener(new b());
        this.u.setOnClickListener(new c());
        this.v.setOnClickListener(new d());
        this.o.setOnItemClickListener(new e());
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.tuvi_bottom_size);
        c.b.a.a.b.a.b bVar = new c.b.a.a.b.a.b(c.b.a.a.a.a.FOOTER);
        bVar.a(this.r);
        bVar.a(dimensionPixelSize);
        this.o.setOnScrollListener(bVar.a());
    }

    private void r() {
        t();
    }

    private void s() {
        g.a((Context) this, 18, (TextView) findViewById(R.id.lblTitle));
    }

    private void t() {
        this.n = vn.net.vac.base.b.a.a(1);
        this.p = new vn.net.vac.base.view.a.c(this, this.n, g.a(this, 17));
        this.o.setAdapter(this.p);
    }

    private void u() {
        a(R.drawable.btn_back_2, "XEM PHONG THỦY", 0);
        this.o = (ListView) findViewById(R.id.listView);
        this.q = (LinearLayout) findViewById(R.id.listViewBottomBtn);
        this.s = (Button) findViewById(R.id.btnPt1Tab1);
        this.t = (Button) findViewById(R.id.btnPt1Tab2);
        this.u = (Button) findViewById(R.id.btnPt1Tab3);
        this.v = (Button) findViewById(R.id.btnPt1Tab4);
        this.r = (LinearLayout) findViewById(R.id.listViewBottom);
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_kien_thuc_phong_thuy);
        u();
        r();
        q();
        s();
    }

    private void b(int i) {
        this.p.a().clear();
        this.n = vn.net.vac.base.b.a.a(i);
        this.p.a().addAll(this.n);
        this.p.notifyDataSetChanged();
    }
}
