package vn.net.vac.base.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

public class ImageView1242_366 extends ImageView {
    public ImageView1242_366(Context context) {
        super(context);
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        i = getMeasuredWidth();
        setMeasuredDimension(i, (i * 373) / 1242);
    }

    public ImageView1242_366(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ImageView1242_366(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
