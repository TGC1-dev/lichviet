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
import vn.net.vac.base.dbmanager.model.QueQuanAm;

public class HaiLocDauXuanBinhGiaiActivity extends BaseActivity {
    private WebView n;
    QueQuanAm o;
    String p;

    class a extends WebViewClient {
        a(HaiLocDauXuanBinhGiaiActivity haiLocDauXuanBinhGiaiActivity) {
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
        this.n.setLayerType(1, null);
        this.n.getSettings().setCacheMode(2);
        this.n.getSettings().setTextZoom(getResources().getInteger(R.integer.tuvi_webview_text_zoom));
        this.n.setHapticFeedbackEnabled(false);
        this.n.getSettings().setLayoutAlgorithm(LayoutAlgorithm.SINGLE_COLUMN);
        try {
            this.p = String.format("<b>%s</b><br>%s", new Object[]{vn.net.vac.base.c.e.a.a(this.o.b, h.a(this).a()), vn.net.vac.base.c.e.a.a(this.o.c, h.a(this).a())});
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.p = this.p.replace("font-family", "font-family-xxx");
        this.p = this.p.replace("font-size", "font-size-xxx");
        String str = "file:///android_asset/";
        this.n.loadDataWithBaseURL(str, String.format("%s%s%s", new Object[]{"<html><head><style type=\"text/css\">@font-face{font-family:MyFont;src:url(\"file:///android_asset/fonts/UVNVan_R.ttf\");}@font-face{font-family:MyFontBold;src:url(\"file:///android_asset/fonts/UVNVan.ttf\");}*{-webkit-user-select:none}body{font-family:MyFont;text-align:justify;padding:3px 5px;color:#2f2f2d;} b{font-family:MyFontBold;}</style></head><body>", this.p, "</body></html>"}), "text/html", "UTF-8", null);
        this.n.setWebViewClient(new a(this));
    }

    private void r() {
        if (getIntent().getExtras() != null) {
            this.o = (QueQuanAm) getIntent().getSerializableExtra("EXTRA_QUE_QUAN_AM");
        }
    }

    private void s() {
        g.a((Context) this, 10, (TextView) findViewById(R.id.lblTitle));
    }

    private void t() {
        a((int) R.drawable.btn_back, this.o.a);
        ((TextView) findViewById(R.id.lblTitle)).setGravity(17);
        this.n = (WebView) findViewById(R.id.webView);
        this.n.setBackgroundColor(Color.argb(1, 0, 0, 0));
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_hai_loc_dau_xuan_binh_giai);
        r();
        t();
        q();
        s();
        j();
    }
}
