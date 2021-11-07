package vn.net.vac.base.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class SquareView extends View {
    public SquareView(Context context) {
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

    public SquareView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SquareView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
