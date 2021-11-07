package vn.net.vac.base.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.TextView;

public class TextViewWithoutPaddings extends TextView {
    private final Paint a = new Paint();
    private final Rect b = new Rect();

    public TextViewWithoutPaddings(Context context) {
        super(context);
    }

    private String a() {
        String charSequence = getText().toString();
        int length = charSequence.length();
        this.a.setTextSize(getTextSize());
        this.a.getTextBounds(charSequence, 0, length, this.b);
        if (length == 0) {
            Rect rect = this.b;
            rect.right = rect.left;
        }
        return charSequence;
    }

    /* Access modifiers changed, original: protected */
    public void onDraw(Canvas canvas) {
        String a = a();
        Rect rect = this.b;
        int i = rect.left;
        int i2 = rect.bottom;
        rect.offset(-i, -rect.top);
        this.a.setAntiAlias(true);
        this.a.setColor(getCurrentTextColor());
        canvas.drawText(a, (float) (-i), (float) (this.b.bottom - i2), this.a);
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        a();
        i = this.b.width() + 1;
        Rect rect = this.b;
        setMeasuredDimension(i, (-rect.top) + rect.bottom);
    }

    public TextViewWithoutPaddings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TextViewWithoutPaddings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
