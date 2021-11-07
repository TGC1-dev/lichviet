package vn.net.vac.base.activity;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import com.h2team.android.lichvannien.R;
import vn.net.vac.base.MyApplication;
import vn.net.vac.base.c.p;

public class BaseActivity extends FragmentActivity {
    protected View l;
    protected MyApplication m;

    class b implements OnClickListener {
        final /* synthetic */ Dialog a;

        b(Dialog dialog) {
            this.a = dialog;
        }

        public void onClick(View view) {
            this.a.dismiss();
            BaseActivity.this.g();
            super.onBackPressed();
        }
    }

    class c implements OnClickListener {
        final /* synthetic */ Dialog a;

        c(BaseActivity baseActivity, Dialog dialog) {
            this.a = dialog;
        }

        public void onClick(View view) {
            this.a.dismiss();
        }
    }

    class d implements OnClickListener {
        final /* synthetic */ Dialog a;

        d(Dialog dialog) {
            this.a = dialog;
        }

        public void onClick(View view) {
            this.a.dismiss();
            BaseActivity.this.l();
        }
    }

    class e implements OnClickListener {
        final /* synthetic */ Dialog a;

        e(BaseActivity baseActivity, Dialog dialog) {
            this.a = dialog;
        }

        public void onClick(View view) {
            this.a.dismiss();
        }
    }

    class f implements OnClickListener {
        final /* synthetic */ Dialog a;

        f(Dialog dialog) {
            this.a = dialog;
        }

        public void onClick(View view) {
            this.a.dismiss();
            BaseActivity.this.l();
        }
    }

    class g implements OnClickListener {
        final /* synthetic */ Dialog a;

        g(BaseActivity baseActivity, Dialog dialog) {
            this.a = dialog;
        }

        public void onClick(View view) {
            this.a.dismiss();
        }
    }

    class h implements OnClickListener {
        final /* synthetic */ Dialog a;

        h(Dialog dialog) {
            this.a = dialog;
        }

        public void onClick(View view) {
            this.a.dismiss();
            new vn.net.vac.base.c.m(BaseActivity.this).a("[Android] [Lịch vạn niên] - Góp ý", "", BaseActivity.this.getString(R.string.mail));
        }
    }

    class i implements OnClickListener {
        final /* synthetic */ Dialog a;

        i(BaseActivity baseActivity, Dialog dialog) {
            this.a = dialog;
        }

        public void onClick(View view) {
            this.a.dismiss();
        }
    }

    class j implements OnClickListener {
        final /* synthetic */ Dialog a;

        j(BaseActivity baseActivity, Dialog dialog) {
            this.a = dialog;
        }

        public void onClick(View view) {
            this.a.dismiss();
        }
    }

    class k implements OnClickListener {
        k() {
        }

        public void onClick(View view) {
            BaseActivity.this.onBackPressed();
        }
    }

    class l implements OnClickListener {
        l() {
        }

        public void onClick(View view) {
            androidx.core.app.e.a(BaseActivity.this);
            androidx.core.app.e.c(BaseActivity.this);
        }
    }

    class m implements OnClickListener {
        m() {
        }

        public void onClick(View view) {
            BaseActivity.this.onBackPressed();
        }
    }

    class n implements OnClickListener {
        n() {
        }

        public void onClick(View view) {
            BaseActivity.this.onBackPressed();
        }
    }

    class o implements OnClickListener {
        o() {
        }

        public void onClick(View view) {
            BaseActivity.this.k();
        }
    }

    class a extends com.google.android.gms.ads.c {
        final /* synthetic */ FrameLayout a;

        a(BaseActivity baseActivity, FrameLayout frameLayout) {
            this.a = frameLayout;
        }

        public void M() {
            this.a.setVisibility(0);
        }

        public void b(int i) {
            this.a.setVisibility(8);
        }
    }

    /* Access modifiers changed, original: protected */
    public void g() {
        h().a("");
    }

    /* Access modifiers changed, original: protected */
    public MyApplication h() {
        return (MyApplication) getApplication();
    }

    /* Access modifiers changed, original: protected */
    public void i() {
        try {
            ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 2);
        } catch (Exception unused) {
        }
    }

    /* Access modifiers changed, original: protected */
    public void j() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.layadDisplay);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.layad);
        frameLayout.setVisibility(8);
        if (!vn.net.vac.base.c.k.a((Context) this).d()) {
            this.m.a().setAdListener(new a(this, frameLayout));
            this.m.a(linearLayout);
        }
    }

    /* Access modifiers changed, original: protected */
    public void k() {
    }

    /* Access modifiers changed, original: protected */
    public void l() {
        String str = "android.intent.action.VIEW";
        StringBuilder stringBuilder;
        try {
            Intent intent = new Intent(str);
            stringBuilder = new StringBuilder();
            stringBuilder.append("market://details?id=");
            stringBuilder.append(getPackageName());
            intent.setData(Uri.parse(stringBuilder.toString()));
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("https://play.google.com/store/apps/details?id=");
            stringBuilder.append(getPackageName());
            startActivity(new Intent(str, Uri.parse(stringBuilder.toString())));
        }
    }

    /* Access modifiers changed, original: protected */
    public void m() {
        Dialog dialog = new Dialog(this, R.style.FullHeightDialog);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.layout_dialog_danhgia);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialog.getWindow().setLayout(-1, -2);
        vn.net.vac.base.c.g.a((Context) this, 17, (TextView) dialog.findViewById(R.id.dialogLoingoTitle));
        vn.net.vac.base.c.g.a((Context) this, 17, (TextView) dialog.findViewById(R.id.dialogTxt));
        vn.net.vac.base.c.g.a((Context) this, 17, (TextView) dialog.findViewById(R.id.dialogBtnRating));
        vn.net.vac.base.c.g.a((Context) this, 17, (TextView) dialog.findViewById(R.id.dialogBtnDonotRating));
        dialog.findViewById(R.id.dialogBtnRating).setOnClickListener(new f(dialog));
        dialog.findViewById(R.id.dialogBtnDonotRating).setOnClickListener(new g(this, dialog));
        dialog.show();
    }

    /* Access modifiers changed, original: protected */
    public void n() {
        Dialog dialog = new Dialog(this, R.style.FullHeightDialog);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.layout_dialog_close_confirm);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialog.getWindow().setLayout(-1, -2);
        vn.net.vac.base.c.g.a((Context) this, 16, (TextView) dialog.findViewById(R.id.dialogLoingoTitle));
        vn.net.vac.base.c.g.a((Context) this, 17, (TextView) dialog.findViewById(R.id.dialogTxt));
        vn.net.vac.base.c.g.a((Context) this, 17, (TextView) dialog.findViewById(R.id.dialogBtnDonotCloseApp));
        vn.net.vac.base.c.g.a((Context) this, 17, (TextView) dialog.findViewById(R.id.dialogBtnCloseApp));
        dialog.findViewById(R.id.dialogBtnCloseApp).setOnClickListener(new b(dialog));
        dialog.findViewById(R.id.dialogBtnDonotCloseApp).setOnClickListener(new c(this, dialog));
        dialog.show();
    }

    /* Access modifiers changed, original: protected */
    public void o() {
        Dialog dialog = new Dialog(this, R.style.FullHeightDialog);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.layout_dialog_gopy);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialog.getWindow().setLayout(-1, -2);
        vn.net.vac.base.c.g.a((Context) this, 17, (TextView) dialog.findViewById(R.id.dialogLoingoTitle));
        vn.net.vac.base.c.g.a((Context) this, 17, (TextView) dialog.findViewById(R.id.dialogTxt));
        vn.net.vac.base.c.g.a((Context) this, 17, (TextView) dialog.findViewById(R.id.dialogBtnRating));
        vn.net.vac.base.c.g.a((Context) this, 17, (TextView) dialog.findViewById(R.id.dialogBtnDonotRating));
        dialog.findViewById(R.id.dialogBtnRating).setOnClickListener(new h(dialog));
        dialog.findViewById(R.id.dialogBtnDonotRating).setOnClickListener(new i(this, dialog));
        dialog.show();
    }

    /* Access modifiers changed, original: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
        vn.net.vac.base.c.k.a((Context) this).c(false);
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.m = (MyApplication) getApplication();
    }

    /* Access modifiers changed, original: protected */
    public void onDestroy() {
        super.onDestroy();
    }

    /* Access modifiers changed, original: protected */
    public void onPause() {
        super.onPause();
    }

    /* Access modifiers changed, original: protected */
    public void onResume() {
        super.onResume();
        h().a(getClass().getName());
    }

    public void onUserInteraction() {
        super.onUserInteraction();
        MyApplication myApplication = this.m;
        int i = myApplication.e;
        if (!(0 != ((long) i) % 35 || i == 0 || 200 == ((long) i))) {
            myApplication.c();
            if (!vn.net.vac.base.c.k.a((Context) this).d()) {
                this.m.c();
            }
        }
        if (200 == ((long) this.m.e)) {
            p();
        }
        myApplication = this.m;
        myApplication.e++;
    }

    /* Access modifiers changed, original: protected */
    public void p() {
        Dialog dialog = new Dialog(this, R.style.FullHeightDialog);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.layout_dialog_rating);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialog.getWindow().setLayout(-1, -2);
        vn.net.vac.base.c.g.a((Context) this, 17, (TextView) dialog.findViewById(R.id.dialogTxt));
        vn.net.vac.base.c.g.a((Context) this, 17, (TextView) dialog.findViewById(R.id.dialogBtnRating));
        vn.net.vac.base.c.g.a((Context) this, 17, (TextView) dialog.findViewById(R.id.dialogBtnDonotRating));
        dialog.findViewById(R.id.dialogBtnRating).setOnClickListener(new d(dialog));
        dialog.findViewById(R.id.dialogBtnDonotRating).setOnClickListener(new e(this, dialog));
        dialog.show();
    }

    public void startActivity(Intent intent) {
        super.startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        vn.net.vac.base.c.k.a((Context) this).c(false);
    }

    public void startActivityForResult(Intent intent, int i) {
        super.startActivityForResult(intent, i);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        vn.net.vac.base.c.k.a((Context) this).c(false);
    }

    /* Access modifiers changed, original: protected */
    public void a(int i, String str) {
        this.l = findViewById(R.id.layoutHeaderWithText);
        p.a(this, this.l);
        ImageView imageView = (ImageView) findViewById(R.id.imageLeft);
        imageView.setImageResource(i);
        ((TextView) findViewById(R.id.lblTitle)).setText(str);
        imageView.setOnClickListener(new k());
        ((ImageView) findViewById(R.id.imageHome)).setOnClickListener(new l());
    }

    /* Access modifiers changed, original: protected */
    public void a(int i, int i2) {
        this.l = findViewById(R.id.layoutHeaderWithImage);
        p.a(this, this.l);
        ImageView imageView = (ImageView) findViewById(R.id.imageLeft);
        imageView.setImageResource(i);
        ((ImageView) findViewById(R.id.imageTitle)).setImageResource(i2);
        imageView.setOnClickListener(new m());
    }

    /* Access modifiers changed, original: protected */
    public void a(int i, String str, int i2) {
        this.l = findViewById(R.id.layoutHeaderLichVanNien);
        ImageView imageView = (ImageView) findViewById(R.id.imageLeft);
        if (i == 0) {
            imageView.setVisibility(4);
        } else {
            imageView.setVisibility(0);
            imageView.setImageResource(i);
            imageView.setOnClickListener(new n());
        }
        ((TextView) findViewById(R.id.lblTitle)).setText(str);
        ImageView imageView2 = (ImageView) findViewById(R.id.imageRight);
        if (i2 == 0) {
            imageView2.setVisibility(8);
            return;
        }
        imageView2.setVisibility(0);
        imageView2.setImageResource(i2);
        imageView2.setOnClickListener(new o());
    }

    public void a(Class<?> cls) {
        startActivity(new Intent(this, cls));
    }

    /* Access modifiers changed, original: protected */
    public void a(String str) {
        Toast.makeText(this, str, 0).show();
    }

    /* Access modifiers changed, original: 0000 */
    public void a(String str, String str2) {
        Dialog dialog = new Dialog(this, R.style.FullHeightDialog);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setContentView(R.layout.layout_dialog_title_content);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialog.getWindow().setLayout(-1, -2);
        ((TextView) dialog.findViewById(R.id.dialogTitle)).setText(str);
        ((TextView) dialog.findViewById(R.id.dialogContent)).setText(str2);
        ((TextView) dialog.findViewById(R.id.dialogBtnClose)).setText("OK");
        vn.net.vac.base.c.g.a((Context) this, 16, (TextView) dialog.findViewById(R.id.dialogTitle));
        vn.net.vac.base.c.g.a((Context) this, 17, (TextView) dialog.findViewById(R.id.dialogContent));
        vn.net.vac.base.c.g.a((Context) this, 17, (TextView) dialog.findViewById(R.id.dialogBtnClose));
        dialog.findViewById(R.id.dialogBtnClose).setOnClickListener(new j(this, dialog));
        dialog.show();
    }
}
