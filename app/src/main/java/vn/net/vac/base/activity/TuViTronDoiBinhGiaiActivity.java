package vn.net.vac.base.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.webkit.WebSettings.LayoutAlgorithm;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import com.h2team.android.lichvannien.R;
import vn.net.vac.base.c.g;
import vn.net.vac.base.c.h;
import vn.net.vac.base.dbmanager.model.TronDoi;

public class TuViTronDoiBinhGiaiActivity extends BaseActivity {
    private WebView n;
    TronDoi o;
    String p;
    int q;
    int r;
    private String[] s = new String[]{"NỮ MẠNG", "NAM MẠNG"};

    class a extends WebViewClient {
        a(TuViTronDoiBinhGiaiActivity tuViTronDoiBinhGiaiActivity) {
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

    @SuppressLint({"SetJavaScriptEnabled"})
    private void q() {
        this.n.getSettings().setCacheMode(2);
        this.n.getSettings().setTextZoom(getResources().getInteger(R.integer.tuvi_webview_text_zoom));
        this.n.setHapticFeedbackEnabled(false);
        this.n.getSettings().setLayoutAlgorithm(LayoutAlgorithm.SINGLE_COLUMN);
        try {
            this.p = 1 == this.r ? this.o.c : this.o.d;
            this.p = vn.net.vac.base.c.e.a.a(this.p, h.a(this).a());
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.p = this.p.replace("font-family", "font-family-xxx");
        this.p = this.p.replace("font-size", "font-size-xxx");
        this.n.loadDataWithBaseURL("file:///android_asset/TronDoi/", String.format("%s%s%s", new Object[]{"<html><head><style type=\"text/css\">@font-face{font-family:MyFont;src:url(\"file:///android_asset/fonts/UVNBaiSau_R_0.TTF\");}@font-face{font-family:MyFontBold;src:url(\"file:///android_asset/fonts/UVNBaiSau.TTF\");}*{-webkit-user-select:none}body{font-family:MyFont;text-align:justify;padding:3px 5px;color:#2f2f2d;} b{font-family:MyFontBold;}</style></head><body>", this.p, "</body></html>"}), "text/html", "UTF-8", null);
        this.n.setWebViewClient(new a(this));
    }

    private void r() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.q = extras.getInt("EXTRA_TRON_DOI_ID");
            this.r = extras.getInt("EXTRA_TRON_DOI_GIOI_TINH");
            this.o = vn.net.vac.base.b.a.g(this.q);
        }
    }

    private void s() {
        g.a((Context) this, 18, (TextView) findViewById(R.id.lblTitle));
    }

    private void t() {
        a(R.drawable.btn_back_2, String.format("%s - %s", new Object[]{this.o.b, this.s[this.r]}), 0);
        this.n = (WebView) findViewById(R.id.webView);
        this.n.setBackgroundColor(Color.argb(1, 0, 0, 0));
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_tu_vi_tron_doi_binh_giai);
        r();
        t();
        q();
        s();
        j();
    }
}
