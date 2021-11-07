package vn.net.vac.base.c;

import android.content.Context;
import android.view.View;
import com.h2team.android.lichvannien.R;

/* compiled from: WhiteColorBgUtility */
public class p {
    public static void a(Context context, View... viewArr) {
        for (View backgroundColor : viewArr) {
            backgroundColor.setBackgroundColor(context.getResources().getColor(R.color.white));
        }
    }
}
