package vn.net.vac.base.activity;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.TextView;
import com.h2team.android.lichvannien.R;
import vn.net.vac.base.c.g;
import vn.net.vac.base.dbmanager.model.VanKhan;
import vn.net.vac.base.dbmanager.model.VanKhanType;
import vn.net.vac.base.view.c.a;
import vn.net.vac.base.view.c.b;

public class VanKhanActivity extends BaseActivity implements OnChildClickListener {
    private ExpandableListView n;
    private a o;
    SparseArray<b> p = new SparseArray();

    private void r() {
    }

    private void s() {
        u();
    }

    private void t() {
        g.a((Context) this, 18, (TextView) findViewById(R.id.lblTitle));
    }

    private void u() {
        q();
        this.o = new a(this, this.p);
        this.n.setAdapter(this.o);
        this.n.setOnChildClickListener(this);
        this.n.expandGroup(0);
    }

    private void v() {
        a(R.drawable.btn_back_2, "VĂN KHẤN", 0);
        this.n = (ExpandableListView) findViewById(R.id.listView);
    }

    public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long j) {
        return true;
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_van_khan);
        v();
        s();
        r();
        t();
    }

    public void q() {
        int i = 0;
        for (VanKhanType vanKhanType : vn.net.vac.base.b.a.g()) {
            b bVar = new b(vanKhanType.b);
            for (VanKhan add : vn.net.vac.base.b.a.i(vanKhanType.a)) {
                bVar.b.add(add);
            }
            int i2 = i + 1;
            this.p.append(i, bVar);
            i = i2;
        }
    }
}
