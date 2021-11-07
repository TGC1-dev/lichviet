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

public class WebviewGiaithichActivity extends BaseActivity {
    String n;
    private WebView o;

    class a extends WebViewClient {
        a(WebviewGiaithichActivity webviewGiaithichActivity) {
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
        this.o.getSettings().setCacheMode(2);
        this.o.getSettings().setTextZoom(getResources().getInteger(R.integer.tuvi_webview_text_zoom));
        this.o.setHapticFeedbackEnabled(false);
        this.o.getSettings().setLayoutAlgorithm(LayoutAlgorithm.SINGLE_COLUMN);
        if ("TAG_TLB".equals(this.n)) {
            this.o.loadUrl("file:///android_asset/GiaiThich/infor_thuocloban.html");
        } else {
            if ("TAG_XEMHUONGNHA".equals(this.n)) {
                this.o.loadUrl("file:///android_asset/GiaiThich/infor_xemhuongnha.html");
            } else {
                if ("TAG_XEMTUOI_XAYNHA".equals(this.n)) {
                    this.o.loadUrl("file:///android_asset/GiaiThich/infor_xemtuoi_xaynha.html");
                }
            }
        }
        this.o.setWebViewClient(new a(this));
    }

    private void r() {
        if (getIntent().getExtras() != null) {
            this.n = getIntent().getStringExtra("EXTRA_TAG");
        }
    }

    private void s() {
        g.a((Context) this, 18, (TextView) findViewById(R.id.lblTitle));
    }

    private void t() {
        if ("TAG_TLB".equals(this.n)) {
            a(R.drawable.btn_back_2, "THƯỚC LỖ BAN ?", 0);
        } else {
            if ("TAG_XEMHUONGNHA".equals(this.n)) {
                a(R.drawable.btn_back_2, "XEM HƯỚNG NHÀ ?", 0);
            } else {
                if ("TAG_XEMTUOI_XAYNHA".equals(this.n)) {
                    a(R.drawable.btn_back_2, "XEM TUỔI XÂY NHÀ ?", 0);
                } else {
                    a((int) R.drawable.btn_back, "");
                }
            }
        }
        this.o = (WebView) findViewById(R.id.webView);
        this.o.setBackgroundColor(Color.argb(1, 0, 0, 0));
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_webview_giaithich);
        r();
        t();
        q();
        s();
        j();
    }
}
