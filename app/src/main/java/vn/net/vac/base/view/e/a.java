package vn.net.vac.base.view.e;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.h2team.android.lichvannien.R;
import java.util.List;
import vn.net.vac.base.c.g;

/* compiled from: SpinnerTextAdapter */
public class a extends ArrayAdapter<b> {
    private Context a;
    private int b = -1;
    List<b> c = null;

    /* compiled from: SpinnerTextAdapter */
    private static class b {
        private TextView a;

        private b() {
        }

        public TextView a() {
            return this.a;
        }

        public void a(TextView textView) {
            this.a = textView;
        }
    }

    public a(Context context, List<b> list) {
        super(context, R.layout.spinner_selected_item, list);
        this.a = context;
        this.c = list;
    }

    public void a(int i) {
        this.b = i;
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = ((LayoutInflater) this.a.getSystemService("layout_inflater")).inflate(R.layout.spinner_list_item, viewGroup, false);
        }
        if (view.getTag() == null) {
            b bVar = new b();
            bVar.a((TextView) view.findViewById(R.id.texto));
            g.a(this.a, 10, (TextView) view.findViewById(R.id.texto));
            view.setTag(bVar);
        }
        if (i == this.b) {
            ((b) view.getTag()).a().setTextColor(Color.rgb(218, 32, 42));
        } else {
            ((b) view.getTag()).a().setTextColor(Color.parseColor("#000000"));
        }
        ((b) view.getTag()).a().setText(((b) this.c.get(i)).b());
        return view;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = ((LayoutInflater) this.a.getSystemService("layout_inflater")).inflate(R.layout.spinner_selected_item, null);
        }
        TextView textView = (TextView) view.findViewById(R.id.texto);
        textView.setText(((b) this.c.get(i)).b());
        g.a(this.a, 10, textView);
        textView.setGravity(17);
        return view;
    }
}
