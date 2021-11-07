package vn.net.vac.base.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import vn.net.vac.base.a;

public class RotateLayout extends ViewGroup {
    private int a;
    private final Matrix b;
    private final Rect c;
    private final RectF d;
    private final RectF e;
    private final float[] f;
    private final float[] g;
    private boolean h;

    public RotateLayout(Context context) {
        this(context, null);
    }

    private static int a(int i) {
        return (i / 90) * 90;
    }

    /* Access modifiers changed, original: protected */
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.rotate((float) (-this.a), ((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.f[0] = motionEvent.getX();
        this.f[1] = motionEvent.getY();
        this.b.mapPoints(this.g, this.f);
        float[] fArr = this.g;
        motionEvent.setLocation(fArr[0], fArr[1]);
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        float[] fArr2 = this.f;
        motionEvent.setLocation(fArr2[0], fArr2[1]);
        return dispatchTouchEvent;
    }

    public int getAngle() {
        return this.a;
    }

    public View getView() {
        return getChildCount() > 0 ? getChildAt(0) : null;
    }

    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        invalidate();
        return super.invalidateChildInParent(iArr, rect);
    }

    /* Access modifiers changed, original: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.h || z) {
            RectF rectF = this.d;
            RectF rectF2 = this.e;
            rectF.set(0.0f, 0.0f, (float) (i3 - i), (float) (i4 - i2));
            this.b.setRotate((float) this.a, rectF.centerX(), rectF.centerY());
            this.b.mapRect(rectF2, rectF);
            rectF2.round(this.c);
            this.h = false;
        }
        View view = getView();
        if (view != null) {
            Rect rect = this.c;
            view.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        View view = getView();
        if (view == null) {
            super.onMeasure(i, i2);
        } else if (Math.abs(this.a % 180) == 90) {
            measureChild(view, i2, i);
            setMeasuredDimension(ViewGroup.resolveSize(view.getMeasuredHeight(), i), ViewGroup.resolveSize(view.getMeasuredWidth(), i2));
        } else {
            measureChild(view, i, i2);
            setMeasuredDimension(ViewGroup.resolveSize(view.getMeasuredWidth(), i), ViewGroup.resolveSize(view.getMeasuredHeight(), i2));
        }
    }

    public void setAngle(int i) {
        i = a(i);
        if (this.a != i) {
            this.a = i;
            this.h = true;
            requestLayout();
        }
    }

    public RotateLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RotateLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.b = new Matrix();
        this.c = new Rect();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new float[2];
        this.g = new float[2];
        this.h = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.RotateLayout);
        this.a = a(obtainStyledAttributes.getInt(0, 0));
        obtainStyledAttributes.recycle();
        setWillNotDraw(false);
    }
}
