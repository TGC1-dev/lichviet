package vn.net.vac.base.view;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.widget.Button;

public class AutoBgButton extends Button {

    private class a extends LayerDrawable {
        protected ColorFilter a = new LightingColorFilter(-3355444, 1);
        protected int b = 100;
        protected int c = 255;

        public a(AutoBgButton autoBgButton, Drawable drawable) {
            super(new Drawable[]{drawable});
        }

        public boolean isStateful() {
            return true;
        }

        /* Access modifiers changed, original: protected */
        public boolean onStateChange(int[] iArr) {
            Object obj = null;
            Object obj2 = null;
            for (int i : iArr) {
                if (i == 16842910) {
                    obj = 1;
                } else if (i == 16842919) {
                    obj2 = 1;
                }
            }
            mutate();
            if (obj != null && obj2 != null) {
                setColorFilter(this.a);
            } else if (obj == null) {
                setColorFilter(null);
                setAlpha(this.b);
            } else {
                setColorFilter(null);
                setAlpha(this.c);
            }
            invalidateSelf();
            return super.onStateChange(iArr);
        }
    }

    public AutoBgButton(Context context) {
        super(context);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(new a(this, drawable));
    }

    public AutoBgButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AutoBgButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
