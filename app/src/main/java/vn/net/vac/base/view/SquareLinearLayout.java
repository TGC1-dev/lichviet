package vn.net.vac.base.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class SquareLinearLayout extends LinearLayout {
    public SquareLinearLayout(Context context) {
        super(context);
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        i = getMeasuredWidth();
        setMeasuredDimension(i, i);
    }

    public SquareLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SquareLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
