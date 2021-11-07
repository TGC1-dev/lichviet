package vn.net.vac.base.activity;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.h2team.android.lichvannien.R;
import vn.net.vac.base.c.g;
import vn.net.vac.base.c.k;

public class ThuocLoBanActivity extends BaseActivity {
    final String n = ThuocLoBanActivity.class.getSimpleName();
    HorizontalScrollView o;
    TextView p;
    double q;
    double r;
    int s = 10000;
    int t = 100;
    double u;

    class a implements Runnable {
        a() {
        }

        public void run() {
            ThuocLoBanActivity thuocLoBanActivity = ThuocLoBanActivity.this;
            double height = (double) ((LinearLayout) thuocLoBanActivity.findViewById(R.id.llTwoImg52)).getHeight();
            ThuocLoBanActivity thuocLoBanActivity2 = ThuocLoBanActivity.this;
            double d = (double) thuocLoBanActivity2.t;
            Double.isNaN(height);
            Double.isNaN(d);
            thuocLoBanActivity.u = (height / d) - 0.019999999552965164d;
            LayoutParams layoutParams = ((ImageView) thuocLoBanActivity2.findViewById(R.id.img521)).getLayoutParams();
            ThuocLoBanActivity thuocLoBanActivity3 = ThuocLoBanActivity.this;
            double d2 = (double) thuocLoBanActivity3.s;
            d = thuocLoBanActivity3.u;
            Double.isNaN(d2);
            layoutParams.width = (int) (d2 * d);
            layoutParams = ((ImageView) thuocLoBanActivity3.findViewById(R.id.img522)).getLayoutParams();
            thuocLoBanActivity3 = ThuocLoBanActivity.this;
            d2 = (double) thuocLoBanActivity3.s;
            d = thuocLoBanActivity3.u;
            Double.isNaN(d2);
            layoutParams.width = (int) (d2 * d);
            layoutParams = ((ImageView) thuocLoBanActivity3.findViewById(R.id.img421)).getLayoutParams();
            thuocLoBanActivity3 = ThuocLoBanActivity.this;
            d2 = (double) thuocLoBanActivity3.s;
            d = thuocLoBanActivity3.u;
            Double.isNaN(d2);
            layoutParams.width = (int) (d2 * d);
            layoutParams = ((ImageView) thuocLoBanActivity3.findViewById(R.id.img422)).getLayoutParams();
            thuocLoBanActivity3 = ThuocLoBanActivity.this;
            d2 = (double) thuocLoBanActivity3.s;
            d = thuocLoBanActivity3.u;
            Double.isNaN(d2);
            layoutParams.width = (int) (d2 * d);
            layoutParams = ((ImageView) thuocLoBanActivity3.findViewById(R.id.img381)).getLayoutParams();
            thuocLoBanActivity3 = ThuocLoBanActivity.this;
            d2 = (double) thuocLoBanActivity3.s;
            d = thuocLoBanActivity3.u;
            Double.isNaN(d2);
            layoutParams.width = (int) (d2 * d);
            layoutParams = ((ImageView) thuocLoBanActivity3.findViewById(R.id.img382)).getLayoutParams();
            thuocLoBanActivity3 = ThuocLoBanActivity.this;
            d2 = (double) thuocLoBanActivity3.s;
            d = thuocLoBanActivity3.u;
            Double.isNaN(d2);
            layoutParams.width = (int) (d2 * d);
            thuocLoBanActivity3.q = (double) (thuocLoBanActivity3.o.getWidth() / 2);
        }
    }

    class b implements OnScrollChangedListener {
        b() {
        }

        public void onScrollChanged() {
            ThuocLoBanActivity thuocLoBanActivity = ThuocLoBanActivity.this;
            TextView textView = thuocLoBanActivity.p;
            Object[] objArr = new Object[2];
            double scrollX = (double) thuocLoBanActivity.o.getScrollX();
            thuocLoBanActivity = ThuocLoBanActivity.this;
            double d = thuocLoBanActivity.q;
            Double.isNaN(scrollX);
            objArr[0] = Double.valueOf(((scrollX + d) / thuocLoBanActivity.u) * thuocLoBanActivity.r);
            objArr[1] = " cm";
            textView.setText(String.format("%.2f%s", objArr));
        }
    }

    class c implements OnClickListener {
        final /* synthetic */ Dialog a;

        c(ThuocLoBanActivity thuocLoBanActivity, Dialog dialog) {
            this.a = dialog;
        }

        public void onClick(View view) {
            this.a.dismiss();
        }
    }

    private void b(String str, String str2) {
        Dialog dialog = new Dialog(this, R.style.FullHeightDialog);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.layout_dialog_title_content);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialog.getWindow().setLayout(-1, -2);
        ((TextView) dialog.findViewById(R.id.dialogTitle)).setText(str);
        ((TextView) dialog.findViewById(R.id.dialogContent)).setText(str2);
        g.a((Context) this, 16, (TextView) dialog.findViewById(R.id.dialogTitle));
        g.a((Context) this, 17, (TextView) dialog.findViewById(R.id.dialogContent));
        g.a((Context) this, 17, (TextView) dialog.findViewById(R.id.dialogBtnClose));
        dialog.findViewById(R.id.dialogBtnClose).setOnClickListener(new c(this, dialog));
        dialog.show();
    }

    private void r() {
        this.o.getViewTreeObserver().addOnScrollChangedListener(new b());
    }

    private void s() {
        this.r = 0.009999999776482582d;
    }

    private void t() {
        g.a((Context) this, 18, (TextView) findViewById(R.id.lblTitle));
        g.a((Context) this, 18, (TextView) findViewById(R.id.txtValue));
        g.a((Context) this, 17, (TextView) findViewById(R.id.txtThuocLoBan52));
        g.a((Context) this, 17, (TextView) findViewById(R.id.txtThuocLoBan42));
        g.a((Context) this, 17, (TextView) findViewById(R.id.txtThuocLoBan38));
    }

    private void u() {
        try {
            a(R.drawable.btn_back_2, "THƯỚC LỖ BAN", R.drawable.btn_chitiet_lvn);
            ((ImageView) findViewById(R.id.imageRight)).setPadding(0, 0, 5, 0);
            this.o = (HorizontalScrollView) findViewById(R.id.horizontalScrollView);
            this.p = (TextView) findViewById(R.id.txtValue);
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.mainLayoutThuocLoBan);
            this.p.post(new a());
        } catch (Exception e) {
            Log.i("ThuocLoBanActivity", e.toString());
        }
    }

    /* Access modifiers changed, original: protected */
    public void k() {
        Intent intent = new Intent(this, ThuocLoBanDetailActivity.class);
        intent.putExtra("EXTRA_VALUE", this.p.getText().toString().replace(" cm", ""));
        startActivity(intent);
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_thuoc_lo_ban);
        ButterKnife.bind((Activity) this);
        if (3 > k.a((Context) this).c(this.n)) {
            b("Thông Báo", "Chức năng Xem Thước Lỗ Ban sử dụng nhiều hình ảnh do vậy một số thiết bị có thể không hiển thị được hình ảnh thước lỗ ban. Nếu thiết bị của quý vị gặp phải tình trạng này, chúng tôi mong nhận được sự thông cảm từ quý vị. Xin cảm ơn!");
            k.a((Context) this).f(this.n);
        }
        u();
        s();
        r();
        t();
    }

    @OnClick({2131230776})
    public void q() {
        Intent intent = new Intent(this, WebviewGiaithichActivity.class);
        intent.putExtra("EXTRA_TAG", "TAG_TLB");
        startActivity(intent);
    }
}
