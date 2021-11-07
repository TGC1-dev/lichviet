package vn.net.vac.base.view.a;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.h2team.android.lichvannien.R;
import java.io.IOException;
import java.util.List;
import vn.net.vac.base.c.i;
import vn.net.vac.base.dbmanager.model.Sao;

/* compiled from: ListViewSaoAdapter */
public class d extends ArrayAdapter<Sao> {
    private Context a;
    Typeface b;

    public d(Context context, List<Sao> list, Typeface typeface) {
        super(context, 0, list);
        this.a = context;
        this.b = typeface;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        Sao sao = (Sao) getItem(i);
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.layout_row_list_view_tu_vi_12_chom_sao, viewGroup, false);
        }
        TextView textView = (TextView) view.findViewById(R.id.text_row_title);
        textView.setText(sao.b);
        textView.setTypeface(this.b);
        textView = (TextView) view.findViewById(R.id.text_row_time);
        textView.setText(sao.c);
        textView.setTypeface(this.b);
        ImageView imageView = (ImageView) view.findViewById(R.id.imgThumb);
        AssetManager assets = this.a.getAssets();
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("TuVi12ChomSao/Thumbs/");
            stringBuilder.append(String.format("%s%d%s", new Object[]{"1sao", Long.valueOf(sao.a - 1), "@2x.png"}));
            imageView.setImageDrawable(Drawable.createFromStream(assets.open(stringBuilder.toString()), null));
            return view;
        } catch (IOException e) {
            i.a(e);
            return null;
        }
    }
}
