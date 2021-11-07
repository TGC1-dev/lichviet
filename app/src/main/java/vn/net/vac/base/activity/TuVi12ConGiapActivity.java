package vn.net.vac.base.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.webkit.WebSettings.LayoutAlgorithm;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import butterknife.Bind;
import butterknife.ButterKnife;
import com.etiennelawlor.quickreturn.library.views.NotifyingScrollView;
import com.etiennelawlor.quickreturn.library.views.NotifyingWebView;
import com.h2team.android.lichvannien.R;
import java.util.ArrayList;
import java.util.List;
import vn.net.vac.base.c.g;
import vn.net.vac.base.c.h;
import vn.net.vac.base.dbmanager.model.TuVi2014;

public class TuVi12ConGiapActivity extends BaseActivity {
    @Bind({2131231024})
    NotifyingScrollView n;
    private NotifyingWebView o;
    TuVi2014 p;
    String q;
    private LinearLayout r;
    int s;
    private Spinner t;
    private vn.net.vac.base.view.e.a u;

    class a implements OnItemSelectedListener {
        a() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            TuVi12ConGiapActivity.this.u.a(i);
            TuVi12ConGiapActivity.this.b(((vn.net.vac.base.view.e.b) adapterView.getItemAtPosition(i)).a());
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    class b extends WebViewClient {
        b(TuVi12ConGiapActivity tuVi12ConGiapActivity) {
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

    private void b(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<html><head><style type=\"text/css\">@font-face{font-family:MyFont;src:url(\"file:///android_asset/fonts/UVNBaiSau_R_0.TTF\");}@font-face{font-family:MyFontBold;src:url(\"file:///android_asset/fonts/UVNBaiSau.TTF\");}*{-webkit-user-select:none;-webkit-tap-highlight-color: transparent;-webkit-tap-highlight-color: rgba(255, 255, 255, 0);}body{font-family:MyFont;text-align:justify;padding:");
        stringBuilder.append(((float) this.s) / displayMetrics.density);
        stringBuilder.append("px 5px 3px 5px;color:#2f2f2d;} strong,b{font-family:MyFontBold;}</style></head><body>");
        String stringBuilder2 = stringBuilder.toString();
        this.o.getSettings().setCacheMode(2);
        this.o.getSettings().setTextZoom(getResources().getInteger(R.integer.tuvi_webview_text_zoom));
        this.o.setHapticFeedbackEnabled(false);
        this.o.getSettings().setLayoutAlgorithm(LayoutAlgorithm.SINGLE_COLUMN);
        this.p = vn.net.vac.base.b.a.h(i);
        try {
            this.q = vn.net.vac.base.c.e.a.a(this.p.c, h.a(this).a());
        } catch (Exception unused) {
            this.q = this.p.c;
        }
        this.q = this.q.replace("/Content/imageUpload/image/", "");
        this.q = this.q.replace("http://tuvi2014.net/wp-content/uploads/2013/03/", "tuonghop/");
        this.q = this.q.replace("font-family", "font-family-xxx");
        this.q = this.q.replace("font-size", "font-size-xxx");
        String str = "file:///android_asset/TuVi12ConGiap/";
        this.o.loadDataWithBaseURL(str, String.format("%s%s%s", new Object[]{stringBuilder2, this.q, "</body></html>"}), "text/html", "UTF-8", null);
        this.o.setWebViewClient(new b(this));
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void q() {
        this.s = getResources().getDimensionPixelSize(R.dimen.acivity_tu_vi_12_con_giap_select_size);
        c.b.a.a.b.b.b bVar = new c.b.a.a.b.b.b(c.b.a.a.a.a.HEADER);
        bVar.b(this.r);
        bVar.b(-this.s);
        this.n.setOnScrollChangedListener(bVar.a());
        b(1);
        this.t.setOnItemSelectedListener(new a());
    }

    private void r() {
        List<TuVi2014> f = vn.net.vac.base.b.a.f();
        ArrayList arrayList = new ArrayList();
        for (TuVi2014 tuVi2014 : f) {
            int i = (int) tuVi2014.a;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(tuVi2014.b.replace("Xem tử vi tuổi ", ""));
            stringBuilder.append("      ");
            arrayList.add(new vn.net.vac.base.view.e.b(i, stringBuilder.toString()));
        }
        this.u = new vn.net.vac.base.view.e.a(this, arrayList);
        this.t.setAdapter(this.u);
    }

    private void s() {
        g.a((Context) this, 10, (TextView) findViewById(R.id.lblChonTuoi));
        g.a((Context) this, 18, (TextView) findViewById(R.id.lblTitle));
    }

    private void t() {
        a(R.drawable.btn_back_2, "TỬ VI 12 CON GIÁP", 0);
        this.o = (NotifyingWebView) findViewById(R.id.webView);
        this.r = (LinearLayout) findViewById(R.id.selectConGiap);
        this.o.setBackgroundColor(Color.argb(1, 0, 0, 0));
        this.t = (Spinner) findViewById(R.id.spinner);
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_tu_vi_12_con_giap);
        ButterKnife.bind((Activity) this);
        t();
        r();
        q();
        s();
        j();
    }
}
