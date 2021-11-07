package vn.net.vac.base.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import com.h2team.android.lichvannien.R;
import java.util.List;
import vn.net.vac.base.c.g;
import vn.net.vac.base.dbmanager.model.Sao;
import vn.net.vac.base.view.a.d;

public class TuVi12ChomSaoActivity extends BaseActivity {
    private List<Sao> n;
    private ListView o;
    private d p;

    class a implements OnItemClickListener {
        a() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            Intent intent = new Intent(TuVi12ChomSaoActivity.this, TuVi12ChomSaoDetaillActivity.class);
            intent.putExtra("EXTRA_SAO", (Sao) TuVi12ChomSaoActivity.this.n.get(i));
            TuVi12ChomSaoActivity.this.startActivity(intent);
        }
    }

    private void q() {
        this.o.setOnItemClickListener(new a());
    }

    private void r() {
        t();
    }

    private void s() {
        g.a((Context) this, 18, (TextView) findViewById(R.id.lblTitle));
    }

    private void t() {
        this.n = vn.net.vac.base.b.a.e();
        this.p = new d(this, this.n, g.a(this, 17));
        this.o.setAdapter(this.p);
    }

    private void u() {
        a(R.drawable.btn_back_2, "TỬ VI 12 CHÒM SAO", 0);
        this.o = (ListView) findViewById(R.id.listView);
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_tu_vi_12_chom_sao);
        u();
        r();
        q();
        s();
    }
}
