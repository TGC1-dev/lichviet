package vn.net.vac.base.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebSettings.LayoutAlgorithm;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import butterknife.Bind;
import butterknife.ButterKnife;
import com.etiennelawlor.quickreturn.library.views.NotifyingScrollView;
import com.etiennelawlor.quickreturn.library.views.NotifyingWebView;
import com.h2team.android.lichvannien.R;
import vn.net.vac.base.c.g;
import vn.net.vac.base.c.h;
import vn.net.vac.base.c.k;
import vn.net.vac.base.c.n;
import vn.net.vac.base.dbmanager.model.Sao;

public class TuVi12ChomSaoDetaillActivity extends BaseActivity {
    @Bind({2131231024})
    NotifyingScrollView n;
    private NotifyingWebView o;
    Sao p;
    String q;
    private LinearLayout r;
    private LinearLayout s;
    private Button t;
    private Button u;
    private Button v;
    private Button w;
    private String x = "Dữ liệu đang cập nhật";
    private boolean y = true;

    class a implements OnClickListener {
        a() {
        }

        public void onClick(View view) {
            TuVi12ChomSaoDetaillActivity.this.b(1);
        }
    }

    class b implements OnClickListener {
        b() {
        }

        public void onClick(View view) {
            TuVi12ChomSaoDetaillActivity.this.b(2);
        }
    }

    class c implements OnClickListener {
        c() {
        }

        public void onClick(View view) {
            TuVi12ChomSaoDetaillActivity.this.b(3);
        }
    }

    class d implements OnClickListener {
        d() {
        }

        public void onClick(View view) {
            TuVi12ChomSaoDetaillActivity.this.b(4);
        }
    }

    class e extends WebViewClient {
        e(TuVi12ChomSaoDetaillActivity tuVi12ChomSaoDetaillActivity) {
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
            TuVi12ChomSaoDetaillActivity.this.r.setLayoutParams(this.b);
        }

        public void b(int i) {
            this.a.setVisibility(8);
            this.b.addRule(12);
            TuVi12ChomSaoDetaillActivity.this.r.setLayoutParams(this.b);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00eb A:{Catch:{ Exception -> 0x0134 }} */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00e8 A:{Catch:{ Exception -> 0x0134 }} */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00f3 A:{Catch:{ Exception -> 0x0134 }} */
    /* JADX WARNING: Missing block: B:5:0x0038, code skipped:
            if (r11 != 4) goto L_0x0138;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(int i) {
        this.o.getSettings().setCacheMode(2);
        this.o.getSettings().setTextZoom(getResources().getInteger(R.integer.tuvi_webview_text_zoom));
        this.o.setHapticFeedbackEnabled(false);
        this.o.getSettings().setLayoutAlgorithm(LayoutAlgorithm.SINGLE_COLUMN);
        if (i == 1) {
            try {
                this.s.setBackgroundResource(R.drawable.sao_tab1);
                this.q = vn.net.vac.base.c.e.a.a(this.p.d, h.a(this).a());
                this.q = n.b(this.q) ? this.x : this.q;
                if (this.y) {
                    if (!n.b(vn.net.vac.base.c.e.a.a(this.p.d, h.a(this).a()))) {
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.q = this.q.replace("font-family", "font-family-xxx");
            this.q = this.q.replace("font-size", "font-size-xxx");
            this.o.loadDataWithBaseURL("file:///android_asset/PhongThuy/Images/", String.format("%s%s%s", new Object[]{"<html><head><style type=\"text/css\">@font-face{font-family:MyFont;src:url(\"file:///android_asset/fonts/UVNBaiSau_R_0.TTF\");}@font-face{font-family:MyFontBold;src:url(\"file:///android_asset/fonts/UVNBaiSau.TTF\");}*{-webkit-user-select:none}body{font-family:MyFont;text-align:justify;padding:3px 5px;color:#2f2f2d;} b{font-family:MyFontBold;}</style></head><body>", this.q, "</body></html>"}), "text/html", "UTF-8", null);
            this.o.setWebViewClient(new e(this));
        } else if (i != 2) {
            if (i != 3) {
            }
            this.s.setBackgroundResource(R.drawable.sao_tab3);
            this.q = vn.net.vac.base.c.e.a.a(this.p.f, h.a(this).a());
            this.q = n.b(this.q) ? this.x : this.q;
            if (this.y) {
                if (!n.b(vn.net.vac.base.c.e.a.a(this.p.f, h.a(this).a()))) {
                }
                this.s.setBackgroundResource(R.drawable.sao_tab4);
                this.q = vn.net.vac.base.c.e.a.a(this.p.g, h.a(this).a());
                this.q = n.b(this.q) ? this.x : this.q;
            }
            this.q = this.q.replace("font-family", "font-family-xxx");
            this.q = this.q.replace("font-size", "font-size-xxx");
            this.o.loadDataWithBaseURL("file:///android_asset/PhongThuy/Images/", String.format("%s%s%s", new Object[]{"<html><head><style type=\"text/css\">@font-face{font-family:MyFont;src:url(\"file:///android_asset/fonts/UVNBaiSau_R_0.TTF\");}@font-face{font-family:MyFontBold;src:url(\"file:///android_asset/fonts/UVNBaiSau.TTF\");}*{-webkit-user-select:none}body{font-family:MyFont;text-align:justify;padding:3px 5px;color:#2f2f2d;} b{font-family:MyFontBold;}</style></head><body>", this.q, "</body></html>"}), "text/html", "UTF-8", null);
            this.o.setWebViewClient(new e(this));
        }
        this.s.setBackgroundResource(R.drawable.sao_tab2);
        this.q = vn.net.vac.base.c.e.a.a(this.p.e, h.a(this).a());
        this.q = n.b(this.q) ? this.x : this.q;
        if (this.y) {
            if (!n.b(vn.net.vac.base.c.e.a.a(this.p.e, h.a(this).a()))) {
            }
            this.s.setBackgroundResource(R.drawable.sao_tab3);
            this.q = vn.net.vac.base.c.e.a.a(this.p.f, h.a(this).a());
            if (n.b(this.q)) {
            }
            this.q = n.b(this.q) ? this.x : this.q;
            if (this.y) {
            }
        }
        this.q = this.q.replace("font-family", "font-family-xxx");
        this.q = this.q.replace("font-size", "font-size-xxx");
        this.o.loadDataWithBaseURL("file:///android_asset/PhongThuy/Images/", String.format("%s%s%s", new Object[]{"<html><head><style type=\"text/css\">@font-face{font-family:MyFont;src:url(\"file:///android_asset/fonts/UVNBaiSau_R_0.TTF\");}@font-face{font-family:MyFontBold;src:url(\"file:///android_asset/fonts/UVNBaiSau.TTF\");}*{-webkit-user-select:none}body{font-family:MyFont;text-align:justify;padding:3px 5px;color:#2f2f2d;} b{font-family:MyFontBold;}</style></head><body>", this.q, "</body></html>"}), "text/html", "UTF-8", null);
        this.o.setWebViewClient(new e(this));
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void q() {
        b(1);
        this.y = 1 ^ this.y;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.tuvi_bottom_size);
        c.b.a.a.b.b.b bVar = new c.b.a.a.b.b.b(c.b.a.a.a.a.FOOTER);
        bVar.a(this.r);
        bVar.a(dimensionPixelSize);
        this.n.setOnScrollChangedListener(bVar.a());
        this.t.setOnClickListener(new a());
        this.u.setOnClickListener(new b());
        this.v.setOnClickListener(new c());
        this.w.setOnClickListener(new d());
    }

    private void r() {
        if (getIntent().getExtras() != null) {
            this.p = (Sao) getIntent().getSerializableExtra("EXTRA_SAO");
        }
    }

    private void s() {
        g.a((Context) this, 18, (TextView) findViewById(R.id.lblTitle));
    }

    private void t() {
        a(R.drawable.btn_back_2, this.p.b, 0);
        this.o = (NotifyingWebView) findViewById(R.id.webView);
        this.r = (LinearLayout) findViewById(R.id.listViewBottom);
        this.s = (LinearLayout) findViewById(R.id.listViewBottomBtn);
        this.o.setBackgroundColor(Color.argb(1, 0, 0, 0));
        this.t = (Button) findViewById(R.id.btnPt1Tab1);
        this.u = (Button) findViewById(R.id.btnPt1Tab2);
        this.v = (Button) findViewById(R.id.btnPt1Tab3);
        this.w = (Button) findViewById(R.id.btnPt1Tab4);
    }

    /* Access modifiers changed, original: protected */
    public void j() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.layadDisplay);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.layad);
        frameLayout.setVisibility(8);
        LayoutParams layoutParams = (LayoutParams) this.r.getLayoutParams();
        layoutParams.addRule(12);
        this.r.setLayoutParams(layoutParams);
        if (!k.a((Context) this).d()) {
            this.m.a().setAdListener(new f(frameLayout, layoutParams));
            this.m.a(linearLayout);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_tu_vi_12_chom_sao_detail);
        ButterKnife.bind((Activity) this);
        r();
        t();
        q();
        s();
        j();
    }
}
