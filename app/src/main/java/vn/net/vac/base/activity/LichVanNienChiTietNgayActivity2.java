package vn.net.vac.base.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebSettings.LayoutAlgorithm;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import butterknife.Bind;
import butterknife.ButterKnife;
import com.h2team.android.lichvannien.R;
import java.util.Calendar;
import vn.net.vac.base.c.g;
import vn.net.vac.base.c.h;
import vn.net.vac.base.dbmanager.model.ThapNhiTinhBatTu;

public class LichVanNienChiTietNgayActivity2 extends BaseActivity {
    int n;
    int o;
    int p;
    int q;
    @Bind({2131230960})
    TextView r;
    @Bind({2131231124})
    WebView s;
    String t;
    String[] u = new String[]{"hắc đạo", "hoàng đạo"};

    class a extends WebViewClient {
        a(LichVanNienChiTietNgayActivity2 lichVanNienChiTietNgayActivity2) {
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
        }
    }

    class b implements OnClickListener {
        final /* synthetic */ Dialog a;

        b(LichVanNienChiTietNgayActivity2 lichVanNienChiTietNgayActivity2, Dialog dialog) {
            this.a = dialog;
        }

        public void onClick(View view) {
            this.a.dismiss();
        }
    }

    private void q() {
    }

    private void r() {
        v();
    }

    private void s() {
        g.a((Context) this, 18, this.r);
    }

    private void t() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.n = extras.getInt("EXTRA_YEAR");
            this.o = extras.getInt("EXTRA_MOTH");
            this.p = extras.getInt("EXTRA_DAY");
        }
        this.q = Calendar.getInstance().get(11);
    }

    private void u() {
        a(R.drawable.btn_back_2, String.format("Ngày %d/%d/%d", new Object[]{Integer.valueOf(this.p), Integer.valueOf(this.o), Integer.valueOf(this.n)}).toUpperCase(), vn.net.vac.base.c.a.a.s(this.p, this.o, this.n) == 0 ? R.drawable._star_0 : R.drawable._star_1);
        this.s.setBackgroundColor(Color.argb(1, 0, 0, 0));
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void v() {
        this.s.getSettings().setCacheMode(2);
        this.s.getSettings().setTextZoom(getResources().getInteger(R.integer.tuvi_webview_text_zoom));
        this.s.setHapticFeedbackEnabled(false);
        this.s.getSettings().setLayoutAlgorithm(LayoutAlgorithm.SINGLE_COLUMN);
        r1 = new Object[2];
        String str = "Giờ Hoàng Đạo:";
        r1[0] = str;
        r1[1] = vn.net.vac.base.c.a.a.c(this.p, this.o, this.n);
        String str2 = "<b style=\"color:#ff6f0f\";>・%s</b><br>%s<br><br>";
        String format = String.format(str2, r1);
        String format2 = String.format(str2, new Object[]{"Tiết Khí:", vn.net.vac.base.c.a.a.l(this.p, this.o, this.n)});
        Object[] objArr = new Object[2];
        objArr[0] = "Sao:";
        String str3 = "\\.";
        objArr[1] = vn.net.vac.base.c.a.a.h(this.p, this.o, this.n).split(str3)[1];
        String format3 = String.format(str2, objArr);
        Object[] objArr2 = new Object[2];
        objArr2[0] = str;
        objArr2[1] = "Dần(3-5h), Thìn(7-9h), Tỵ(9-11h), Thân(15-17h), Dậu(17-19h), Hợi(21-23h)";
        String.format(str2, objArr2);
        String.format(str2, new Object[]{str, "Dần(3-5h), Thìn(7-9h), Tỵ(9-11h), Thân(15-17h), Dậu(17-19h), Hợi(21-23h)"});
        String.format(str2, new Object[]{str, "Dần(3-5h), Thìn(7-9h), Tỵ(9-11h), Thân(15-17h), Dậu(17-19h), Hợi(21-23h)"});
        ThapNhiTinhBatTu d = vn.net.vac.base.b.a.d(vn.net.vac.base.c.a.a.h(this.p, this.o, this.n).split(str3)[0]);
        try {
            d.b = vn.net.vac.base.c.e.a.a(d.b, h.a(this).a());
        } catch (Exception unused) {
            d.b = "";
        }
        str = String.format(str2, new Object[]{"Nhị Thập Bát Tú:", d.b});
        objArr2 = new Object[2];
        objArr2[0] = "Ngày Bát Tự:";
        objArr2[1] = String.format("Giờ %s - Ngày %s - Tháng %s - Năm %s", new Object[]{vn.net.vac.base.c.a.a.b(this.q, this.p, this.o, this.n), vn.net.vac.base.c.a.a.g(this.p, this.o, this.n), vn.net.vac.base.c.a.a.j(this.p, this.o, this.n), vn.net.vac.base.c.a.a.e(this.p, this.o, this.n)});
        str2 = String.format(str2, objArr2);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str2);
        stringBuilder.append(format);
        stringBuilder.append(format2);
        stringBuilder.append(format3);
        stringBuilder.append(str);
        this.t = stringBuilder.toString();
        String str4 = "file:///android_asset/";
        this.s.loadDataWithBaseURL(str4, String.format("%s%s%s", new Object[]{"<html><head><style type=\"text/css\">@font-face{font-family:MyFont;src:url(\"file:///android_asset/fonts/UVNBaiSau_R_0.TTF\");}@font-face{font-family:MyFontBold;src:url(\"file:///android_asset/fonts/UVNBaiSau.TTF\");}*{-webkit-user-select:none}body{font-family:MyFont;text-align:justify;padding:3px 5px;color:#2f2f2d;} b{font-family:MyFontBold;}</style></head><body>", this.t, "</body></html>"}), "text/html", "UTF-8", null);
        this.s.setWebViewClient(new a(this));
    }

    /* Access modifiers changed, original: protected */
    public void k() {
        Dialog dialog = new Dialog(this, R.style.FullHeightDialog);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.layout_dialog_title_content);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialog.getWindow().setLayout(-1, -2);
        dialog.findViewById(R.id.dialogTitle).setVisibility(4);
        ((TextView) dialog.findViewById(R.id.dialogContent)).setText(String.format("Ngày %d/%d/%d là ngày %s!", new Object[]{Integer.valueOf(this.p), Integer.valueOf(this.o), Integer.valueOf(this.n), this.u[vn.net.vac.base.c.a.a.s(this.p, this.o, this.n)]}));
        g.a((Context) this, 17, r2);
        g.a((Context) this, 17, (TextView) dialog.findViewById(R.id.dialogBtnClose));
        dialog.findViewById(R.id.dialogBtnClose).setOnClickListener(new b(this, dialog));
        dialog.show();
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_lich_van_nien_chi_tiet_ngay2);
        ButterKnife.bind((Activity) this);
        t();
        u();
        r();
        q();
        s();
        j();
    }
}
