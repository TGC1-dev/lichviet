package vn.net.vac.base.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.h2team.android.lichvannien.R;
import java.util.List;
import vn.net.vac.base.c.g;
import vn.net.vac.base.dbmanager.model.XemBoi;
import vn.net.vac.base.view.a.e;

public class XemBoiActivity extends BaseActivity {
    private List<XemBoi> n;
    private ListView o;
    private e p;
    private b q;

    class a implements OnItemClickListener {
        a() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            Intent intent = new Intent(XemBoiActivity.this, XemBoiDetailActivity.class);
            intent.putExtra("EXTRA_XEM_BOI", (XemBoi) XemBoiActivity.this.n.get(i));
            XemBoiActivity.this.startActivity(intent);
        }
    }

    public enum b {
        XEM_BOI_VUI(0),
        XEM_TUONG_MAO(1);
        
        private final int a;

        private b(int i) {
            this.a = i;
        }

        public int a() {
            return this.a;
        }
    }

    private void q() {
        if (getIntent().getExtras() != null) {
            this.q = (b) getIntent().getSerializableExtra("EXTRA_XEM_BOI_TYPE");
        }
    }

    private void r() {
        this.o.setOnItemClickListener(new a());
    }

    private void s() {
        u();
    }

    private void t() {
        g.a((Context) this, 18, (TextView) findViewById(R.id.lblTitle));
    }

    private void u() {
        this.n = vn.net.vac.base.b.a.c(this.q.a());
        this.p = new e(this, this.n, g.a(this, 17));
        this.o.setAdapter(this.p);
    }

    private void v() {
        ImageView imageView = (ImageView) findViewById(R.id.imageTitle);
        if (this.q == b.XEM_BOI_VUI) {
            a(R.drawable.btn_back_2, "XEM BÓI VUI", 0);
        } else {
            a(R.drawable.btn_back_2, "XEM TƯỚNG MẠO", 0);
        }
        this.o = (ListView) findViewById(R.id.listView);
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_xem_boi);
        q();
        v();
        s();
        r();
        t();
    }
}
