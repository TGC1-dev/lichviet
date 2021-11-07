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
import vn.net.vac.base.dbmanager.model.PhongThuy;

/* compiled from: ListViewPhongThuyAdapter */
public class c extends ArrayAdapter<PhongThuy> {
    private List<PhongThuy> a;
    private Context b;
    Typeface c;

    public c(Context context, List<PhongThuy> list, Typeface typeface) {
        super(context, 0, list);
        this.a = list;
        this.b = context;
        this.c = typeface;
    }

    public List<PhongThuy> a() {
        return this.a;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        PhongThuy phongThuy = (PhongThuy) getItem(i);
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.layout_row_list_view_phong_thuy, viewGroup, false);
        }
        TextView textView = (TextView) view.findViewById(R.id.text_row_title);
        textView.setText(phongThuy.a);
        textView.setTypeface(this.c);
        ImageView imageView = (ImageView) view.findViewById(R.id.imgThumb);
        AssetManager assets = this.b.getAssets();
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("PhongThuy/Thumbs/");
            stringBuilder.append(phongThuy.c);
            imageView.setImageDrawable(Drawable.createFromStream(assets.open(stringBuilder.toString()), null));
            return view;
        } catch (IOException e) {
            i.a(e);
            return null;
        }
    }
}
