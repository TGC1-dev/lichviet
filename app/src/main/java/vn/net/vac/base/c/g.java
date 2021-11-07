package vn.net.vac.base.c;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.github.mikephil.charting.charts.Chart;

/* compiled from: FontUtility */
public class g {
    private static Typeface a;
    private static Typeface b;
    private static Typeface c;
    private static Typeface d;
    private static Typeface e;
    private static Typeface f;
    private static Typeface g;
    private static Typeface h;

    public static Typeface a(Context context, int i) {
        switch (i) {
            case 10:
                if (a == null) {
                    a = Typeface.createFromAsset(context.getAssets(), "fonts/UTM_Gloria_1.ttf");
                }
                return a;
            case 11:
                if (b == null) {
                    b = Typeface.createFromAsset(context.getAssets(), "fonts/UVNVan.ttf");
                }
                return b;
            case 12:
                if (c == null) {
                    c = Typeface.createFromAsset(context.getAssets(), "fonts/UVNVan_R.ttf");
                }
                return c;
            case 13:
                if (d == null) {
                    d = Typeface.createFromAsset(context.getAssets(), "fonts/UTMOngDoGia.ttf");
                }
                return d;
            case 14:
                if (e == null) {
                    e = Typeface.createFromAsset(context.getAssets(), "fonts/UTMSwiss721BlackCondensed_1.ttf");
                }
                return e;
            case 15:
                if (f == null) {
                    f = Typeface.createFromAsset(context.getAssets(), "fonts/UVNLaXanh.ttf");
                }
                return f;
            case 16:
                if (g == null) {
                    g = Typeface.createFromAsset(context.getAssets(), "fonts/UTM Davida_1.ttf");
                }
                return g;
            case 17:
                if (f == null) {
                    f = Typeface.createFromAsset(context.getAssets(), "fonts/UVNBaiSau_R_0.TTF");
                }
                return f;
            case Chart.PAINT_LEGEND_LABEL /*18*/:
                if (h == null) {
                    h = Typeface.createFromAsset(context.getAssets(), "fonts/UVNBaiSau.TTF");
                }
                return h;
            default:
                return null;
        }
    }

    public static void b(Context context, int i, TextView... textViewArr) {
        for (TextView typeface : textViewArr) {
            typeface.setTypeface(a(context, i), 1);
        }
    }

    public static void a(Context context, int i, TextView... textViewArr) {
        for (TextView typeface : textViewArr) {
            typeface.setTypeface(a(context, i));
        }
    }

    public static void a(Context context, View view, int i) {
        Typeface a = a(context, i);
        try {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    a(context, viewGroup.getChildAt(i2), i);
                }
            } else if (view instanceof TextView) {
                ((TextView) view).setTypeface(a);
            }
        } catch (Exception unused) {
        }
    }
}
