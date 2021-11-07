package vn.net.vac.base.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class View1242_311 extends LinearLayout {
    public View1242_311(Context context) {
        super(context);
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        i = getMeasuredWidth();
        setMeasuredDimension(i, (i * 311) / 1242);
    }

    public View1242_311(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public View1242_311(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
