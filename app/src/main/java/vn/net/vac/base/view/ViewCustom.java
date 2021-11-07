package vn.net.vac.base.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import vn.net.vac.base.a;

public class ViewCustom extends LinearLayout {
    private int a;
    private int b;

    public ViewCustom(Context context) {
        this(context, null);
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        i = getMeasuredWidth();
        setMeasuredDimension(i, (this.a * i) / this.b);
    }

    public ViewCustom(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewCustom(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.ViewCustom);
        this.a = obtainStyledAttributes.getInt(0, 0);
        this.b = obtainStyledAttributes.getInt(1, 0);
        obtainStyledAttributes.recycle();
        setWillNotDraw(false);
    }
}
