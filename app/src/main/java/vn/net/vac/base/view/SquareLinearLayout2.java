package vn.net.vac.base.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class SquareLinearLayout2 extends LinearLayout {
    public SquareLinearLayout2(Context context) {
        super(context);
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        i = getMeasuredWidth();
        i2 = getMeasuredHeight();
        if (i > i2) {
            setMeasuredDimension(i2, i2);
        } else {
            setMeasuredDimension(i, i);
        }
    }

    public SquareLinearLayout2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SquareLinearLayout2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
