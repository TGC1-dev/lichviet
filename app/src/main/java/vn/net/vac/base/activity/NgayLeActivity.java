package vn.net.vac.base.activity;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import butterknife.Bind;
import butterknife.ButterKnife;
import com.h2team.android.lichvannien.R;
import java.util.ArrayList;
import java.util.List;
import vn.net.vac.base.c.g;
import vn.net.vac.base.c.k;
import vn.net.vac.base.c.m;

public class NgayLeActivity extends BaseActivity {
    @Bind({2131230960})
    TextView n;
    private List<vn.net.vac.base.dbmanager.model.a> o;
    private ListView p;
    private vn.net.vac.base.view.a.b q;
    private LinearLayout r;
    private LinearLayout s;
    private Button t;
    private Button u;
    private Button v;
    private String w = "NgayLe/NgayLeAm.strings";
    private String x = "NgayLe/NgayLeDuong.strings";
    private long y = 0;

    class a implements OnClickListener {
        a() {
        }

        public void onClick(View view) {
            NgayLeActivity.this.r.setBackgroundResource(R.drawable.btn_ngay_le_1);
            NgayLeActivity ngayLeActivity = NgayLeActivity.this;
            ngayLeActivity.c(ngayLeActivity.x);
        }
    }

    class b implements OnClickListener {
        b() {
        }

        public void onClick(View view) {
            NgayLeActivity.this.r.setBackgroundResource(R.drawable.btn_ngay_le_2);
            NgayLeActivity ngayLeActivity = NgayLeActivity.this;
            ngayLeActivity.c(ngayLeActivity.w);
        }
    }

    class c implements OnClickListener {
        c() {
        }

        public void onClick(View view) {
            NgayLeActivity.this.r.setBackgroundResource(R.drawable.btn_ngay_le_3);
            if (SystemClock.elapsedRealtime() - NgayLeActivity.this.y >= 1000) {
                NgayLeActivity.this.y = SystemClock.elapsedRealtime();
                NgayLeActivity.this.v();
            }
        }
    }

    class d implements OnClickListener {
        final /* synthetic */ Dialog a;

        d(Dialog dialog) {
            this.a = dialog;
        }

        public void onClick(View view) {
            this.a.dismiss();
            NgayLeActivity.this.g();
            new m(NgayLeActivity.this).a("Yêu cầu bổ sung dữ liệu cho chức năng Ngày Lễ", "Tôi muốn bổ sung ngày lễ sau:\nLoại âm lịch hay dương lịch: ... \nNgày: ... \nNội dung: ... \nXin cảm ơn!", NgayLeActivity.this.getString(R.string.mail));
        }
    }

    class e implements OnClickListener {
        final /* synthetic */ Dialog a;

        e(NgayLeActivity ngayLeActivity, Dialog dialog) {
            this.a = dialog;
        }

        public void onClick(View view) {
            this.a.dismiss();
        }
    }

    class f extends com.google.android.gms.ads.c {
        final /* synthetic */ FrameLayout a;
        final /* synthetic */ LayoutParams b;

        f(FrameLayout frameLayout, LayoutParams layoutParams) {
            this.a = frameLayout;
            this.b = layoutParams;
        }

        public void M() {
            this.a.setVisibility(0);
            this.b.addRule(12, 0);
            NgayLeActivity.this.s.setLayoutParams(this.b);
        }

        public void b(int i) {
            this.a.setVisibility(8);
            this.b.addRule(12);
            NgayLeActivity.this.s.setLayoutParams(this.b);
        }
    }

    private void q() {
        this.t.setOnClickListener(new a());
        this.u.setOnClickListener(new b());
        this.v.setOnClickListener(new c());
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.tuvi_bottom_size);
        c.b.a.a.b.a.b bVar = new c.b.a.a.b.a.b(c.b.a.a.a.a.FOOTER);
        bVar.a(this.s);
        bVar.a(dimensionPixelSize);
        this.p.setOnScrollListener(bVar.a());
    }

    private void r() {
        this.o = new ArrayList();
        t();
    }

    private void s() {
        g.a((Context) this, 18, this.n);
    }

    private void t() {
        this.o = b(this.x);
        this.q = new vn.net.vac.base.view.a.b(this, this.o);
        this.p.setAdapter(this.q);
    }

    private void u() {
        a(R.drawable.btn_back_2, "DANH SÁCH NGÀY LỄ", 0);
        this.p = (ListView) findViewById(R.id.listView);
        this.r = (LinearLayout) findViewById(R.id.listViewBottomBtn);
        this.t = (Button) findViewById(R.id.btnNgayleDuong);
        this.u = (Button) findViewById(R.id.btnNgayleAm);
        this.v = (Button) findViewById(R.id.btnNgayleBosung);
        this.s = (LinearLayout) findViewById(R.id.listViewBottom);
    }

    private void v() {
        Dialog dialog = new Dialog(this, R.style.FullHeightDialog);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.layout_dialog_bo_sung);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialog.getWindow().setLayout(-1, -2);
        g.a((Context) this, 16, (TextView) dialog.findViewById(R.id.dialogLoingoTitle));
        g.a((Context) this, 17, (TextView) dialog.findViewById(R.id.dialogTxt));
        g.a((Context) this, 17, (TextView) dialog.findViewById(R.id.dialogBtnDonotCloseApp));
        g.a((Context) this, 17, (TextView) dialog.findViewById(R.id.dialogBtnCloseApp));
        dialog.findViewById(R.id.dialogBtnCloseApp).setOnClickListener(new d(dialog));
        dialog.findViewById(R.id.dialogBtnDonotCloseApp).setOnClickListener(new e(this, dialog));
        dialog.show();
    }

    /* Access modifiers changed, original: protected */
    public void j() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.layadDisplay);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.layad);
        frameLayout.setVisibility(8);
        LayoutParams layoutParams = (LayoutParams) this.s.getLayoutParams();
        layoutParams.addRule(12);
        this.s.setLayoutParams(layoutParams);
        if (!k.a((Context) this).d()) {
            this.m.a().setAdListener(new f(frameLayout, layoutParams));
            this.m.a(linearLayout);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_ngay_le);
        ButterKnife.bind((Activity) this);
        u();
        r();
        q();
        s();
        j();
    }

    private List<vn.net.vac.base.dbmanager.model.a> b(String str) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : vn.net.vac.base.c.f.a((Context) this).a(str).replace("\"", "").split(";\n")) {
            String str3 = "=";
            String str4 = ";;;";
            arrayList.add(new vn.net.vac.base.dbmanager.model.a(str2.split(str3)[0], str2.split(str3)[1].split(str4)[0], str2.split(str3)[1].split(str4)[1]));
        }
        return arrayList;
    }

    private void c(String str) {
        this.q.a().clear();
        this.o = b(str);
        this.q.a().addAll(this.o);
        this.q.notifyDataSetChanged();
    }
}
