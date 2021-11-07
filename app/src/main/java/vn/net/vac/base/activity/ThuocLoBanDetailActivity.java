package vn.net.vac.base.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.webkit.WebSettings.LayoutAlgorithm;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.h2team.android.lichvannien.R;
import vn.net.vac.base.c.g;
import vn.net.vac.base.dbmanager.model.ThuocLoBan;
import vn.net.vac.base.view.ClearableEditText;

public class ThuocLoBanDetailActivity extends BaseActivity {
    private WebView n;
    double o;
    String p;
    String q;
    String r;
    @Bind({2131230918})
    ClearableEditText s;
    @Bind({2131230793})
    ImageView t;

    class a extends WebViewClient {
        a(ThuocLoBanDetailActivity thuocLoBanDetailActivity) {
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

    class b implements OnKeyListener {
        b() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            ThuocLoBanDetailActivity.this.i();
            return false;
        }
    }

    private void r() {
        this.s.setOnKeyListener(new b());
    }

    private void s() {
        ClearableEditText clearableEditText = this.s;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(this.o);
        clearableEditText.setText(stringBuilder.toString());
        w();
    }

    private void t() {
        g.a((Context) this, 18, (TextView) findViewById(R.id.lblTitle));
        g.a((Context) this, findViewById(R.id.llInnerControl), 12);
    }

    private void u() {
        if (getIntent().getExtras() != null) {
            this.o = Double.parseDouble(getIntent().getStringExtra("EXTRA_VALUE"));
        }
    }

    private void v() {
        a(R.drawable.btn_back_2, "THƯỚC LỖ BAN", 0);
        this.n = (WebView) findViewById(R.id.webView);
        this.n.setBackgroundColor(Color.argb(1, 0, 0, 0));
        this.q = "<html><head><style type=\"text/css\">@font-face{font-family:MyFont;src:url(\"file:///android_asset/fonts/UVNBaiSau_R_0.TTF\");}@font-face{font-family:MyFontBold;src:url(\"file:///android_asset/fonts/UVNBaiSau.TTF\");}*{-webkit-user-select:none}body{font-family:MyFont;text-align:justify;padding:3px 5px;color:#2f2f2d;} b{font-family:MyFontBold;}</style></head><body>";
        this.r = "</body></html>";
        this.n.getSettings().setCacheMode(2);
        this.n.getSettings().setTextZoom(getResources().getInteger(R.integer.tuvi_webview_text_zoom));
        this.n.setHapticFeedbackEnabled(false);
        this.n.getSettings().setLayoutAlgorithm(LayoutAlgorithm.SINGLE_COLUMN);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void w() {
        String obj = this.s.getText().toString();
        if (obj.replace(".", "").length() == 0) {
            a("Vui lòng hãy nhập kích thước cần xem!");
        } else if (Double.parseDouble(obj) > 1000000.0d) {
            a("Vui lòng hãy nhập kích thước cần xem bé hơn!");
        } else {
            long parseDouble = ((long) ((Double.parseDouble(obj) * 10.0d) % 522.0d)) * 100;
            long j = parseDouble / 6525;
            parseDouble = (parseDouble % 6525) / 1305;
            ThuocLoBan a = vn.net.vac.base.b.a.a(1, 0, j);
            ThuocLoBan a2 = vn.net.vac.base.b.a.a(1, j, 1, parseDouble);
            long parseDouble2 = ((long) ((Double.parseDouble(obj) * 10.0d) % 429.0d)) * 1000;
            long j2 = parseDouble2 / 53625;
            long j3 = ((parseDouble2 % 53625) * 100) / 1340625;
            ThuocLoBan a3 = vn.net.vac.base.b.a.a(2, 0, j2);
            ThuocLoBan a4 = vn.net.vac.base.b.a.a(1, j2, 2, j3);
            long parseDouble3 = ((long) ((Double.parseDouble(obj) * 10.0d) % 388.0d)) * 10;
            long j4 = parseDouble3 / 388;
            parseDouble3 = (parseDouble3 % 388) / 97;
            ThuocLoBan a5 = vn.net.vac.base.b.a.a(3, 0, j4);
            ThuocLoBan a6 = vn.net.vac.base.b.a.a(1, j4, 3, parseDouble3);
            try {
                this.p = String.format("<div> <p> <b><span style=\"color:#ff0000;\">THƯỚC LỖ BAN 52.2CM:</span></b></br></br><b>- Cung lớn:</b> %s. %s</br><b>- Cung nhỏ:</b> %s</br></p><p> <b><span style=\"color:#ff0000\">THƯỚC LỖ BAN 42.9CM:</span></b></br></br><b>- Cung lớn:</b> %s. %s</br><b>- Cung nhỏ:</b> %s</br></p><p> <b><span style=\"color:#ff0000\">THƯỚC LỖ BAN 38.8CM:</span></b></br></br><b>- Cung lớn:</b> %s. %s</br><b>- Cung nhỏ:</b> %s</br></p></div>", new Object[]{a.a.toUpperCase(), a.b, a2.a, a3.a.toUpperCase(), a3.b, a4.a, a5.a.toUpperCase(), a5.b, a6.a});
            } catch (Exception unused) {
            }
            String str = "file:///android_asset/ThuocLoBan/";
            this.n.loadDataWithBaseURL(str, String.format("%s%s%s", new Object[]{this.q, this.p, this.r}), "text/html", "UTF-8", null);
            this.n.setWebViewClient(new a(this));
        }
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_thuocloban_detail);
        ButterKnife.bind((Activity) this);
        u();
        v();
        s();
        r();
        t();
        j();
    }

    @OnClick({2131230793})
    public void q() {
        w();
    }
}
