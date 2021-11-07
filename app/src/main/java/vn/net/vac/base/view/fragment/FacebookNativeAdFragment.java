package vn.net.vac.base.view.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import butterknife.ButterKnife;
import com.facebook.ads.AdChoicesView;
import com.facebook.ads.MediaView;
import com.facebook.ads.i;
import com.h2team.android.lichvannien.R;
import java.util.ArrayList;
import java.util.Arrays;
import vn.net.vac.base.c.k;
import vn.net.vac.base.utility.purchase.IabBroadcastReceiver;

public class FacebookNativeAdFragment extends Fragment implements com.facebook.ads.c, vn.net.vac.base.utility.purchase.IabBroadcastReceiver.a {
    static String h0;
    static String i0;
    vn.net.vac.base.utility.purchase.b Y;
    IabBroadcastReceiver Z;
    boolean a0 = false;
    private LinearLayout b0;
    private LinearLayout c0;
    private i d0;
    private AdChoicesView e0;
    vn.net.vac.base.utility.purchase.b.f f0 = new d();
    vn.net.vac.base.utility.purchase.b.d g0 = new e();

    class b implements OnTouchListener {
        b() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || view.getId() != R.id.txtWhyShowAds) {
                return false;
            }
            FacebookNativeAdFragment.this.g0();
            return true;
        }
    }

    class c implements OnClickListener {
        final /* synthetic */ Dialog a;

        c(FacebookNativeAdFragment facebookNativeAdFragment, Dialog dialog) {
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
            FacebookNativeAdFragment.this.e0();
            this.a.dismiss();
        }
    }

    class g implements OnClickListener {
        final /* synthetic */ Dialog a;

        g(Dialog dialog) {
            this.a = dialog;
        }

        public void onClick(View view) {
            try {
                FacebookNativeAdFragment.this.Y.a(FacebookNativeAdFragment.this.f0);
            } catch (vn.net.vac.base.utility.purchase.b.c unused) {
                FacebookNativeAdFragment facebookNativeAdFragment = FacebookNativeAdFragment.this;
                facebookNativeAdFragment.b(facebookNativeAdFragment.a((int) R.string.app_name), "Error querying inventory. Another async operation in progress.");
            }
            this.a.dismiss();
        }
    }

    class h implements OnClickListener {
        final /* synthetic */ Dialog a;

        h(FacebookNativeAdFragment facebookNativeAdFragment, Dialog dialog) {
            this.a = dialog;
        }

        public void onClick(View view) {
            this.a.dismiss();
        }
    }

    class a implements vn.net.vac.base.utility.purchase.b.e {
        a() {
        }

        public void a(vn.net.vac.base.utility.purchase.c cVar) {
            if (cVar.c()) {
                FacebookNativeAdFragment facebookNativeAdFragment = FacebookNativeAdFragment.this;
                if (facebookNativeAdFragment.Y != null) {
                    facebookNativeAdFragment.Z = new IabBroadcastReceiver(facebookNativeAdFragment);
                    FacebookNativeAdFragment.this.e().registerReceiver(FacebookNativeAdFragment.this.Z, new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED"));
                    return;
                }
                return;
            }
            FacebookNativeAdFragment facebookNativeAdFragment2 = FacebookNativeAdFragment.this;
            String a = facebookNativeAdFragment2.a((int) R.string.app_name);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Problem setting up in-app billing: ");
            stringBuilder.append(cVar);
            facebookNativeAdFragment2.b(a, stringBuilder.toString());
        }
    }

    class d implements vn.net.vac.base.utility.purchase.b.f {
        d() {
        }

        public void a(vn.net.vac.base.utility.purchase.c cVar, vn.net.vac.base.utility.purchase.d dVar) {
            if (FacebookNativeAdFragment.this.Y != null) {
                String str = "Restore Purchase";
                if (cVar.b()) {
                    FacebookNativeAdFragment.this.b(str, "Restore the purchase info fail");
                    return;
                }
                vn.net.vac.base.utility.purchase.e b = dVar.b(FacebookNativeAdFragment.h0);
                FacebookNativeAdFragment facebookNativeAdFragment = FacebookNativeAdFragment.this;
                boolean z = b != null && facebookNativeAdFragment.a(b);
                facebookNativeAdFragment.a0 = z;
                FacebookNativeAdFragment facebookNativeAdFragment2 = FacebookNativeAdFragment.this;
                if (facebookNativeAdFragment2.a0) {
                    k.a(facebookNativeAdFragment2.e()).e();
                    FacebookNativeAdFragment.this.b(str, "Restore the purchase info successfully");
                }
            }
        }
    }

    class e implements vn.net.vac.base.utility.purchase.b.d {
        e() {
        }

        public void a(vn.net.vac.base.utility.purchase.c cVar, vn.net.vac.base.utility.purchase.e eVar) {
            if (FacebookNativeAdFragment.this.Y != null) {
                String str = "Purchase";
                if (cVar.b()) {
                    FacebookNativeAdFragment facebookNativeAdFragment = FacebookNativeAdFragment.this;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Purchase fail. ");
                    stringBuilder.append(cVar);
                    facebookNativeAdFragment.b(str, stringBuilder.toString());
                } else if (FacebookNativeAdFragment.this.a(eVar)) {
                    if (eVar.c().equals(FacebookNativeAdFragment.h0)) {
                        FacebookNativeAdFragment.this.a(str, "Purchase successfully!");
                        k.a(FacebookNativeAdFragment.this.e()).e();
                    }
                } else {
                    FacebookNativeAdFragment facebookNativeAdFragment2 = FacebookNativeAdFragment.this;
                    facebookNativeAdFragment2.b(facebookNativeAdFragment2.a((int) R.string.app_name), "Error purchasing. Authenticity verification failed.");
                }
            }
        }
    }

    private void g0() {
        f0();
    }

    public void N() {
        super.N();
        ButterKnife.unbind(this);
        if (this.Z != null) {
            e().unregisterReceiver(this.Z);
        }
        vn.net.vac.base.utility.purchase.b bVar = this.Y;
        if (bVar != null) {
            bVar.b();
            this.Y = null;
        }
    }

    public void a(com.facebook.ads.a aVar, com.facebook.ads.b bVar) {
    }

    public void b(com.facebook.ads.a aVar) {
    }

    /* Access modifiers changed, original: 0000 */
    public void b(String str, String str2) {
        a(str, str2);
    }

    public void c() {
        try {
            this.Y.a(this.f0);
        } catch (vn.net.vac.base.utility.purchase.b.c unused) {
            b(a((int) R.string.app_name), "Error querying inventory. Another async operation in progress.");
        }
    }

    public void d(com.facebook.ads.a aVar) {
    }

    public void e0() {
        try {
            this.Y.a(e(), h0, 10001, this.g0, i0);
        } catch (vn.net.vac.base.utility.purchase.b.c unused) {
            b(a((int) R.string.app_name), "Error launching purchase flow. Another async operation in progress.");
        }
    }

    /* Access modifiers changed, original: protected */
    public void f0() {
        Dialog dialog = new Dialog(e(), R.style.FullHeightDialog);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.layout_dialog_remove_ads);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialog.getWindow().setLayout(-1, -2);
        vn.net.vac.base.c.g.a(e(), 12, (TextView) dialog.findViewById(R.id.dialogTitle));
        vn.net.vac.base.c.g.a(e(), 12, (TextView) dialog.findViewById(R.id.dialogBtnPurchase));
        vn.net.vac.base.c.g.a(e(), 12, (TextView) dialog.findViewById(R.id.dialogBtnRestorePurchase));
        vn.net.vac.base.c.g.a(e(), 12, (TextView) dialog.findViewById(R.id.dialogBtnClose));
        dialog.findViewById(R.id.dialogBtnPurchase).setOnClickListener(new f(dialog));
        dialog.findViewById(R.id.dialogBtnRestorePurchase).setOnClickListener(new g(dialog));
        dialog.findViewById(R.id.dialogBtnClose).setOnClickListener(new h(this, dialog));
        dialog.show();
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.layout_fragment_facebook_native_ad, viewGroup, false);
        ButterKnife.bind((Object) this, inflate);
        this.b0 = (LinearLayout) inflate.findViewById(R.id.nativeAdContainer);
        this.c0 = (LinearLayout) ((LayoutInflater) e().getSystemService("layout_inflater")).inflate(R.layout.layout_facebook_native_ad_unit, this.b0);
        ((LinearLayout) this.c0.findViewById(R.id.adUnit)).setVisibility(8);
        this.d0 = new i(e(), e().getResources().getString(R.string.facebook_native_ad_placement));
        this.d0.a((com.facebook.ads.c) this);
        com.facebook.ads.d.a(new ArrayList());
        this.d0.q();
        vn.net.vac.base.c.g.a(e(), inflate.findViewById(R.id.fragment_facebook_ad), 12);
        h0 = a((int) R.string.item_id);
        i0 = a((int) R.string.play_load);
        this.Y = new vn.net.vac.base.utility.purchase.b(e(), a((int) R.string.public_key));
        this.Y.a(false);
        this.Y.a(new a());
        return inflate;
    }

    public void a(com.facebook.ads.a aVar) {
        com.facebook.ads.a aVar2 = this.d0;
        if (aVar2 != null && aVar2 == aVar) {
            aVar2.s();
            a(this.d0, this.c0, e());
            if (this.e0 == null) {
                this.e0 = new AdChoicesView(e(), this.d0, true);
                ((LinearLayout) this.c0.findViewById(R.id.AdChoicesView)).addView(this.e0, 0);
            }
            this.d0.a(new b());
        }
    }

    public static void a(i iVar, View view, Context context) {
        ImageView imageView = (ImageView) view.findViewById(R.id.nativeAdIcon);
        TextView textView = (TextView) view.findViewById(R.id.nativeAdTitle);
        MediaView mediaView = (MediaView) view.findViewById(R.id.nativeAdMedia);
        Button button = (Button) view.findViewById(R.id.nativeAdCallToAction);
        TextView textView2 = (TextView) view.findViewById(R.id.txtCotheBanQuantam);
        TextView textView3 = (TextView) view.findViewById(R.id.txtWhyShowAds);
        TextView textView4 = (TextView) view.findViewById(R.id.txtAdChoices);
        ((TextView) view.findViewById(R.id.nativeAdSocialContext)).setText(iVar.h());
        button.setText(iVar.i());
        button.setVisibility(0);
        textView.setText(iVar.n());
        textView3.setVisibility(0);
        textView2.setVisibility(0);
        textView2.setText("CÓ THỂ BẠN QUAN TÂM");
        textView3.setText("XÓA QUẢNG CÁO");
        i.a(iVar.m(), imageView);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.adUnit);
        if (!k.a(context).d()) {
            linearLayout.setVisibility(0);
        }
        com.facebook.ads.i.f l = iVar.l();
        int c = l.c();
        int a = l.a();
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        double d = (double) i;
        double d2 = (double) c;
        Double.isNaN(d);
        Double.isNaN(d2);
        d /= d2;
        double d3 = (double) a;
        Double.isNaN(d3);
        mediaView.setLayoutParams(new LayoutParams(i, Math.min((int) (d * d3), i2 / 3)));
        mediaView.setNativeAd(iVar);
        iVar.a(view, Arrays.asList(new View[]{button, mediaView, textView3}));
    }

    /* Access modifiers changed, original: 0000 */
    public void a(String str, String str2) {
        Dialog dialog = new Dialog(e(), R.style.FullHeightDialog);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setContentView(R.layout.layout_dialog_title_content);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialog.getWindow().setLayout(-1, -2);
        ((TextView) dialog.findViewById(R.id.dialogTitle)).setText(str);
        ((TextView) dialog.findViewById(R.id.dialogContent)).setText(str2);
        ((TextView) dialog.findViewById(R.id.dialogBtnClose)).setText("OK");
        vn.net.vac.base.c.g.a(e(), 12, (TextView) dialog.findViewById(R.id.dialogTitle));
        vn.net.vac.base.c.g.a(e(), 12, (TextView) dialog.findViewById(R.id.dialogContent));
        vn.net.vac.base.c.g.a(e(), 12, (TextView) dialog.findViewById(R.id.dialogBtnClose));
        dialog.findViewById(R.id.dialogBtnClose).setOnClickListener(new c(this, dialog));
        dialog.show();
    }

    /* Access modifiers changed, original: 0000 */
    public boolean a(vn.net.vac.base.utility.purchase.e eVar) {
        return i0.equals(eVar.a());
    }

    public void a(int i, int i2, Intent intent) {
        vn.net.vac.base.utility.purchase.b bVar = this.Y;
        if (!(bVar == null || bVar.a(i, i2, intent))) {
            super.a(i, i2, intent);
        }
    }
}
