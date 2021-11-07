package vn.net.vac.base.activity;

import android.app.Activity;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;
import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.anjlab.android.iab.v3.TransactionDetails;
import com.h2team.android.lichvannien.R;
import vn.net.vac.base.MyApplication;
import vn.net.vac.base.c.k;
import vn.net.vac.base.c.m;
import vn.net.vac.base.view.SquareImageView2;

public class LichVanNienMoRongActivity2 extends BaseActivity {
    private static String w;
    private static String x;
    private static String y;
    private com.anjlab.android.iab.v3.c n;
    @Bind({2131230779})
    ImageView o;
    @Bind({2131230780})
    ImageView p;
    @Bind({2131230777})
    ImageView q;
    @Bind({2131230781})
    ImageView r;
    @Bind({2131231014})
    RadioGroup s;
    @Bind({2131230797})
    SquareImageView2 t;
    Intent u;
    private boolean v;

    class b implements OnCheckedChangeListener {
        b() {
        }

        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            switch (i) {
                case R.id.radio12h /*2131231012*/:
                    k.a(LichVanNienMoRongActivity2.this).a(true);
                    return;
                case R.id.radio24h /*2131231013*/:
                    k.a(LichVanNienMoRongActivity2.this).a(false);
                    return;
                default:
                    return;
            }
        }
    }

    class c implements OnClickListener {
        final /* synthetic */ Dialog a;

        c(Dialog dialog) {
            this.a = dialog;
        }

        public void onClick(View view) {
            if (LichVanNienMoRongActivity2.this.n != null) {
                LichVanNienMoRongActivity2.this.n.a(LichVanNienMoRongActivity2.this, LichVanNienMoRongActivity2.w);
            }
            this.a.dismiss();
        }
    }

    class d implements OnClickListener {
        final /* synthetic */ Dialog a;

        d(LichVanNienMoRongActivity2 lichVanNienMoRongActivity2, Dialog dialog) {
            this.a = dialog;
        }

        public void onClick(View view) {
            this.a.dismiss();
        }
    }

    class e implements OnClickListener {
        e() {
        }

        public void onClick(View view) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            MyApplication myApplication = LichVanNienMoRongActivity2.this.m;
            if (elapsedRealtime - myApplication.f >= 1000) {
                myApplication.f = SystemClock.elapsedRealtime();
                LichVanNienMoRongActivity2.this.startActivity(new Intent(LichVanNienMoRongActivity2.this, LichVanNienLichNgayActivity2.class));
                LichVanNienMoRongActivity2.this.overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                LichVanNienMoRongActivity2.this.finish();
            }
        }
    }

    class f implements OnClickListener {
        f() {
        }

        public void onClick(View view) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            MyApplication myApplication = LichVanNienMoRongActivity2.this.m;
            if (elapsedRealtime - myApplication.f >= 1000) {
                myApplication.f = SystemClock.elapsedRealtime();
                LichVanNienMoRongActivity2.this.startActivity(new Intent(LichVanNienMoRongActivity2.this, LichVanNienLichThangActivity2.class));
                LichVanNienMoRongActivity2.this.overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                LichVanNienMoRongActivity2.this.finish();
            }
        }
    }

    class g implements OnClickListener {
        g() {
        }

        public void onClick(View view) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            MyApplication myApplication = LichVanNienMoRongActivity2.this.m;
            if (elapsedRealtime - myApplication.f >= 1000) {
                myApplication.f = SystemClock.elapsedRealtime();
                LichVanNienMoRongActivity2.this.startActivity(new Intent(LichVanNienMoRongActivity2.this, LichVanNienDoiNgayActivity2.class));
                LichVanNienMoRongActivity2.this.overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                LichVanNienMoRongActivity2.this.finish();
            }
        }
    }

    class a implements com.anjlab.android.iab.v3.c.c {
        a() {
        }

        public void a() {
        }

        public void a(String str, TransactionDetails transactionDetails) {
            LichVanNienMoRongActivity2.this.a("Thành công", "Giao dịch thành công!");
            k.a(LichVanNienMoRongActivity2.this).e();
            LichVanNienMoRongActivity2.this.t.setVisibility(8);
        }

        public void b() {
            LichVanNienMoRongActivity2.this.v = true;
            if (LichVanNienMoRongActivity2.this.n.c(LichVanNienMoRongActivity2.w)) {
                k.a(LichVanNienMoRongActivity2.this).e();
                LichVanNienMoRongActivity2.this.t.setVisibility(8);
            }
        }

        public void a(int i, Throwable th) {
            LichVanNienMoRongActivity2 lichVanNienMoRongActivity2 = LichVanNienMoRongActivity2.this;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Giao dịch không thành công. Mã lỗi: ");
            stringBuilder.append(Integer.toString(i));
            lichVanNienMoRongActivity2.a("Không thành công", stringBuilder.toString());
        }
    }

    private void s() {
        v();
        this.s.setOnCheckedChangeListener(new b());
    }

    private void t() {
        if (k.a((Context) this).c()) {
            this.s.check(R.id.radio12h);
        } else {
            this.s.check(R.id.radio24h);
        }
    }

    private void u() {
        vn.net.vac.base.c.g.a((Context) this, 17, (TextView) findViewById(R.id.lblChonGio));
        vn.net.vac.base.c.g.a((Context) this, 17, (TextView) findViewById(R.id.radio12h));
        vn.net.vac.base.c.g.a((Context) this, 17, (TextView) findViewById(R.id.radio24h));
    }

    private void v() {
        this.o.setOnClickListener(new e());
        this.p.setOnClickListener(new f());
        this.q.setOnClickListener(new g());
    }

    private void w() {
        this.r.setAlpha(1.0f);
        if (k.a((Context) this).d()) {
            this.t.setVisibility(8);
        } else {
            this.t.setVisibility(0);
        }
    }

    private void x() {
        if (!com.anjlab.android.iab.v3.c.a((Context) this)) {
            a("Không thể tiến hành giao dịch. Vui lòng nâng cấp Android Market/Play lên phiên bản >= 3.9.16");
        }
        if (!k.a((Context) this).d()) {
            this.n = new com.anjlab.android.iab.v3.c(this, x, y, new a());
        }
    }

    private void y() {
        String str = "android.intent.action.VIEW";
        String string = getString(R.string.author);
        StringBuilder stringBuilder;
        try {
            Intent intent = new Intent(str);
            stringBuilder = new StringBuilder();
            stringBuilder.append("market://search?q=pub:");
            stringBuilder.append(string);
            intent.setData(Uri.parse(stringBuilder.toString()));
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("https://play.google.com/store/search?q=pub:");
            stringBuilder.append(string);
            stringBuilder.append("&c=apps");
            startActivity(new Intent(str, Uri.parse(stringBuilder.toString())));
        }
    }

    private void z() {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", getString(R.string.content_share));
        intent.putExtra("android.intent.extra.SUBJECT", getString(R.string.app_name));
        startActivity(Intent.createChooser(intent, "Chia sẻ qua"));
    }

    @OnClick({2131230796})
    public void btn_boituongmao(View view) {
        this.u = new Intent(this, XemBoiActivity.class);
        this.u.putExtra("EXTRA_XEM_BOI_TYPE", vn.net.vac.base.activity.XemBoiActivity.b.XEM_TUONG_MAO);
        startActivity(this.u);
    }

    @OnClick({2131230797})
    public void btn_buy(View view) {
        q();
    }

    @OnClick({2131230798})
    public void btn_chiaseungdung(View view) {
        z();
    }

    @OnClick({2131230799})
    public void btn_danhgiaungdung(View view) {
        l();
    }

    @OnClick({2131230800})
    public void btn_giaimagiacmo(View view) {
        a(GiaiMaGiacMoActivity.class);
    }

    @OnClick({2131230801})
    public void btn_gieoque(View view) {
        a(GieoQueActivity.class);
    }

    @OnClick({2131230802})
    public void btn_gopyungdung(View view) {
        new m(this).a("[Android] [Lịch vạn niên] - Góp ý", "", getString(R.string.mail));
    }

    @OnClick({2131230803})
    public void btn_ngayle(View view) {
        a(NgayLeActivity.class);
    }

    @OnClick({2131230804})
    public void btn_nhipsinhhoc(View view) {
        a(NhipSinhHocActivity.class);
    }

    @OnClick({2131230805})
    public void btn_sukien(View view) {
        a("Đang phát triển");
    }

    @OnClick({2131230806})
    public void btn_thuocloban(View view) {
        a(ThuocLoBanActivity.class);
    }

    @OnClick({2131230807})
    public void btn_tuvi12chomsao(View view) {
        a(TuVi12ChomSaoActivity.class);
    }

    @OnClick({2131230808})
    public void btn_tuvi12congiap(View view) {
        a(TuVi12ConGiapActivity.class);
    }

    @OnClick({2131230809})
    public void btn_tuvitrondoi(View view) {
        a(TuViTronDoiActivity.class);
    }

    @OnClick({2131230810})
    public void btn_ungdung(View view) {
        y();
    }

    @OnClick({2131230811})
    public void btn_vankhan(View view) {
        a(VanKhanActivity.class);
    }

    @OnClick({2131230812})
    public void btn_xem_huongnha(View view) {
        a(XemHuongNhaActivity.class);
    }

    @OnClick({2131230813})
    public void btn_xem_tuoi_xaynha(View view) {
        a(XemtuoiXaynhaActivity.class);
    }

    @OnClick({2131230814})
    public void btn_xemboivui(View view) {
        this.u = new Intent(this, XemBoiActivity.class);
        this.u.putExtra("EXTRA_XEM_BOI_TYPE", vn.net.vac.base.activity.XemBoiActivity.b.XEM_BOI_VUI);
        startActivity(this.u);
    }

    @OnClick({2131230815})
    public void btn_xemphongthuy(View view) {
        a(KienThucPhongThuyActivity.class);
    }

    @OnClick({2131230816})
    public void btn_xemtuoixongnha(View view) {
        a(XongNhaActivity.class);
    }

    @OnClick({2131230817})
    public void btn_xuathanhdauxuan(View view) {
        a(XuatHanhActivity.class);
    }

    @OnClick({2131230775})
    public void doDanhgia(View view) {
        m();
    }

    @OnClick({2131230778})
    public void doGopy(View view) {
        o();
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

    public void onBackPressed() {
        n();
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_lich_van_nien_mo_rong2);
        ButterKnife.bind((Activity) this);
        w = getString(R.string.item_id);
        x = getString(R.string.public_key);
        x();
        w();
        t();
        s();
        u();
    }

    public void onDestroy() {
        com.anjlab.android.iab.v3.c cVar = this.n;
        if (cVar != null) {
            cVar.e();
        }
        super.onDestroy();
    }

    /* Access modifiers changed, original: protected */
    public void onResume() {
        super.onResume();
    }

    /* Access modifiers changed, original: protected */
    public void q() {
        Dialog dialog = new Dialog(this, R.style.FullHeightDialog);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.layout_dialog_remove_ads_new);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialog.getWindow().setLayout(-1, -2);
        vn.net.vac.base.c.g.a((Context) this, 16, (TextView) dialog.findViewById(R.id.dialogTitle));
        vn.net.vac.base.c.g.a((Context) this, 17, (TextView) dialog.findViewById(R.id.dialogExplain));
        vn.net.vac.base.c.g.a((Context) this, 17, (TextView) dialog.findViewById(R.id.dialogBtnPurchase));
        vn.net.vac.base.c.g.a((Context) this, 17, (TextView) dialog.findViewById(R.id.dialogBtnClose));
        dialog.findViewById(R.id.dialogBtnPurchase).setOnClickListener(new c(dialog));
        dialog.findViewById(R.id.dialogBtnClose).setOnClickListener(new d(this, dialog));
        dialog.show();
    }
}
