package vn.net.vac.base.view.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.h2team.android.lichvannien.R;
import vn.net.vac.base.c.g;

/* compiled from: GuideFragment */
public class a extends Fragment {
    int Y;
    String Z;
    String a0;

    public static a a(int i, String str, String str2) {
        a aVar = new a();
        Bundle bundle = new Bundle();
        bundle.putInt("res", i);
        bundle.putString("title", str);
        bundle.putString("content", str2);
        aVar.m(bundle);
        return aVar;
    }

    private void b(View view) {
        g.a(e(), 12, (TextView) view.findViewById(R.id.txtTitleGiaithich));
        g.a(e(), 12, (TextView) view.findViewById(R.id.txtContentGiaithich));
    }

    private void c(View view) {
        ((TextView) view.findViewById(R.id.txtTitleGiaithich)).setText(this.Z);
        ((TextView) view.findViewById(R.id.txtContentGiaithich)).setText(this.a0);
        ((ImageView) view.findViewById(R.id.imgGiaithichQuangcao)).setImageResource(this.Y);
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_guide, viewGroup, false);
        Bundle j = j();
        this.Y = j.getInt("res");
        this.Z = j.getString("title");
        this.a0 = j.getString("content");
        j.getInt("pos");
        c(inflate);
        b(inflate);
        return inflate;
    }
}
