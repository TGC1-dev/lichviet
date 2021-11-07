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
import vn.net.vac.base.c.e.a;
import vn.net.vac.base.c.h;
import vn.net.vac.base.c.i;
import vn.net.vac.base.dbmanager.model.XemBoi;

/* compiled from: ListViewXemBoiAdapter */
public class e extends ArrayAdapter<XemBoi> {
    private Context a;
    Typeface b;

    public e(Context context, List<XemBoi> list, Typeface typeface) {
        super(context, 0, list);
        this.a = context;
        this.b = typeface;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        XemBoi xemBoi = (XemBoi) getItem(i);
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.layout_row_list_view_xem_boi, viewGroup, false);
        }
        TextView textView = (TextView) view.findViewById(R.id.text_row_title);
        textView.setText(xemBoi.a);
        textView.setTypeface(this.b);
        textView = (TextView) view.findViewById(R.id.text_row_description);
        try {
            textView.setText(a.a(xemBoi.b, h.a(this.a).a()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        textView.setTypeface(this.b);
        ImageView imageView = (ImageView) view.findViewById(R.id.imgThumb);
        AssetManager assets = this.a.getAssets();
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("XemBoi/Thumb_Boi/");
            stringBuilder.append(xemBoi.d.replace(".jpg", "@2x.png"));
            imageView.setImageDrawable(Drawable.createFromStream(assets.open(stringBuilder.toString()), null));
            return view;
        } catch (IOException e2) {
            i.a(e2);
            return null;
        }
    }
}
