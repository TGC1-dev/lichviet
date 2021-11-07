package vn.net.vac.base.view.viewpagerindicator;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager.j;
import b.e.e.e;
import b.e.e.q;
import com.h2team.android.lichvannien.R;

public class CirclePageIndicator extends View implements a {
    private float a;
    private final Paint b;
    private final Paint c;
    private ViewPager d;
    private j e;
    private int f;
    private int g;
    private float h;
    private int i;
    private int j;
    private boolean k;
    private boolean l;
    private int m;
    private float n;
    private int o;
    private boolean p;

    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new a();
        int a;

        static class a implements Creator<SavedState> {
            a() {
            }

            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        /* synthetic */ SavedState(Parcel parcel, a aVar) {
            this(parcel);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt();
        }
    }

    public CirclePageIndicator(Context context) {
        this(context, null);
    }

    private int c(int i) {
        int mode = MeasureSpec.getMode(i);
        i = MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return i;
        }
        ViewPager viewPager = this.d;
        if (viewPager == null) {
            return i;
        }
        int a = viewPager.getAdapter().a();
        float paddingLeft = (float) (getPaddingLeft() + getPaddingRight());
        float f = (float) (a * 2);
        float f2 = this.a;
        a = (int) (((paddingLeft + (f * f2)) + (((float) (a - 1)) * f2)) + 1.0f);
        return mode == Integer.MIN_VALUE ? Math.min(a, i) : a;
    }

    private int d(int i) {
        int mode = MeasureSpec.getMode(i);
        i = MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return i;
        }
        int paddingTop = (int) ((((this.a * 2.0f) + ((float) getPaddingTop())) + ((float) getPaddingBottom())) + 1.0f);
        return mode == Integer.MIN_VALUE ? Math.min(paddingTop, i) : paddingTop;
    }

    public void a(int i) {
        this.i = i;
        j jVar = this.e;
        if (jVar != null) {
            jVar.a(i);
        }
    }

    public void b(int i) {
        if (this.l || this.i == 0) {
            this.f = i;
            this.g = i;
            invalidate();
        }
        j jVar = this.e;
        if (jVar != null) {
            jVar.b(i);
        }
    }

    public int getFillColor() {
        return this.c.getColor();
    }

    public int getOrientation() {
        return this.j;
    }

    public int getPageColor() {
        return this.b.getColor();
    }

    public float getRadius() {
        return this.a;
    }

    /* Access modifiers changed, original: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ViewPager viewPager = this.d;
        if (viewPager != null) {
            int a = viewPager.getAdapter().a();
            if (a != 0) {
                if (this.f >= a) {
                    setCurrentItem(a - 1);
                    return;
                }
                int width;
                int paddingLeft;
                int paddingRight;
                int paddingTop;
                if (this.j == 0) {
                    width = getWidth();
                    paddingLeft = getPaddingLeft();
                    paddingRight = getPaddingRight();
                    paddingTop = getPaddingTop();
                } else {
                    width = getHeight();
                    paddingLeft = getPaddingTop();
                    paddingRight = getPaddingBottom();
                    paddingTop = getPaddingLeft();
                }
                float f = this.a;
                float f2 = 3.0f * f;
                float f3 = ((float) paddingTop) + f;
                float f4 = ((float) paddingLeft) + f;
                if (this.k) {
                    f4 += (((float) ((width - paddingLeft) - paddingRight)) / 2.0f) - ((((float) a) * f2) / 2.0f);
                }
                float f5 = this.a;
                for (paddingLeft = 0; paddingLeft < a; paddingLeft++) {
                    float f6 = (((float) paddingLeft) * f2) + f4;
                    if (this.j == 0) {
                        f = f3;
                    } else {
                        f = f6;
                        f6 = f3;
                    }
                    if (this.b.getAlpha() > 0) {
                        canvas.drawCircle(f6, f, f5, this.b);
                    }
                }
                float f7 = ((float) (this.l ? this.g : this.f)) * f2;
                if (!this.l) {
                    f7 += this.h * f2;
                }
                if (this.j == 0) {
                    f7 += f4;
                } else {
                    float f8 = f3;
                    f3 = f7 + f4;
                    f7 = f8;
                }
                canvas.drawCircle(f7, f3, this.a, this.c);
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        if (this.j == 0) {
            setMeasuredDimension(c(i), d(i2));
        } else {
            setMeasuredDimension(d(i), c(i2));
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        int i = savedState.a;
        this.f = i;
        this.g = i;
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.f;
        return savedState;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (super.onTouchEvent(motionEvent)) {
            return true;
        }
        ViewPager viewPager = this.d;
        int i = 0;
        if (viewPager == null || viewPager.getAdapter().a() == 0) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float c = e.c(motionEvent, e.a(motionEvent, this.o));
                    float f = c - this.n;
                    if (!this.p && Math.abs(f) > ((float) this.m)) {
                        this.p = true;
                    }
                    if (this.p) {
                        this.n = c;
                        if (this.d.e() || this.d.a()) {
                            this.d.b(f);
                        }
                    }
                } else if (action != 3) {
                    if (action == 5) {
                        action = e.a(motionEvent);
                        this.n = e.c(motionEvent, action);
                        this.o = e.b(motionEvent, action);
                    } else if (action == 6) {
                        action = e.a(motionEvent);
                        if (e.b(motionEvent, action) == this.o) {
                            if (action == 0) {
                                i = 1;
                            }
                            this.o = e.b(motionEvent, i);
                        }
                        this.n = e.c(motionEvent, e.a(motionEvent, this.o));
                    }
                }
            }
            if (!this.p) {
                int a = this.d.getAdapter().a();
                float width = (float) getWidth();
                float f2 = width / 2.0f;
                width /= 6.0f;
                if (this.f > 0 && motionEvent.getX() < f2 - width) {
                    if (action != 3) {
                        this.d.setCurrentItem(this.f - 1);
                    }
                    return true;
                } else if (this.f < a - 1 && motionEvent.getX() > f2 + width) {
                    if (action != 3) {
                        this.d.setCurrentItem(this.f + 1);
                    }
                    return true;
                }
            }
            this.p = false;
            this.o = -1;
            if (this.d.e()) {
                this.d.c();
            }
        } else {
            this.o = e.b(motionEvent, 0);
            this.n = motionEvent.getX();
        }
        return true;
    }

    public void setCentered(boolean z) {
        this.k = z;
        invalidate();
    }

    public void setCurrentItem(int i) {
        ViewPager viewPager = this.d;
        if (viewPager != null) {
            viewPager.setCurrentItem(i);
            this.f = i;
            invalidate();
            return;
        }
        throw new IllegalStateException("ViewPager has not been bound.");
    }

    public void setFillColor(int i) {
        this.c.setColor(i);
        invalidate();
    }

    public void setOnPageChangeListener(j jVar) {
        this.e = jVar;
    }

    public void setOrientation(int i) {
        if (i == 0 || i == 1) {
            this.j = i;
            requestLayout();
            return;
        }
        throw new IllegalArgumentException("Orientation must be either HORIZONTAL or VERTICAL.");
    }

    public void setPageColor(int i) {
        this.b.setColor(i);
        invalidate();
    }

    public void setRadius(float f) {
        this.a = f;
        invalidate();
    }

    public void setSnap(boolean z) {
        this.l = z;
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        ViewPager viewPager2 = this.d;
        if (viewPager2 != viewPager) {
            if (viewPager2 != null) {
                viewPager2.setOnPageChangeListener(null);
            }
            if (viewPager.getAdapter() != null) {
                this.d = viewPager;
                this.d.setOnPageChangeListener(this);
                invalidate();
                return;
            }
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
    }

    public CirclePageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.vpiCirclePageIndicatorStyle);
    }

    public CirclePageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new Paint(1);
        this.c = new Paint(1);
        this.n = -1.0f;
        this.o = -1;
        if (!isInEditMode()) {
            Resources resources = getResources();
            int color = resources.getColor(R.color.default_circle_indicator_page_color);
            int color2 = resources.getColor(R.color.default_circle_indicator_fill_color);
            int integer = resources.getInteger(R.integer.default_circle_indicator_orientation);
            float dimension = resources.getDimension(R.dimen.default_circle_indicator_radius);
            boolean z = resources.getBoolean(R.bool.default_circle_indicator_centered);
            boolean z2 = resources.getBoolean(R.bool.default_circle_indicator_snap);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vn.net.vac.base.a.CirclePageIndicator, i, 0);
            this.k = obtainStyledAttributes.getBoolean(2, z);
            this.j = obtainStyledAttributes.getInt(0, integer);
            this.b.setStyle(Style.FILL);
            this.b.setColor(obtainStyledAttributes.getColor(4, color));
            this.c.setStyle(Style.FILL);
            this.c.setColor(obtainStyledAttributes.getColor(3, color2));
            this.a = obtainStyledAttributes.getDimension(5, dimension);
            this.l = obtainStyledAttributes.getBoolean(6, z2);
            Drawable drawable = obtainStyledAttributes.getDrawable(1);
            if (drawable != null) {
                setBackgroundDrawable(drawable);
            }
            obtainStyledAttributes.recycle();
            this.m = q.a(ViewConfiguration.get(context));
        }
    }

    public void a(int i, float f, int i2) {
        this.f = i;
        this.h = f;
        invalidate();
        j jVar = this.e;
        if (jVar != null) {
            jVar.a(i, f, i2);
        }
    }
}
