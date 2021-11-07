package vn.net.vac.base.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

public class View140_231 extends ImageView {
    public View140_231(Context context) {
        super(context);
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        i = getMeasuredHeight();
        setMeasuredDimension((i * 140) / 231, i);
    }

    public View140_231(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public View140_231(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
