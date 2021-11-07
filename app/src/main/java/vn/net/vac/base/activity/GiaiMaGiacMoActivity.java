package vn.net.vac.base.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebSettings.LayoutAlgorithm;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.etiennelawlor.quickreturn.library.views.NotifyingWebView;
import com.h2team.android.lichvannien.R;
import java.util.List;
import vn.net.vac.base.c.k;
import vn.net.vac.base.c.n;
import vn.net.vac.base.dbmanager.model.GiacMo;
import vn.net.vac.base.dbmanager.model.MoSo;
import vn.net.vac.base.view.ClearableEditText;
import vn.net.vac.base.view.alphabet_list.widget.IndexableListView;

public class GiaiMaGiacMoActivity extends BaseActivity {
    private ClearableEditText A;
    private ClearableEditText B;
    private IndexableListView C;
    private List<MoSo> n;
    private List<GiacMo> o;
    private LinearLayout p;
    private LinearLayout q;
    private ListView r;
    private vn.net.vac.base.view.a.a s;
    private vn.net.vac.base.view.b.a t;
    private NotifyingWebView u;
    private LinearLayout v;
    private LinearLayout w;
    private Button x;
    private Button y;
    private Button z;

    class a implements OnClickListener {
        a() {
        }

        public void onClick(View view) {
            GiaiMaGiacMoActivity.this.w.setBackgroundResource(R.drawable.gm1_tab1);
            GiaiMaGiacMoActivity.this.q.setVisibility(0);
            GiaiMaGiacMoActivity.this.p.setVisibility(8);
            GiaiMaGiacMoActivity.this.u.setVisibility(8);
            GiaiMaGiacMoActivity.this.i();
        }
    }

    class b implements OnClickListener {
        b() {
        }

        public void onClick(View view) {
            GiaiMaGiacMoActivity.this.w.setBackgroundResource(R.drawable.gm1_tab2);
            GiaiMaGiacMoActivity.this.q.setVisibility(8);
            GiaiMaGiacMoActivity.this.p.setVisibility(0);
            GiaiMaGiacMoActivity.this.u.setVisibility(8);
            GiaiMaGiacMoActivity.this.i();
        }
    }

    class c implements OnClickListener {
        c() {
        }

        public void onClick(View view) {
            GiaiMaGiacMoActivity.this.w.setBackgroundResource(R.drawable.gm1_tab3);
            GiaiMaGiacMoActivity.this.u.setVisibility(0);
            GiaiMaGiacMoActivity.this.p.setVisibility(8);
            GiaiMaGiacMoActivity.this.q.setVisibility(8);
            GiaiMaGiacMoActivity.this.i();
        }
    }

    class d implements TextWatcher {
        d() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (n.b(charSequence.toString())) {
                GiaiMaGiacMoActivity.this.n = vn.net.vac.base.b.a.b();
            } else {
                GiaiMaGiacMoActivity.this.n = vn.net.vac.base.b.a.b(n.c(charSequence.toString()));
            }
            GiaiMaGiacMoActivity.this.s.a().clear();
            GiaiMaGiacMoActivity.this.s.a().addAll(GiaiMaGiacMoActivity.this.n);
            GiaiMaGiacMoActivity.this.s.notifyDataSetChanged();
        }
    }

    class e implements TextWatcher {
        e() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (n.b(charSequence.toString())) {
                GiaiMaGiacMoActivity.this.o = vn.net.vac.base.b.a.a();
            } else {
                GiaiMaGiacMoActivity.this.o = vn.net.vac.base.b.a.a(n.c(charSequence.toString()));
            }
            GiaiMaGiacMoActivity.this.t.a().clear();
            GiaiMaGiacMoActivity.this.t.a().addAll(GiaiMaGiacMoActivity.this.o);
            GiaiMaGiacMoActivity.this.t.notifyDataSetChanged();
        }
    }

    class f implements OnKeyListener {
        f() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (i == 66) {
                ((InputMethodManager) GiaiMaGiacMoActivity.this.getSystemService("input_method")).hideSoftInputFromWindow(GiaiMaGiacMoActivity.this.B.getWindowToken(), 0);
            }
            return false;
        }
    }

    class g implements OnKeyListener {
        g() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (i == 66) {
                ((InputMethodManager) GiaiMaGiacMoActivity.this.getSystemService("input_method")).hideSoftInputFromWindow(GiaiMaGiacMoActivity.this.A.getWindowToken(), 0);
            }
            return false;
        }
    }

    class h extends WebViewClient {
        h(GiaiMaGiacMoActivity giaiMaGiacMoActivity) {
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return true;
        }
    }

    class i extends com.google.android.gms.ads.c {
        final /* synthetic */ FrameLayout a;
        final /* synthetic */ LayoutParams b;

        i(FrameLayout frameLayout, LayoutParams layoutParams) {
            this.a = frameLayout;
            this.b = layoutParams;
        }

        public void M() {
            this.a.setVisibility(0);
            this.b.addRule(12, 0);
            GiaiMaGiacMoActivity.this.v.setLayoutParams(this.b);
        }

        public void b(int i) {
            this.a.setVisibility(8);
            this.b.addRule(12);
            GiaiMaGiacMoActivity.this.v.setLayoutParams(this.b);
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void q() {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.tuvi_bottom_size);
        c.b.a.a.b.c.b bVar = new c.b.a.a.b.c.b(c.b.a.a.a.a.FOOTER);
        bVar.a(this.v);
        bVar.a(dimensionPixelSize);
        this.u.setOnScrollChangedListener(bVar.a());
        c.b.a.a.b.a.b bVar2 = new c.b.a.a.b.a.b(c.b.a.a.a.a.FOOTER);
        bVar2.a(this.v);
        bVar2.a(dimensionPixelSize);
        this.r.setOnScrollListener(bVar2.a());
        this.x.setOnClickListener(new a());
        this.y.setOnClickListener(new b());
        this.z.setOnClickListener(new c());
        this.A.addTextChangedListener(new d());
        this.B.addTextChangedListener(new e());
        this.B.setOnKeyListener(new f());
        this.A.setOnKeyListener(new g());
    }

    private void r() {
        t();
        u();
        w();
    }

    private void s() {
        vn.net.vac.base.c.g.a((Context) this, 18, (TextView) findViewById(R.id.lblTitle));
    }

    private void t() {
        this.o = vn.net.vac.base.b.a.a();
        this.t = new vn.net.vac.base.view.b.a(this, this.o, vn.net.vac.base.c.g.a(this, 17));
        this.C.setAdapter(this.t);
    }

    private void u() {
        this.n = vn.net.vac.base.b.a.c();
        this.s = new vn.net.vac.base.view.a.a(this, this.n, vn.net.vac.base.c.g.a(this, 17));
        this.r.setAdapter(this.s);
    }

    private void v() {
        a(R.drawable.btn_back_2, "GIẢI MÃ GIẤC MƠ", 0);
        this.q = (LinearLayout) findViewById(R.id.llIndexListView);
        this.C = (IndexableListView) findViewById(R.id.indexListView);
        this.C.setFastScrollEnabled(true);
        this.B = (ClearableEditText) findViewById(R.id.inputSearchIndexList);
        this.p = (LinearLayout) findViewById(R.id.llListView);
        this.A = (ClearableEditText) findViewById(R.id.inputSearch);
        this.r = (ListView) findViewById(R.id.listView);
        this.u = (NotifyingWebView) findViewById(R.id.webView);
        this.u.setBackgroundColor(Color.argb(1, 0, 0, 0));
        this.q.setVisibility(0);
        this.p.setVisibility(8);
        this.u.setVisibility(8);
        this.v = (LinearLayout) findViewById(R.id.listViewBottom);
        this.w = (LinearLayout) findViewById(R.id.listViewBottomBtn);
        this.x = (Button) findViewById(R.id.btnPt1Tab1);
        this.y = (Button) findViewById(R.id.btnPt1Tab2);
        this.z = (Button) findViewById(R.id.btnPt1Tab3);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void w() {
        this.u.getSettings().setCacheMode(2);
        this.u.getSettings().setTextZoom(getResources().getInteger(R.integer.tuvi_webview_text_zoom));
        this.u.setHapticFeedbackEnabled(false);
        this.u.getSettings().setLayoutAlgorithm(LayoutAlgorithm.SINGLE_COLUMN);
        this.u.loadUrl("file:///android_asset/GiacMo/dream.htm");
        this.u.setWebViewClient(new h(this));
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_giai_ma_giac_mo);
        v();
        r();
        q();
        s();
        j();
    }

    /* Access modifiers changed, original: protected */
    public void j() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.layadDisplay);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.layad);
        frameLayout.setVisibility(8);
        LayoutParams layoutParams = (LayoutParams) this.v.getLayoutParams();
        layoutParams.addRule(12);
        this.v.setLayoutParams(layoutParams);
        if (!k.a((Context) this).d()) {
            this.m.a().setAdListener(new i(frameLayout, layoutParams));
            this.m.a(linearLayout);
        }
    }
}
