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

public class XongNhaActivity extends BaseActivity {
    private WebView n;

    class a extends WebViewClient {
        a(XongNhaActivity xongNhaActivity) {
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
        this.n.loadUrl("file:///android_asset/XongNha/tuoixongnha.html");
        this.n.setWebViewClient(new a(this));
    }

    private void r() {
    }

    private void s() {
        g.a((Context) this, 18, (TextView) findViewById(R.id.lblTitle));
    }

    private void t() {
        a(R.drawable.btn_back_2, "XEM TUỔI XÔNG NHÀ", 0);
        this.n = (WebView) findViewById(R.id.webView);
        this.n.setBackgroundColor(Color.argb(1, 0, 0, 0));
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_xong_nha);
        r();
        t();
        q();
        s();
        j();
    }
}
