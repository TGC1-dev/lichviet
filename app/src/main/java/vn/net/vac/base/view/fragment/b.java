package vn.net.vac.base.view.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.h2team.android.lichvannien.R;
import vn.net.vac.base.activity.NhipSinhHocActivity.o;
import vn.net.vac.base.c.g;

/* compiled from: NhipSinhHocPagerFragment */
public class b extends Fragment {
    TextView Y;
    TextView Z;
    TextView a0;
    TextView b0;
    TextView c0;
    TextView d0;
    TextView e0;
    private int f0;
    private o g0;

    public static b a(o oVar, int i) {
        b bVar = new b();
        Bundle bundle = new Bundle();
        bundle.putFloat("suc_khoe", oVar.a);
        bundle.putFloat("tinh_cam", oVar.b);
        bundle.putFloat("tri_tue", oVar.c);
        bundle.putFloat("tinh_than", oVar.d);
        bundle.putFloat("tham_my", oVar.e);
        bundle.putFloat("truc_giac", oVar.f);
        bundle.putInt("pos", i);
        bVar.m(bundle);
        return bVar;
    }

    private void b(View view) {
        g.a(view.getContext(), view, 10);
    }

    private void f0() {
        this.d0.setText(a(this.g0.f));
        this.c0.setText(a(this.g0.e));
        this.b0.setText(a(this.g0.d));
        this.a0.setText(a(this.g0.c));
        this.Z.setText(a(this.g0.b));
        this.Y.setText(a(this.g0.a));
        TextView textView = this.e0;
        o oVar = this.g0;
        textView.setText(a((((((oVar.a + oVar.b) + oVar.c) + oVar.d) + oVar.e) + oVar.f) / 6.0f));
    }

    public void c(Bundle bundle) {
        super.c(bundle);
        bundle = j();
        this.g0 = new o(bundle.getFloat("suc_khoe"), bundle.getFloat("tinh_cam"), bundle.getFloat("tri_tue"), bundle.getFloat("tinh_than"), bundle.getFloat("tham_my"), bundle.getFloat("truc_giac"));
        this.f0 = bundle.getInt("pos");
    }

    public int e0() {
        return this.f0;
    }

    private void c(View view) {
        this.Y = (TextView) view.findViewById(R.id.textSuckhoe);
        this.Y.setTextColor(vn.net.vac.base.c.b.a);
        this.Z = (TextView) view.findViewById(R.id.textTinhcam);
        this.Z.setTextColor(vn.net.vac.base.c.b.b);
        this.a0 = (TextView) view.findViewById(R.id.textTritue);
        this.a0.setTextColor(vn.net.vac.base.c.b.c);
        this.b0 = (TextView) view.findViewById(R.id.textTinhthan);
        this.b0.setTextColor(vn.net.vac.base.c.b.d);
        this.c0 = (TextView) view.findViewById(R.id.textThammy);
        this.c0.setTextColor(vn.net.vac.base.c.b.e);
        this.d0 = (TextView) view.findViewById(R.id.textTrucgiac);
        this.d0.setTextColor(vn.net.vac.base.c.b.f);
        this.e0 = (TextView) view.findViewById(R.id.textTrungbinh);
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view = (ViewGroup) layoutInflater.inflate(R.layout.fragment_nsh, viewGroup, false);
        c(view);
        f0();
        b(view);
        return view;
    }

    private String a(float f) {
        return String.format("%.0f %s", new Object[]{Float.valueOf(f), "%"});
    }

    public void a(o oVar) {
        this.g0 = oVar;
        f0();
    }
}
