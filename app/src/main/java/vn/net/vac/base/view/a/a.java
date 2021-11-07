package vn.net.vac.base.view.a;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.h2team.android.lichvannien.R;
import java.util.List;
import vn.net.vac.base.c.g;
import vn.net.vac.base.c.h;
import vn.net.vac.base.c.i;
import vn.net.vac.base.dbmanager.model.MoSo;

/* compiled from: ListViewMoSoAdapter */
public class a extends ArrayAdapter<MoSo> {
    private List<MoSo> a;
    private Context b;
    Typeface c;

    /* compiled from: ListViewMoSoAdapter */
    class a implements OnClickListener {
        final /* synthetic */ MoSo a;

        a(MoSo moSo) {
            this.a = moSo;
        }

        public void onClick(View view) {
            a.this.a(this.a);
        }
    }

    /* compiled from: ListViewMoSoAdapter */
    class b implements OnClickListener {
        final /* synthetic */ Dialog a;

        b(a aVar, Dialog dialog) {
            this.a = dialog;
        }

        public void onClick(View view) {
            this.a.dismiss();
        }
    }

    public a(Context context, List<MoSo> list, Typeface typeface) {
        super(context, 0, list);
        this.a = list;
        this.b = context;
        this.c = typeface;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        MoSo moSo = (MoSo) getItem(i);
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.layout_row_list_view_mo_so, viewGroup, false);
        }
        TextView textView = (TextView) view.findViewById(R.id.text_row_name);
        textView.setText(moSo.a);
        textView.setTypeface(this.c);
        textView = (TextView) view.findViewById(R.id.text_row_description);
        try {
            textView.setText(vn.net.vac.base.c.e.a.a(moSo.b, h.a(this.b).a()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        textView.setTypeface(this.c);
        view.setOnClickListener(new a(moSo));
        return view;
    }

    public List<MoSo> a() {
        return this.a;
    }

    private void a(MoSo moSo) {
        Dialog dialog = new Dialog(this.b, R.style.FullHeightDialog);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.layout_dialog_giac_mo);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialog.getWindow().setLayout(-1, -2);
        ((TextView) dialog.findViewById(R.id.dialogGiacMoName)).setText(moSo.a);
        try {
            TextView textView = (TextView) dialog.findViewById(R.id.dialogGiacMoDescription);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Số may mắn: ");
            stringBuilder.append(vn.net.vac.base.c.e.a.a(moSo.b, h.a(this.b).a()));
            textView.setText(stringBuilder.toString());
        } catch (Exception e) {
            i.a(e);
            ((TextView) dialog.findViewById(R.id.dialogGiacMoDescription)).setText("");
        }
        g.a(this.b, 17, (TextView) dialog.findViewById(R.id.dialogGiacMoName));
        g.a(this.b, 17, (TextView) dialog.findViewById(R.id.dialogGiacMoDescription));
        g.a(this.b, 17, (TextView) dialog.findViewById(R.id.dialogBtnClose));
        dialog.findViewById(R.id.dialogBtnClose).setOnClickListener(new b(this, dialog));
        dialog.show();
    }
}
