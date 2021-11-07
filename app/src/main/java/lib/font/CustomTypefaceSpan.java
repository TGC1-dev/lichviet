package vn.net.vac.base.lib.font;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;

public class CustomTypefaceSpan extends TypefaceSpan {
    private Typeface a;

    private static void a(Paint paint, Typeface typeface) {
        paint.setTypeface(typeface);
    }

    public void updateDrawState(TextPaint textPaint) {
        a(textPaint, this.a);
    }

    public void updateMeasureState(TextPaint textPaint) {
        a(textPaint, this.a);
    }
}
