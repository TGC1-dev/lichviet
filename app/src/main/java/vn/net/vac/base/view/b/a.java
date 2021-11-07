package vn.net.vac.base.view.b;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.SectionIndexer;
import android.widget.TextView;
import com.h2team.android.lichvannien.R;
import java.util.List;
import vn.net.vac.base.c.g;
import vn.net.vac.base.c.h;
import vn.net.vac.base.c.i;
import vn.net.vac.base.dbmanager.model.GiacMo;

/* compiled from: ListViewGiacMoAdapter */
public class a extends ArrayAdapter<GiacMo> implements SectionIndexer {
    private List<GiacMo> a;
    private Context b;
    Typeface c;
    private String d = "#ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    /* compiled from: ListViewGiacMoAdapter */
    class a implements OnClickListener {
        final /* synthetic */ GiacMo a;

        a(GiacMo giacMo) {
            this.a = giacMo;
        }

        public void onClick(View view) {
            a.this.a(this.a);
        }
    }

    /* compiled from: ListViewGiacMoAdapter */
    class b implements OnClickListener {
        final /* synthetic */ Dialog a;

        b(a aVar, Dialog dialog) {
            this.a = dialog;
        }

        public void onClick(View view) {
            this.a.dismiss();
        }
    }

    public a(Context context, List<GiacMo> list, Typeface typeface) {
        super(context, 0, list);
        this.a = list;
        this.b = context;
        this.c = typeface;
    }

    public int getPositionForSection(int i) {
        while (i >= 0) {
            for (int i2 = 0; i2 < getCount(); i2++) {
                if (i == 0) {
                    for (int i3 = 0; i3 <= 9; i3++) {
                        if (vn.net.vac.base.view.b.b.a.a(String.valueOf(((GiacMo) getItem(i2)).a.charAt(0)), String.valueOf(i3))) {
                            return i2;
                        }
                    }
                    continue;
                } else if (vn.net.vac.base.view.b.b.a.a(String.valueOf(((GiacMo) getItem(i2)).a.charAt(0)), String.valueOf(this.d.charAt(i)))) {
                    return i2;
                }
            }
            i--;
        }
        return 0;
    }

    public int getSectionForPosition(int i) {
        return 0;
    }

    public Object[] getSections() {
        String[] strArr = new String[this.d.length()];
        for (int i = 0; i < this.d.length(); i++) {
            strArr[i] = String.valueOf(this.d.charAt(i));
        }
        return strArr;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        GiacMo giacMo = (GiacMo) getItem(i);
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.layout_row_list_view_mo_so, viewGroup, false);
        }
        TextView textView = (TextView) view.findViewById(R.id.text_row_name);
        textView.setText(giacMo.a);
        textView.setTypeface(this.c);
        textView = (TextView) view.findViewById(R.id.text_row_description);
        try {
            textView.setText(vn.net.vac.base.c.e.a.a(giacMo.b, h.a(this.b).a()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        textView.setTypeface(this.c);
        view.setOnClickListener(new a(giacMo));
        return view;
    }

    public List<GiacMo> a() {
        return this.a;
    }

    private void a(GiacMo giacMo) {
        Dialog dialog = new Dialog(this.b, R.style.FullHeightDialog);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.layout_dialog_giac_mo);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialog.getWindow().setLayout(-1, -2);
        ((TextView) dialog.findViewById(R.id.dialogGiacMoName)).setText(giacMo.a);
        try {
            ((TextView) dialog.findViewById(R.id.dialogGiacMoDescription)).setText(vn.net.vac.base.c.e.a.a(giacMo.b, h.a(this.b).a()));
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
