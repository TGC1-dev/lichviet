package vn.net.vac.base.view.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.h2team.android.lichvannien.R;
import java.util.List;
import vn.net.vac.base.c.g;
import vn.net.vac.base.dbmanager.model.a;

/* compiled from: ListViewNgayLeAdapter */
public class b extends ArrayAdapter<a> {
    private List<a> a;
    private Context b;

    public b(Context context, List<a> list) {
        super(context, 0, list);
        this.a = list;
        this.b = context;
    }

    public List<a> a() {
        return this.a;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        a aVar = (a) getItem(i);
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.layout_row_list_view_ngay_le, viewGroup, false);
        }
        ((TextView) view.findViewById(R.id.textViewNgayLeDay)).setText(aVar.a);
        g.a(this.b, 17, r7);
        ((TextView) view.findViewById(R.id.textViewNgayLeContent)).setText(aVar.b);
        g.a(this.b, 17, r1);
        return view;
    }
}
